package com.eomcs.sql;

import java.lang.reflect.Proxy;
import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisDaoFactory {
 InvocationHandler invocationHandler;

  public MybatisDaoFactory(SqlSessionFactory sqlSessionFactory) {
    this.invocationHandler = new DaoInvocationHandler(sqlSessionFactory);
  }

  @SuppressWarnings("unchecked")
  public <T> T createDao(Class<T> daoInterface) { // <T> : 타입 파라미터=> 넘어오는 값으로 결정됨
    return (T) Proxy.newProxyInstance(//
        this.getClass().getClassLoader(), //
        new Class[] {daoInterface}, //
        daoInvocationHandler);
  }
}
