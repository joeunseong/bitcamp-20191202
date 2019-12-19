package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class prac01 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("밑변? ");
    int width =  scn.nextInt();
    int line = 0;
    while(line < width) {
      line++;
      int x = 0;
      while(x < line) {
        System.out.print("*");
        x++;
      }
      System.out.println();

    }
  }

}
