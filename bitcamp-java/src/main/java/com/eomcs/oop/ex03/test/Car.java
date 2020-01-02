package com.eomcs.oop.ex03.test;

public class Car {
  // static을 붙이면 Car.on으로 쓸 수 있지만 여러 개의 자동차 정보를 저장하지 못함
  // =>한 개를 가지고 공유하기 때문에
  boolean on;
  int speed;
  String model;
  String maker;
  int distance;

  Engine engine;

  Car() {
    this.engine = new Engine(4, 16, 1980);
  }

  void start() {
    this.on = true;
  }

  void stop() {
    this.on = false;
  }

  void check() {
    if (this.engine.oilState == 0) { // Car클래스 안에 있기 때문에 this는 carmm
      this.engine.cleanOil(); // 변수가 아니라 메소드라서 가능
      System.out.println("자동차의 엔진 오일을 교환했습니다!");
    }
    System.out.println("자동차를 정비했습니다!");
  }
  /*
    engine클래스에 있는 oilState 변수는 engine 안에서만 값을 변경할 수 있음 
    void cleanOil() { this.engine.oilstate = 10;
    }
   */
}
