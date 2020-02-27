package com.eomcs.sql;

public interface TransactionCallback {
  // 이 메소드는 TransactionnTemplate이 호출한다.
  // => 이 메소드를 구현하는 클래스는
  // 이 메소드에 트랜잭션으로 묶어ㅓ 다른 작업을 기술해야 한다.
  Object doInTransaction() throws Exception;
}
