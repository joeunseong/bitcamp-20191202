package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;

public class BoardHandler {
  static class Board {
    int no;
    String title;
    Date date;
    int viewCount;
  }

  static final int BOARD_SIZE = 100;
  static Board[] boards = new Board[BOARD_SIZE];
  static int boardCount = 0;

  // 다른 패키지에 있는 클래스에서도 이 변수를 사용하게 하려면 공개해야 한다.
  public static Scanner keyboard;

  public static void addBoard() {
    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boards[boardCount++] = board;
    System.out.println("저장하였습니다.");

  }

  public static void listBoard() {
    for (int i = 0; i < boardCount; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", b.no, b.title, b.date, b.viewCount);
    }
  }
}
