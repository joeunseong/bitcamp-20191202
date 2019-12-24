package com.eomcs.basic.ex07.assignment;

import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("입력?");
    int n = keyboard.nextInt();
    keyboard.close();

    // n! 을 계산한다.
    int result = factorial(n);
    // 결과 값을 출력한다.
    System.out.printf("%d! = ", n);
    for (int i = 1; i <= n; i++) {
      System.out.printf("%d*", i);
    }
    System.out.printf("%d = ", n);
    System.out.println(result);

  }

  static int factorial(int n) {
    // 코드를 완성하시오!
    if (n == 1)
      return 1;

    return n * factorial(n - 1);

  }
}
