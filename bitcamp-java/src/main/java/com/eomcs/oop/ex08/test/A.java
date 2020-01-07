package com.eomcs.oop.ex08.test;

// package member : 하지만 한 클래스 안에 여러 클래스를 만드는건 비추 | public이 붙지만 않으면 여러개 생성 가능
class A1  {
}

// package member
class A2 {
}

// package member class
public class A {
  // public이 붙지 않으면 파일명과 클래스명이 같지 않아도 됨
  // public이 붙지 않으면 이 클래스내에서만 사용 가능

  // nested class
  // => non-static nested class = inner class
  class X {}

  // static nested class
  static class X2 {}

  void m() {
    // local class
    class Y {}
    
    //Object를 상속받은 익명 클래스(anonymous class : 익명 클래스)
    Object obj = new Object() {
      @Override
      public String toString() {
        return "익명 클래스";
      }
    };

    
    
  }

}
