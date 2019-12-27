package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Review;

public class BoardHandler {

  // 인스턴스 필드
  // => new 명령을 실행해야만 생성되는 변수이다.
  // => 개별적으로 관리되어야 하는 값일 경우 인스턴스 필드로 선언한다.
  //
  Review[] boards;
  int boardCount = 0;

  // 이전까지 게시물 데이터를 입력 받을 때 키보드에서 입력 받았지만,
  // 향후 네트워크나 파일로부터도 입력 받을 수 있다.
  // 이런 경우를 대비하여 입력 데이터를 읽는 것을 keyboard로 한정하지 말자!
  // 또한 각 게시판마다 입력 받는 방식을 다르게 할 수 있도록 인스턴스 변수로 선언하자.
  Scanner input;

  // 클래스 필드
  // => Method Area에 클래스 코드가 로딩될 때 자동 생성된다.
  // => 공통으로 사용할 값일 경우 클래스 필드로 선언한다.
  //
  static final int BOARD_SIZE = 100;// static을 붙이면 공유

  // 생성자(construtor)
  // => 인스턴스를 생성할 때 반드시 호출되는 메소드
  // => new 명령을 실행할 때, 호출할 생성자를 지정할 수 있다.
  // => 주로 의존 객체를 초기화 시키는 코드를 넣는다.
  // => 생성자는 리턴 값이 없고, 클래스 이름과 같은 이름으로 메소드를 정의한다.
  // => 생성자를 실행할 때 사용할 값은 파라미터로 받는다.
  public BoardHandler(Scanner input) {
    // BoardHandler를 실행하려면 데이터를 입력받는 도구가 반드시 있어야 한다.
    // 이런 도구를 "의존 객체(Dependency Object)"라 부른다.
    // 보통 "dependency"라 줄여서 부른다.
    // 생성자에서 해야할 일은 인스턴스를 생성할 때
    // 이런 의존 객체를 반드시 초기화 시키도록 하는 것이다.
    this.input = input;
    this.boards = new Review[BOARD_SIZE];
  }

  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    if (capacity < BOARD_SIZE || capacity > 10000) 
      this.boards = new Review[BOARD_SIZE];
    else 
      this.boards = new Review[capacity];
  }

  // 클래스 메소드
  // => 인스턴스 없이 호출하는 메소드
  // =>인스턴스를 사용하려면 파라미터를 통해 호출할 때 외부에서 받아야 한다.
  public void addBoard() { // BoardHandle의 인스턴스 주소
    Review board = new Review();

    System.out.print("번호? ");
    board.no = input.nextInt();
    input.nextLine();

    System.out.print("내용? ");
    board.title = input.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    this.boards[this.boardCount++] = board;
    System.out.println("저장하였습니다.");

  }

  // 인스턴스 메소드
  // => 인스턴스가 있어야만 호출할 수 있는 메소드이다.
  // =>인스턴스를 사용하는 메소드인 경우 인스턴스 메소드로 선언하라.
  // => 호출할 때는 반드시 인스턴스 주소를 줘야한다.
  // 인스턴스주소.메소드명( ;
  // =>이렇게 인스턴스의 변수 값을 다루는 메소드는
  // "연산자(operation)"라 부를 수 있다.
  public void listBoard() { // BoardHandle의 인스턴스 주소
    for (int i = 0; i < this.boardCount; i++) {
      Review b = this.boards[i];
      System.out.printf("%d, %s, %s, %d\n", b.no, b.title, b.date, b.viewCount);
    }
  }

  public void detailBoard() {
    System.out.print("게시물 번호? ");
    int no = input.nextInt();
    input.nextLine(); // 숫자 뒤에 남은 공백 제거

    Review board = null;
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
