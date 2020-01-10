package com.eomcs.generic.ex01;

public class Exam0130 {
  static class A<X,Y,Z> {
    X v1;
    Y v2;
    Z v3;
  }

  // 자바에서 제안하는 "타입 파라미터"의 이름으로 정의한다면,
  static class A2<T,S,U> {
    T s1;
    S s2;
    U s3;
  }
  public static void main(String[] args) {
    A<String, Integer, Member> obj = new A<>();
    
    obj.v1 = new String();
    // obj.v2 = new Member();
    obj.v2 = new Integer(0);
    //obj.v3 = new String();
    obj.v3 = new Member(null, 0);
  }
}
