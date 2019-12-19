package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    // 게시글 데이터를 저장할 메모리를 설계한다.
    // 클래스?
    // - 애플리케이션에서 다룰 특정 데이터(수업정보, 학생정보, 게시물, 제품정보 등)의
    // 메모리 구조를 설계하는 문법이다.
    // - 이렇게 개발자가 새롭게 정의한 데이터 타입을
    // "사용자 정의 데이터 타입"이라고 부른다.
    // - 즉 '클래스'는 '사용자 정의 데이터 타입'을 만들 때 사용하는 문법이다.
    class Lesson {
      int no;
      String title;
      String description;
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;
    }

    final int SIZE = 100;
    Lesson[] lessons = new Lesson[SIZE];

    String response;
    int count = 0;

    for (int i = 0; i < SIZE; i++) {
      Lesson lesson = new Lesson();

      System.out.print("번호는? ");
      lesson.no = keyboard.nextInt(); // 한줄을 입력할 때 까지 기다림(enter를 칠때까지)
      keyboard.nextLine(); // nextInt() 후에 남아있는 줄바꿈 기회를 제거한다.

      System.out.print("수업명? ");
      lesson.title = keyboard.nextLine();

      System.out.print("설명? ");
      lesson.description = keyboard.nextLine();

      System.out.print("시작일? ");
      lesson.startDate = Date.valueOf(keyboard.next());

      System.out.print("종료일? ");
      lesson.endDate = Date.valueOf(keyboard.next());

      System.out.print("총수업시간? ");
      lesson.totalHours = keyboard.nextInt();

      System.out.print("일수업시간? ");
      lesson.dayHours = keyboard.nextInt();
      keyboard.nextLine();
      lessons[i] = lesson;
      count++;

      System.out.print("계속 입력하시겠습니까?(Y/n)");
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    keyboard.close();

    for (int i = 0; i < count; i++) {
      Lesson lesson = lessons[i];
      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          lesson.no, lesson.title, lesson.startDate, lesson.endDate, lesson.totalHours);
    }
  }
}


