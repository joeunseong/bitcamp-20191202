// 람다(lambda) - 로컬 클래스
package com.eomcs.oop.ex12;

public class Exam0110 {

  static interface Player {
    void play();
  }

  public static void main(String[] args) {
    Player p1;

    // 로컬 클래스 사용
    class MyPlayer implements Player {
      @Override
      public void play() {
        System.out.println("실행!");
      }
    }
    p1 = new MyPlayer(); // 플레이어를 구현한 객체 = MyPlayer = 구현 객체 = 구현체
    p1.play();
  }
}


