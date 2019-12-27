package com.eomcs.oop.ex02.study;

public class Car {
  public static final int OIL = 1; //중복되는 값은 static으로 선언
  public static final int GAS = 2;
  
  String name; // static을 붙이면 클래스에서 한번 밖에 못씀
  String color; // 대신에 클래스에서 따로 선언을 하지 않아도 Car.name이런식으로 사용 가능
  int type;
  int speed;
  int energy;
  int power;
  int cleanLevel;

    void speedUp() {
      // Car this = 메소드를 호출할 때 넘겨준 인스턴스 주소;
    if (this.speed >= 100) {
      return;
    }
    this.speed += 10;
  }

  int comparePower(Car c) {
    if (this.power > c.power) {
      return -1;
    } else if (this.power == c.power) {
      return 0;
    } else {
      return 1;
    }
  }
}
