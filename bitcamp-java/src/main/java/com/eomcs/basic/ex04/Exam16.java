package com.eomcs.basic.ex04;

public class Exam16 {
  public static void main(String[] args) {
    //변수의 종류
    //=>primitive data type(자바 원시 데이터 타입) 얘네만 값이 직접 들어가고 나머지는 주소에 저장
    byte b; //1바이트 크기를 갖는 메모리
    short s; //2
    int i; //4
    long l; //8
    
    float f; //4  유효자릿수 : 7자리
    double d; //8 유효자릿수 : 약 15자리

    boolean bool; //jvm에서 int로 취급

    char c; //2

    // => reference : 다른 메모리의 주소를 저장하는 변수
    String str;
    Thread t;
    java.sql.Date date;
    java.net.Socket socket; //네트워크 연결 정보
    int[] arr; 



  }
}