package com.eomcs.lms;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호는?");
    String no = keyboard.nextLine();
    
    System.out.print("내용은?");
    String description = keyboard.nextLine();
    
    System.out.print("작성일은?");
    String date = keyboard.nextLine();
    
    System.out.print("조회수는?");
    String hit = keyboard.nextLine();
    
    System.out.println();
    
    System.out.printf("번호: %s\n", no);
    System.out.printf("내용: %s\n", description);
    System.out.printf("작성일: %s\n", date);
    System.out.printf("조회수: %s\n", hit);
    
    keyboard.close();
  }
}
