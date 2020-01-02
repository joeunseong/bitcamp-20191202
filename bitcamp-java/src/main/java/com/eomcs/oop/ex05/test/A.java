package com.eomcs.oop.ex05.test;

public class A {
  int v1;

  A() {
    //this.v1 =  100; // 호출한 생성자에 값을 저장
    this(100); // 현재 클래스에서 다른 생성자를 호출할 때
    System.out.println("A()");
  }

  A(int v1) {
    this.v1 = v1;
    System.out.println("A(int)");
  }
}
