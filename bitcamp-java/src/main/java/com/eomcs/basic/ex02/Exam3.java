package com.eomcs.basic.ex02;

public class Exam3 {
  public static void main(String[] args) {
    System.out.println("애노테이션!");

  }
  
  @Override //<-이게 애노테이션 컴파일러에게 메서드를 재정희함을 알리는 명령어
  public String toString() {
    return "okok";
  }
}