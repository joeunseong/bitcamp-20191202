package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import javax.swing.text.View;
import com.eomcs.lms.domain.Board;

public class BoardHandler {

  // 인스턴스 필드
  // => new 명령을 실행해야만 생성되는 변수이다.
  // => 개별적으로 관리되어야 하는 값일 경우 인스턴스 필드로 선언한다.
  //
  Board[] boards = new Board[BOARD_SIZE];
  int boardCount = 0;

  // 클래스 필드
  // => Method Area에 클래스 코드가 로딩될 때 자동 생성된다.
  // => 공통으로 사용할 값일 경우 클래스 필드로 선언한다.
  //
  static final int BOARD_SIZE = 100;// static을 붙이면 공유
  public static Scanner keyboard;

  // 클래스 메소드
  // => 인스턴스 없이 호출하는 메소드
  // =>인스턴스를 사용하려면 파라미터를 통해 호출할 때 외부에서 받아야 한다.
  public void addBoard() { // BoardHandle의 인스턴스 주소
    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    this.boards[this.boardCount++] = board;
    System.out.println("저장하였습니다.");

  }
  // 인스턴스 메소드
  // => 인스턴스가 있어야만 호출할 수 있는 메소드이다.
  // =>인스턴스를 사용하는 메소드인 경우 인스턴스 메소드로 선언하라.
  // => 호출할 때는 반드시 인스턴스 주소를 줘야한다.
  //    인스턴스주소.메소드명(      ;
  // =>이렇게 인스턴스의 변수 값을 다루는 메소드는
  //    "연산자(operation)"라 부를 수 있다.
  public void listBoard( ) { // BoardHandle의 인스턴스 주소
    for (int i = 0; i < this.boardCount; i++) {
      Board b = this.boards[i];
      System.out.printf("%d, %s, %s, %d\n", b.no, b.title, b.date, b.viewCount);
    }
  }

  public  void detailBoard() {
    System.out.print("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine(); // 숫자 뒤에 남은 공백 제거

    Board board = null;
    for (int i = 0; i < this.boardCount; i++) {
      if (this.boards[i].no == no) {
        board = this.boards[i];
        break;
      }
    }
    if (board == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return; // void일 때 실행을 중간에 멈추고 싶으면 return 쓰기
    }

    System.out.printf("번호: %d\n", board.no);
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("등록일: %s\n", board.date);
    System.out.printf("조회수: %d\n", board.viewCount);
  }
}
