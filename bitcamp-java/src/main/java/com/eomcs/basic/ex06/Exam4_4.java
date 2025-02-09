package com.eomcs.basic.ex06;

import java.util.ArrayList;

//# 흐름 제어문 - for 반복문과 컬렉션
//
public class Exam4_4 {
  public static void main(String[] args) {
    // 배열은 같은 타입의 값만 보관할 수 있지만
    // 컬렉션은 다른 타입의 값도 보관할 수 있다.
    // 
    // 배열은 크기가 고정되지만,
    // 컬렉션은 크기가 가변적이다.
    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);

    for (int i = 0; i < list.size(); i++) 
      System.out.println(list.get(i));

    System.out.println("----------------------");

    // for 문에 컬렉션도 적용할 수 있다.
    // for (변수 선언 : 컬렉션객체) 문장;
    // 오브젝트로 출력을 해야함 => 다양한 값이 들어 있으니깐
    for (Object value : list) 
      System.out.println(value);
  }
}
