// 람다(lambda)
package com.eomcs.oop.ex12;

public class Exam0240 {

// 추상 메소드 한 개짜리인터페이스만 가능!
  static abstract class Player {
    public abstract void play();
  }
  public static void main(String[] args) {
    Player p1 = () -> System.out.println("Hello!");
    p1.play();
  }
}


