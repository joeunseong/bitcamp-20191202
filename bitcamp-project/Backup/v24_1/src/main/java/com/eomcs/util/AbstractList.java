package com.eomcs.util;

public abstract class AbstractList<E> implements List<E> {
  protected int size;

  public int size() {
    return size;
  }

  // 내부에 보관 값을 꺼내주는 메소드를 추가한다.
  // => 값을 저장하는 방식에 따라 구현 방법이 다르기 때문에
  //    수퍼 클래스에서 정의하지 않고,
  //     단지 메소드만 선언한다.

  @Override
  public Iterator<E> iterator() {
    // List 객체에서 값을 꺼내주는 일을 할 Iterator 구현체를 준비하여 리턴한다.
    return new ListIterator<E>(this);
  }
}
