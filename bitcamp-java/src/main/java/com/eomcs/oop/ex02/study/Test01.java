package com.eomcs.oop.ex02.study;

public class Test01 {

  public static void main(String[] args) {
    Score s = new Score();
    
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    
    //Score.calculate(s);
    s.calculate(); //Score.class에서 static을 붙이지 않고 주소를 넘겨서 사용하는 방법
    System.out.println(s.sum);
    System.out.println(s.aver);
    
  }

}
