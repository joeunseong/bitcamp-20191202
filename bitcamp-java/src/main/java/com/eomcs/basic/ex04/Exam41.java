package com.eomcs.basic.ex04;

public class Exam41 {
  public static void main(String[] args) {
    // 문자 변수

    short s;
    char c;

    s = -32768;
    s = 32767;

    c = 0;
    c = 65535;

    char c1 = 65; 
    char c2 = 0x41;
    char c3 = 0b0100_0001;
    char c4 = 'A'; // A가 아니라 거기에 해당하는 문자에 대해서 정의 된 문자코드(유니코드)가 저장되고 그 해당되는 문자가 출력됨


    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);

    int i1 = 'A';
    i1 = i1 + 10;
    //System.out.println(i1); // 65 출력됨
    System.out.println((char)i1);  // K출력
 
    for (int i=65; i < 'A' + 26; i++) {
      System.out.print((char)i);
    }

    
    

  }
}