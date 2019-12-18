package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

public class Test04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.print("입력? ");
    // arr[0] = scanner.nextInt();
    // arr[1] = scanner.nextInt();
    // arr[2] = scanner.nextInt();
    // arr[3] = scanner.nextInt();
    // arr[4] = scanner.nextInt();

    // 굳이 저렇게 하나하나 안해도 for문 하나면 깔끔하게 할 수 있음
    for (int i = 0; i < 5; i++)
      arr[i] = scanner.nextInt();

    scanner.close();
    // 최소값을 구할 때는 int중에 가장 큰 값을 넣어서 그걸 비교하고
    // 최대값을 구할 때는 int중에 가장 작은 값을 넣어서 비교한다.
    int min = 21_0000_0000; // Integer.MAX_VALUE
    int max = -21_0000_0000; // Integer.MIN_VALUE

    for (int i = 0; i < 5; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.printf("최대값: %d\n", max);
    System.out.printf("최소값: %d", min);

    //min = no < min? no : min;(no<min이 참이면 no 아니면 min)
  }

}
