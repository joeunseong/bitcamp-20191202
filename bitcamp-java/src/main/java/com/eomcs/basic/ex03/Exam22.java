package com.eomcs.basic.ex03;

public class Exam22 {  //공개 클래스인 경우 클래스명과 파일명은 꼭 같아야 함
  public static void main(String[] args) {
    //10진수 리터럴
    System.out.println(2_3500_0000);
    System.out.println(235_000_000);
    System.out.println(23_500_0000);
    //System.out.println(_2_3500_0000);


    //8진수 리터럴
    System.out.println(0144);
    System.out.println(0_144);
    System.out.println(01_44);
    //System.out.println(0144_);
    //System.out.println(_0144);

    //2진수
    System.out.println(0b0110_0100);
    //System.out.println(0b_01100100);
    //System.out.println(0b01100100_);
    //System.out.println(_0b01100100);


    //16진수
    System.out.println(0x00_64);
    //System.out.println(_0X0064);
    //System.out.println(0X0064_);
    //System.out.println(0X_0064);
    
  }
}