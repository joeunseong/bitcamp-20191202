// 람다(lambda)
package com.eomcs.oop.ex12;

public class Exam0230 {

  static interface Player {
    void play();

    void stop() {}
  }

  // 람다는 인터페이스의 추상 메소드가 2개 이상이면 안됨
  public static void main(String[] args) {
    Player p1 = () -> System.out.println("Hello!"); // 컴파일 오류!
    p1.play();
  }
}


