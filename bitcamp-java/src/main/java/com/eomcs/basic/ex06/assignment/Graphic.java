package com.eomcs.basic.ex06.assignment;

public class Graphic {

  static void drawLine(int length) {
    int x = 0;
    while (x++ < length) { // 라인 갯수에 따라서 별 개수 출력 1번줄이면 1개 2번째줄이면 2개...
      System.out.printf("*");
    }
  }
  
// 오버로딩
  static void drawLine(int length, char ch) {
    int x = 0;
    while (x++ < length) { // 라인 갯수에 따라서 별 개수 출력 1번줄이면 1개 2번째줄이면 2개...
      System.out.print(ch);
    }
  }
}
