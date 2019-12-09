package com.eomcs.basic.ex03;

public class Exam41 {  
    //문자 리터럴
public static void main(String[] args) {
   //직접 문자를 작성할 수 있다/.
   // =>'문자'
    System.out.println('A');
    System.out.println('가');

    //UCS-2 코드 값으로 문자를 지정할 수 있다.
    //[ \ u][ucs-2 코드]
    System.out.println('\u4eba'); 
    System.out.println('\u0041'); //A 문자
    System.out.println('\u0030'); //0이라는 문자
    System.out.println('\u0025'); //% 문자
    System.out.println('\uac00'); //가 문자


  }
}