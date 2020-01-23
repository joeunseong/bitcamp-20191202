package com.eomcs.lms.handler;

import java.util.Iterator;
import java.util.List;
import com.eomcs.lms.domain.Member;

public class MemberListCommand implements Command {

  List<Member> memberList;

  public MemberListCommand(List<Member> list) {
    memberList = list;
  }

  @Override
  public void excute() {

    // 목록에서 값을 꺼내는 일을 해 줄 Iterator 객체를 준비한다.
    Iterator<Member> iterator = memberList.iterator();

    while (iterator.hasNext()) {
      Member m = iterator.next();
      System.out.printf("%d, %s, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel(),
          m.getRegisteredDate());
    }
  }
}
