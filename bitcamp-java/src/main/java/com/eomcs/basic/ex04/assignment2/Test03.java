package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class Test03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력? ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int sum = 0;
    for (int i = num1; i <= num2; i++) {
      sum = sum + i;
    }
    System.out.printf("%d에서 %d까지의 합은 %d입니다.", num1, num2, sum);

    
    // StringTokenizer를 사용한 입력 처리
//    StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
//    System.out.println(st.nextToken());
//    System.out.println(st.nextToken());
//    System.out.println(st.nextToken());
//    st.nextToken();
  }

}
