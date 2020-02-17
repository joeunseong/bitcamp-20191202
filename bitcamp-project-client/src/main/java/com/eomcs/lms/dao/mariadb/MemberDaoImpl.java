package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberDaoImpl implements MemberDao {

  @Override
  public int insert(Member member) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (Connection con = DriverManager.getConnection(//
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement()) {

      int result =
          stmt.executeUpdate("insert into lms_member(name, email, pwd, tel, photo)" + "values('"
              + member.getName() + "', '" + member.getEmail() + "','" + member.getPassword() + "',"
              + "'" + member.getTel() + "', '" + member.getPhoto() + "')");

      return result;
    }
  }

  @Override
  public List<Member> findAll() throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (
        // JDBC Driver를 이용하여 MariaDB에 접속한다.
        Connection con = DriverManager.getConnection(//
            "jdbc:mariadb://localhost:3306/studydb", "study", "1111");

        // MariaDB에 명령을 전달한 객체 준비
        Statement stmt = con.createStatement();

        // MariaDB에 lms_board 테이블에 있는 데이터를 가져올 도구를 준비
        ResultSet rs = stmt.executeQuery(//
            "select member_id, name, email, pwd, cdt, photo, tel from lms_member")) {

      ArrayList<Member> list = new ArrayList<>();

      // ResultSet 도구를 사용하여 데이터를 하나씩 가져온다.
      while (rs.next()) {// 데이터를 한 개 가져왔으면 true를 리턴한다.
        Member member = new Member();
        member.setNo(rs.getInt("member_id"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setPassword(rs.getString("pwd"));
        member.setRegisteredDate(rs.getDate("cdt"));
        member.setPhoto(rs.getString("photo"));
        member.setTel(rs.getString("tel"));
        list.add(member);
      }
      return list;
    }
  }

  @Override
  public Member findByNo(int no) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");

    try (Connection con = DriverManager.getConnection(//
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(//
            "select * from lms_member where member_id=" + no)) {

      if (rs.next()) {
        Member member = new Member();
        member.setNo(rs.getInt("member_id"));
        member.setName(rs.getString("name"));
        member.setEmail(rs.getString("email"));
        member.setPassword(rs.getString("pwd"));
        member.setRegisteredDate(rs.getDate("cdt"));
        member.setTel(rs.getString("tel"));
        member.setPhoto(rs.getString("photo"));
        return member;
      } else {
        return null;
      }
    }

  }

  @Override
  public int update(Member member) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");
    try (Connection con = DriverManager.getConnection(//
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement()) {
      int result =
          stmt.executeUpdate("update lms_member set name= '" + member.getName() + "', email='"
              + member.getEmail() + "', pwd='" + member.getPassword() + "', tel='" + member.getTel()
              + "', photo='" + member.getPhoto() + "' where member_id=" + member.getNo());

      return result;
    }
  }

  @Override
  public int delete(int no) throws Exception {
    Class.forName("org.mariadb.jdbc.Driver");
    try (Connection con = DriverManager.getConnection(//
        "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
        Statement stmt = con.createStatement()) {

      int result = stmt.executeUpdate("delete from lms_member where member_id=" + no);
      return result;
    }
  }
}
