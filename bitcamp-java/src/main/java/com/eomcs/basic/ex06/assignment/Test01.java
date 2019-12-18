package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("입력? ");
    int num = scn.nextInt();
    int i = 0, j = 0;
    while (i++ <= num) {
      j=0;
      while(j++ < i)
        System.out.print("*");
      System.out.println();  
    }
    
    scn.close();
  }

}
// System.out.println("*");
// System.out.println("**");
// System.out.println("***");
// System.out.println("****");
// System.out.println("******");


// *
// **
// ***
// ****
// *****
