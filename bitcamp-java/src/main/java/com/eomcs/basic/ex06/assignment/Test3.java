package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력? ");
    int width = scanner.nextInt();
    int i = 0, j = (width+1)/2-1, k=0;
    while (i++ < width) {
      if (i % 2 == 1) {
        while(j-- > 0) {
          System.out.println(" ");
        }
        while(k++ < i ) {
          System.out.println("*");
        }
        System.out.println();
      }
    }
  }
}

