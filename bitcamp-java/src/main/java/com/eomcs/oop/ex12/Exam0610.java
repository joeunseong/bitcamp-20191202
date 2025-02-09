// 메소드 레퍼런스 - 인스턴스 메소드 레퍼런스
package com.eomcs.oop.ex12;

public class Exam0610 {
  static class Calculator {
    double rate;

    public Calculator(double rate) {
      this.rate = rate;
    }

    public double year(int money) { return money * rate / 100;}
    public double month(int money) {return money * rate / 100/12;}
    public double day(int money) {return money * rate / 100/ 365;}
  }

  static interface Interest {
    double compute(int money);
  }
  
  public static void main(String[] args) {
    // 메소드 한 개짜리 인터페이스의 구현체를 만들 때
    // 기존 인스턴스 메소드를 람다 구현체로 사용할 수 있다.
    // => 단 인터페이스에 선언된 메소드의 규격이 일치해야 한다.
    // => 보통 특정 인스턴스의 값을 가지고 작업해야할 경우에 이 방식을 사용한다.
    // => 규격? 파라미터 타입 및 개수, 리턴 타입
    // => 문법:
    // 인스턴스::메소드명
    Calculator 보통예금 = new Calculator(0.5);
    Calculator 정기예금 = new Calculator(1.5);
    Calculator 청년행복예금 = new Calculator(10);

    System.out.println("[보통예금]");
    Interest i1 = 보통예금::year;
    System.out.printf("년 이자: %.1f\n", i1.compute(10_0000_0000));
    
    i1 = 보통예금::month;
    System.out.printf("월 이자: %.1f\n", i1.compute(10_0000_0000));
    
    i1 = 보통예금::day;
    System.out.printf("일 이자: %.1f\n", i1.compute(10_0000_0000));
    
    System.out.println("-----------------------");
    
    System.out.println("[정기예금]");
    Interest i2 = 정기예금::year;
    System.out.printf("년 이자: %.1f\n", i2.compute(10_0000_0000));
    
    i2 = 정기예금::month;
    System.out.printf("월 이자: %.1f\n", i2.compute(10_0000_0000));
    
    i2 = 정기예금::day;
    System.out.printf("일 이자: %.1f\n", i2.compute(10_0000_0000));
  }
}

