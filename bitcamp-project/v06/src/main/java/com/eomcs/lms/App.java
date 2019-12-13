package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] no = new int[100];
    String[] title = new String[100];
    String[] description = new String[100];
    Date[] startDate = new Date[100];
    Date[] endDate = new Date[100];
    int[] totalHours = new int[100];
    int[] dayHours = new int[100];

    int count = 0;

    for (int i = 0; i < 100; i++) {

      System.out.print("번호는? ");
      no[i] = keyboard.nextInt(); // 한줄을 입력할 때 까지 기다림(enter를 칠때까지)

      keyboard.nextLine(); // nextInt() 후에 남아있는 줄바꿈 기회를 제거한다.

      System.out.print("수업명? ");
      title[i] = keyboard.nextLine();

      System.out.print("설명? ");
      description[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      // "yyyy-mm-dd" 형태로 입력된 문자열을 날짜 정보로 바꾼다.
      startDate[i] = Date.valueOf(keyboard.next());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboard.next());

      System.out.print("총수업시간? ");
      totalHours[i] = keyboard.nextInt();

      System.out.print("일수업시간? ");
      dayHours[i] = keyboard.nextInt();
      count++;
      keyboard.nextLine();
      System.out.println();

      System.out.println("계속 입력하시겠습니까?(Y/n)");
      String answer = keyboard.nextLine();
      if (!answer.equalsIgnoreCase("y")) {
        break;
      }
    }
    
    keyboard.close();

    for(int i = 0; i < count; i++) {
    
    System.out.printf("번호: %d\n", no[i]);
    System.out.printf("수업명: %s\n", title[i]);
    System.out.printf("설명: %s\n", description[i]);
    System.out.printf("기간: %s ~ %s\n", startDate[i], endDate[i]);
    System.out.printf("총수업시간: %d 시간\n", totalHours[i]);
    System.out.printf("일수업시간: %d 시간\n", dayHours[i]);
    System.out.println();
    }
  }
}


