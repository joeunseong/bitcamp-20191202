// 메소드 레퍼런스 - 생성자 레퍼런스
package com.eomcs.oop.ex12;

import java.util.ArrayList;
import java.util.List;

public class Exam0710 {

  static interface ListFactory {
    List create();
  }

  public static void main(String[] args) {

    // 인터페이스에 정의된 메소드가
    // 생성자의 형식과 일치하다면
    // 메소드 레포런스로 생서자를 지정할 수 있다.
    //
    ListFactory f1 = ArrayList::new;

    // 인터페이스의 메소드를 호출하면
    // 지정된 클래스의 인스턴스를 만든 후 생성자가 호출된다.
    List list = f1.create(); // new ArrayList();

    System.out.println(list instanceof ArrayList);
    System.out.println(list.getClass().getName());
  }
}

