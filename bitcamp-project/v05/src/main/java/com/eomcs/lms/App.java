package com.eomcs.lms;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
      //키보드에서 사용자가 입력한 값을 읽어 문자열이나 정수, 부동소수점 등으로 리턴하는 역할
      //매개수단(interface) -대화 수단,규칙
      //온풍기(객체).기능명()
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("번호는? ");
      String no = keyboard.nextLine(); //한줄을 입력할 때 까지 기다림(enter를 칠때까지)
      
      System.out.print("수업명? ");
      String title = keyboard.nextLine();
      
      System.out.print("설명? ");
      String description = keyboard.nextLine();
      
      System.out.print("시작일? ");
      String startDate = keyboard.nextLine();
      
      System.out.print("종료일? ");
      String endDate = keyboard.nextLine();
      
      System.out.print("총수업시간? ");
      String totalHours = keyboard.nextLine();
      
      System.out.print("일수업시간? ");
      String dayHours = keyboard.nextLine();
      
      System.out.println();
      
      /*
      System.out.println("번호: " + no);
      System.out.println("수업명: " + title);
      System.out.println("설명: " + description);
      System.out.println("기간: " + startDate + " ~ " + endDate);
      System.out.println("총수업시간: " + totalHours + "시간");   
      System.out.println("일수업시간: " + dayHours + "시간");
      */
      
      System.out.printf("번호: %s\n", no);
      System.out.printf("수업명: %s\n", title);
      System.out.printf("설명: %s\n", description);
      System.out.printf("기간: %s ~ %s\n", startDate, endDate);
      System.out.printf("총수업시간: %s 시간\n", totalHours);   
      System.out.printf("일수업시간: %s 시간\n", dayHours);
      
      keyboard.close();
    }
}








