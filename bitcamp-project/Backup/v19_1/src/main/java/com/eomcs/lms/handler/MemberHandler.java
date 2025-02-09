package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.ArrayList;

public class MemberHandler {

  public Scanner input;

  ArrayList<Member> memberList;

  public MemberHandler(Scanner input) {
    this.input = input;
    memberList = new ArrayList<>();
  }

  public MemberHandler(Scanner input, int capacity) {
    this.input = input;
    memberList = new ArrayList<>(capacity);
  }

  public void addMember() {
    Member member = new Member();

    System.out.print("번호? ");
    member.setNo(input.nextInt());
    input.nextLine();

    System.out.print("이름? ");
    member.setName(input.nextLine());

    System.out.print("이메일? ");
    member.setEmail(input.nextLine());

    System.out.print("암호? ");
    member.setPassword(input.nextLine());

    System.out.print("사진? ");
    member.setPhoto(input.nextLine());

    System.out.print("전화? ");
    member.setTel(input.nextLine());

    member.setRegisteredDate(new Date(System.currentTimeMillis()));

    memberList.add(member);

    System.out.println("저장하였습니다.");
  }

  public void listMember() {
    // Member 객체의 목록을 저장할 배열을 넘기는데 크기가 0인 배열을 넘긴다.
    // toArray()는 내부에서 새 배열을 만들고, 값을 복사한 후 리턴한다.
    Member[] arr = this.memberList.toArray(new Member[] {});
    for (Member m : arr) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.getNo(), m.getName(), m.getEmail(), m.getTel(),
          m.getRegisteredDate());
    }
  }

  public void detailMember() {
    System.out.print("멤버 인덱스? ");
    int index = input.nextInt();
    input.nextLine();

    Member member = this.memberList.get(index);

    if (member == null) {
      System.out.println("유효한 멤버 인덱스가 없습니다.");
      return;
    }

    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("암호: %s\n", member.getPassword());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("전화: %s\n", member.getTel());
  }

  public void updateMember() {
    System.out.print("멤버 인덱스? ");
    int index = input.nextInt();
    input.nextLine();

    Member oldMember = this.memberList.get(index);
    boolean changed = false;
    if (oldMember == null) {
      System.out.println("유효한 멤버 인덱스가 없습니다.");
      return;
    }

    Member newMember = new Member();
    String inputStr = null;
    newMember.setNo(oldMember.getNo());
    
    System.out.printf("이름(%s)? ", oldMember.getName());
    inputStr = input.nextLine();

    if (inputStr.length() == 0) {
      newMember.setName(oldMember.getName());
    } else {
      newMember.setName(inputStr);
      changed = true;
    }

    System.out.printf("이메일(%s)? ", oldMember.getEmail());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setEmail(oldMember.getEmail());
    } else {
      newMember.setEmail(inputStr);
      changed = true;

    }

    System.out.printf("암호(%s)? ", oldMember.getPassword());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setPassword(oldMember.getPassword());
    } else {
      newMember.setPassword(inputStr);
      changed = true;

    }

    System.out.printf("사진(%s)? ", oldMember.getPhoto());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setPhoto(oldMember.getPhoto());
    } else {
      newMember.setEmail(inputStr);
      changed = true;

    }

    System.out.printf("전화(%s)? ", oldMember.getTel());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setTel(oldMember.getTel());
    } else {
      newMember.setTel(inputStr);
      changed = true;

    }
    newMember.setRegisteredDate(new Date(System.currentTimeMillis()));

    if (changed) {
      this.memberList.set(index, newMember);
      System.out.println("멤버 정보가 변경되었습니다.");
    } else {
      System.out.println("멤버 변경을 취소하였습니다.");
    }
  }

  public void deleteMember() {
    System.out.print("멤버 인덱스? ");
    int index = input.nextInt();
    input.nextLine();

    Member member = this.memberList.get(index);

    if (member == null) {
      System.out.println("해당 멤버 인덱스가 존재하지 않습니다.");
      return;
    }

    this.memberList.remove(index);
    System.out.println("해당 멤버를 삭제했습니다.");

  }
}
