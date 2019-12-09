package com.eomcs.basic.ex03;

public class Exam1 {
  public static void main(String[] args) {
    //정수 리터럴
    System.out.println(78); //10진수 표기법
    //78이 정수 리터럴임
    System.out.println(+78); //양수 리터럴
    System.out.println(-78); //음수 리터럴

    System.out.println(0116); //8진수 표기법 맨 앞에 0이 8진수를 의미
    System.out.println(-0116); //8진수 표기법 

    System.out.println(0x4e); //16진수 표기법 맨 앞의 0x가 16진수를 의미
    System.out.println(-0x4e); //16진수 표기법

    System.out.println(0b01001110); //2진수 표기법 맨 앞의 0b    
    
    //부동소수점 리터럴
    System.out.println(3.14); //고정 소수점
    System.out.println(0.314e1); //부동 소수점 e1 10의 1승을 곱해라 = *10
    System.out.println(31.4e-1); //부동 소수점 -e1 -> 10의 -1승을 곱해라 

    //논리 리터럴
    System.out.println(true);
    System.out.println(false);

    //한 문자 리터럴
    System.out.println('A'); 
    System.out.println('가');

    //문자열 리터럴
    System.out.println("안녕하세요! 비트캠프!");   
  }

}