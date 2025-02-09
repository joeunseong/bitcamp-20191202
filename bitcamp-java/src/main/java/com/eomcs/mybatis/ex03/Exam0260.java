// dynamic SQL 다루기 - <foreach> 사용법 II
package com.eomcs.mybatis.ex03;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam0260 {

  public static void main(String[] args) throws Exception {
    InputStream inputStream =
        Resources.getResourceAsStream("com/eomcs/mybatis/ex03/mybatis-config.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = factory.openSession();

    // 실행 예:
    // => 게시물 번호를 여러 개 지정하여 조회하기
    //

    HashMap<String, Object> params = new HashMap<>();

    Scanner keyScan = new Scanner(System.in);

    System.out.print("조회할 게시물 번호들(예: 1 6 8 10; 최대 5개)? ");
    String[] values = keyScan.nextLine().split(" ");

    ArrayList<Object> noList = new ArrayList<>();

    for (String value : values) {
      noList.add(value);
    }
    params.put("noList", noList);
    keyScan.close();


    List<Board> list = sqlSession.selectList("BoardMapper.select24", params);

    for (Board board : list) {
      System.out.printf("%d, %s, %s, %s, %d\n", //
          board.getNo(), //
          board.getTitle(), //
          board.getContent(), //
          board.getRegisteredDate(), //
          board.viewCount);
    }
    sqlSession.close();
  }

}


