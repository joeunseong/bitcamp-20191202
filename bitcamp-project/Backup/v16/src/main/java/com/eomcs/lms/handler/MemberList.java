package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Member;

public class MemberList {
  static final int DEFAULT_SIZE = 100;

  Member[] list;
  int size = 0;

  public MemberList() {
    this.list = new Member[DEFAULT_SIZE];
  }

  public MemberList(int capacity) {
    this.list = new Member[capacity];
  }

  public void add(Member member) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!\n", newCapacity);
    }
    this.list[this.size++] = member;
  }

  public Member[] toArray() {
    return Arrays.copyOf(this.list, this.size);
  }



}
