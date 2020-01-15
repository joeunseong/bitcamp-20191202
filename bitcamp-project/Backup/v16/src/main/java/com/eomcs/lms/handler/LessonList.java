package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {
  Lesson[] list;
  int size = 0;

  static final int DEFAULT_SIZE = 100;
  
  public LessonList() {
    this.list = new Lesson[DEFAULT_SIZE];
  }
  
  public LessonList(int capacity) {
    if (capacity < DEFAULT_SIZE || capacity > 10000)
      this.list = new Lesson[DEFAULT_SIZE];
    else
      this.list = new Lesson[capacity];
  }

  public void add(Lesson lesson) {
    if (this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!\n", newCapacity);
    }
    this.list[this.size++] = lesson;
  }

  public Lesson[] toArray() {
    return Arrays.copyOf(this.list, this.size);
  }
  
  
}
