package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
    int width = inputInt();
    int line = 0;
    while (line++ < width) {// 0부터 시작하면 <= 틀림 / <가 맞음
      drawLine(line);
      System.out.println();
    }
  }

  static int inputInt() {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    keyScan.close();
    return width;
  }

  static void drawLine(int length) {
    int x = 0;
    while (x++ < length) { // 라인 갯수에 따라서 별 개수 출력 1번줄이면 1개 2번째줄이면 2개...
      System.out.printf("*");
    }
  }

}
