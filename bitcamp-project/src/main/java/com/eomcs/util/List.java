package com.eomcs.util;

// 목록 객체의 사용 규칙을 따로 정의
// => 문법
//    interface 규칙명 {...}
//
public interface List<E> {
  
  // 사용 규칙(호출할 메소드의 시그너처)이기 때문에 모든 메소드는 추상 메소드이다.
  // 또한 규칙은 공개되어야 하기 때문에 모든 메소드는 publilc이다
  // => 문법
  //    public abstract 리턴 타입 메소드명(파라미터,...)
  // => public을 생략할 수 있다.
  //    abstract 리턴 타입 메소드명(파라미터,...)
  // => abstract를 생략할 수 있다.
  //    리턴 타입 메소드명(파라미터,...)
  //
  public abstract void add(E e) ;

  public /*abstract*/ void add(int index, E value) ;

  /*public*/ abstract E get(int index) ;

  /*public abstract*/ E set(int index, E e) ;

  E remove(int index) ;
  
  Object[] toArray() ;
  
  E[] toArray(E[] arr);
  
  int size();

}
