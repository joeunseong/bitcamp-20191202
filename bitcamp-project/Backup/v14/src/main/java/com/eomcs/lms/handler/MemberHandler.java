package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberHandler {
  //인스턴스 필드 = 논스태틱 필드 
  // 개별적으로 관리해야하는 변수
  // => new 명령을 통해 생성됨
  Member[] members;
  int memberCount = 0;
  
  // 클래스 필드 = 스태틱 필드
  // => 공유하는 변수
  // => 클래스가 메모리에 로딩될 때 자동으로 
  static final int MEMBER_SIZE = 100;
  public  Scanner input;
  
  public MemberHandler(Scanner input) {
    this.input = input;
    this.members = new Member[MEMBER_SIZE];
  }

  public void addMember( ) {
    Member member = new Member();

    System.out.print("번호? ");
    member.no = input.nextInt();
    input.nextLine();

    System.out.print("이름? ");
    member.name = input.nextLine();

    System.out.print("이메일? ");
    member.email = input.nextLine();

    System.out.print("암호? ");
    member.password = input.nextLine();

    System.out.print("사진? ");
    member.photo = input.nextLine();

    System.out.print("전화? ");
    member.tel = input.nextLine();

    member.registeredDate = new Date(System.currentTimeMillis());

    this.members[this.memberCount++] = member;
    System.out.println("저장하였습니다.");
  }

  public void listMember() {
    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i];
      System.out.printf("%d, %s, %s, %s, %s\n", m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }
}
