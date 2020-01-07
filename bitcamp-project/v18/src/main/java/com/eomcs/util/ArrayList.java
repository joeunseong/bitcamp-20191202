package com.eomcs.util;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class ArrayList<E> {
  
  static final int DEFAULT_CAPACITY = 3;

  Object[] list;
  int size = 0;

  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULT_CAPACITY];
    else
      this.list = new Object[capacity];
  }
  
  @SuppressWarnings({"unchecked"})
  public E[] toArray(E[] arr) {
    // copyOf() 메소드야,
    // arrayType 에 지정된 배열을 size 만큼 만들어라.
    // 그리고 list 배열에 저장된 주소를 새로 만든 배열에 복사하라.
    // 마지막으로 새로 만든 배열의 주소를 리턴하라!
    //return (E[]) Arrays.copyOf(this.list, this.size, arrayType);
    if(arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.list, this.size, arr.getClass());
    }
    System.arraycopy(this.list, 0, arr, 0, this.size);
    /*
    // 위의 arraycopy()는 다음 코드와 같다.
    for(int i = 0; i <this.size; i++) {
      arr[i] = (E) this.list[i];
    }
    */
    
    return arr;
  }

  public void add(E obj) {
    if (this.size == this.list.length) {
      // 현재 배열의 게시글 객체가 꽉 찼으면, 배열을 늘린다.
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1); // >>(나누기)
      /*
      Board[] arr = new Board[newCapacity];
      for ( int i =0; i <this.list.length; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr;
      */
      
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!\n", newCapacity);
    }
    this.list[this.size++] = obj;
  }

  @SuppressWarnings("unchecked")
  public E get(int idx) {
   if(idx >= 0 && idx < this.size) {
     return (E)this.list[idx];
   } else {
    return null;
   }
  }
  
  public int size() {
    return this.size;
    
  }
}
