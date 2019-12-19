package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int SIZE = 100;
    int[] no = new int[SIZE];
    String[] movieTitle = new String[SIZE];
    String[] review = new String[SIZE];
    Date[] updateDay = new Date[SIZE];
    int count = 0;
    int viewCount = 0;

    for (int i = 0; i < SIZE; i++) {
      count++;

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboard.nextLine());

      System.out.print("영화 제목?");
      movieTitle[i] = keyboard.nextLine();

      System.out.print("내용? ");
      review[i] = keyboard.nextLine();

      Date today = new Date(System.currentTimeMillis());
      updateDay[i] = today;

      System.out.print("계속 등록하시겠습니까?(Y/n)");
      String answer = keyboard.nextLine();
      if (!answer.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyboard.close();

    System.out.println();
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s\n",
          no[i], movieTitle[i], review[i], updateDay[i]);
    }
  }
}


