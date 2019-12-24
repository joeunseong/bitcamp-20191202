package com.eomcs.basic.ex07.assignment;

import java.util.Scanner;

// 과제: 재귀호출을 이용하여 직삼각형을 출력하라.
// 실행)
// 밑변의 길이? 5
// *
// **
// ***
// ****
// *****
//
public class Test05 {
  public static void main(String[] args) {
    // 사용자로부터 밑변의 길이를 입력 받는다.
    Scanner keyboard = new Scanner(System.in);
    System.out.print("밑변? ");

    int base = keyboard.nextInt();
    keyboard.close();

    // 직삼각형을 출력한다.
    printTriangle(base);
  }

  static void printTriangle(int base) {
    if (base == 0)
      return;

    printTriangle(base - 1);

    for (int i = 0; i < base; i++) {
      System.out.print("*");
    }
    System.out.println();

  }
}


