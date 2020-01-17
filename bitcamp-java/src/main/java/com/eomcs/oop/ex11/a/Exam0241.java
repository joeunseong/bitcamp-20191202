// non-static nested class = inner class 응용 II
package com.eomcs.oop.ex11.a;

import java.util.ArrayList;
import java.util.List;

public class Exam0241 {
  public static void main(final String[] args) {
    final Musics2 m1 = new Musics2();
    m1.add("aaa.mp3");
    m1.add("bbb.mp3");
    m1.add("ccc.mp3");

    final Musics2.Player p1 = m1.createPlayer();
    final Musics2.Player p2 = m1.createPlayer();

    p1.play();
    p2.play();

    final Musics2 m2 = new Musics2();
    m2.add("xxx.mp3");
    m2.add("yyy.mp3");

    final Musics2.Player p3 = m2.createPlayer();

    p3.play();
  }
}


class Musics2 {

  class Player {
    public void play() {
      // 이 메소드가 호출되려면, Player 객체가 존재해야 한다.
      // Player 객체가 존재하려면, Musics 객체가 존재해야 한다.
      // 따라서 이 메소드가 호출될 때는 이미 Musics 객체가 존재한 상태이다.
      // 그 Musics 객체로 Player 객체를 만든 것이다.
      // 따라서 inner class의 객체는 항상 자신을 만든 객체의 주소를 보관한다.
      // => 바깥_클래스명.this 내장 변수에 보관한다.
      // => Player를 만든 Musics 객체를 사용하고 싶다면 "바깥_클래스명.this" 변수를 이용하라.
      //
      for (final String song : songs) {
        System.out.println(song);
      }
      System.out.println("-------------");
    }
  }

  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public Player createPlayer() {
    // return this.new Player(); // this를 생략할 수 있다.
    return new Player();
  }

  public void delete(final int index) {
    songs.remove(index);
  }
}
