// 람다(lambda)
package com.eomcs.oop.ex12;

public class Exam0220 {

  static interface Player {
    void play();

    default void stop() {}

    static String info() {
      return "OK!";
    }
  }

  public static void main(String[] args) {
    Player p1 = () -> System.out.println("Hello!");
    p1.play();
  }
}


