// local class - 로컬 클래스와 로컬 변수
package com.eomcs.oop.ex11.a;

public class Exam0351 {

  public static void main(final String[] args) {
    // 인스턴스 멤버는 반드시 인스턴스를 생성한 후에 사용할 수 있다.
    final Exam0351 obj = new Exam0351();
    obj.m1();
  }

  int iValue;

  void m1() {
    int a;
    a = 100; // 로컬 변수
    class A {
      void m1() {
        // final로 선언되지 않더라도 값이 한 번만 할당된 경우
        // "상수 변수로 간주"하고 메소드의 로컬 변수를 사용할 수 있다.
        System.out.println(a);
      }
    }

    final A obj = new A();
    obj.m1();
  }
}
