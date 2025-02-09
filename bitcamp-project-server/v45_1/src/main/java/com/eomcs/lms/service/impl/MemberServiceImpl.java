package com.eomcs.lms.service.impl;

import java.util.HashMap;
import java.util.List;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

public class MemberServiceImpl implements MemberService {
  MemberDao memberDao;

  public MemberServiceImpl(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void add(Member member) throws Exception {
    memberDao.insert(member);
  }

  @Override
  public List<Member> list() throws Exception {
    return memberDao.findAll();
  }

  @Override
  public Member get(int no) throws Exception {
    return memberDao.findByNo(no);
  }

  @Override
  public int delete(int no) throws Exception {
    return memberDao.delete(no);
  }

  @Override
  public int update(Member member) throws Exception {
    return memberDao.update(member);
  }

  @Override
  public List<Member> search(String keyword) throws Exception {
    return memberDao.findByKeyword(keyword);
  }

  @Override
  public Member get(String email, String password) throws Exception {
    HashMap<String, Object> params = new HashMap<>();
    params.put("email", email);
    params.put("password", password);
    return memberDao.findByEmailAndPassword(params);
  }
}
