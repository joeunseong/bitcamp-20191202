package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력? ");
    int width = scanner.nextInt();
    int i = 0, j = 0;
    while (i++ < (width * 2)) {
      if (i < width) {
        j = 0;
        while (j++ < i) {
          System.out.printf("*");  
        }
        System.out.println();
      } 
      else {
     // 증가하는 변수 i, 이 부분에 들어오는 시점에 5부터 나머지 10까지 증가
        j = width*2-i;                  // j는 5 4 3 2 1이런식으로 감소시켜야함
        while(j-- > 0) {
          System.out.printf("*");
        }
        System.out.println();
      }
    }
    scanner.close();
  }



}
