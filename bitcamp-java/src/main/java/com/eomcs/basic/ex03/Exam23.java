package com.eomcs.basic.ex03;

public class Exam23 {
  public static void main(final String[] args) {
   //정수 리터럴(literal) - 메모리 크기와 유효 값 범위
   // 리터럴 : 4바이트(32bit,기본), 8바이트
   System.out.println(-2147483648); //-2의 31승 : 4바이트 최소 음수값
   System.out.println(2147483647); // 2의 31승 -1 : 4바이트 최대 양수값

   //System.out.println(-2147483649); //4바이트 메모리 크기 초과
   //System.out.println(2147483648); //4바이트 메모리 크기 초과

   //8바이트(64bit) 정수 리터럴
   //숫자 뒤에 접미사 L, l을 붙인다.
   System.out.println(-9_223_372_036_854_775_808L);   
   System.out.println(-9_223_372_036_854_775_808l);   
   System.out.println(9_223_372_036_854_775_807L);   
   System.out.println(9_223_372_036_854_775_807l);   

   System.out.println(100); //4바이트 정수 리터럴
   System.out.println(100L); //8바이트 정수 리터럴
   
  System.out.println(Integer.MIN_VALUE); //4바이트 최소 정수값
  System.out.println(Integer.MAX_VALUE); //4바이트 최대 정수값
  System.out.println(Long.MIN_VALUE); //8바이트 최소 정수값
  System.out.println(Long .MAX_VALUE); //8바이트 최대 정수값




  }
}