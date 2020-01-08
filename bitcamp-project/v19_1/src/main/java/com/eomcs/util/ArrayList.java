package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> {

  private static final int DEFAULT_CAPACITY = 2;

  Object[] elementData;
  int size;

  public ArrayList() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initailCapacity) {
    if (initailCapacity < DEFAULT_CAPACITY) {
      this.elementData = new Object[DEFAULT_CAPACITY];
    } else {
      this.elementData = new Object[initailCapacity];
    }
  }

  public void add(E e) {
    if (this.size == this.elementData.length) {
      int oldSize = this.elementData.length;
      int newSize = oldSize + (oldSize >> 1);
      this.elementData = Arrays.copyOf(this.elementData, newSize);

      /*
       * Object[] newArr = new Object[newSize]; 
       * for(int i =0; i < this.size; i++) { 
       * newArr[i] = this.elementData[i]; 
       * } 
       * this.elementData = newArr;
       */
    }
    this.elementData[this.size++] = e;
  }
  
  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    return (E) this.elementData[index];
  }

  @SuppressWarnings("unchecked")
  public E set(int index, Object e) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    
    E oldValue = (E) this.elementData[index];
    this.elementData[index] = e;
    return oldValue;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    
    E oldValue = (E) this.elementData[index];
    
    System.arraycopy(this.elementData, index + 1, 
        this.elementData, index, this.size - (index + 1));
    /*
    for (int i = index + 1; i < this.size; i++) {
      this.elementData[i - 1] = this.elementData[i];
    }
    */
    this.size--;
    return oldValue;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {
    return Arrays.copyOf(this.elementData, this.size);
    /*
    Object[] arr = new Object[this.size];
    for(int i = 0; i < this.size; i++) {
        arr[i] = this.elementData[i];
    }
    return arr;
    */
  }
  
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if(arr.length < this.size) {
      //파라미터로 받은 배열이 작을 때는 새 배열을 만들어 리턴.
    return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
    }
      System.arraycopy(this.elementData, 0, arr, 0, this.size);
      return arr; // 넉넉할 때는 그대로 파라미터로 받은 배열을 그대로 리턴.
  }
  
  
}


