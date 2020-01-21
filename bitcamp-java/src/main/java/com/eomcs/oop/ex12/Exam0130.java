// 람다(lambda) - 파라미터
package com.eomcs.oop.ex12;

public class Exam0130 {

  static interface Player {
    void play(String name);
  }

  public static void main(String[] args) {
    // 메솓의 몸체에 한 문장만 있을 때 중괄호 생략할 수 있다.
    Player p1 = (String name) -> System.out.println("Hello!, " + name + "!");
    p1.play("홍길동");

    // 파라미터의 타입 생략 가능
    p1 = (name) -> System.out.println("Hello!, " + name + "!");
    p1.play("임꺽정");

    // 파라미터의 괄호 생략 가능
    p1 = name -> System.out.println("Hello!, " + name + "!");
    p1.play("유관순");
  }
}


