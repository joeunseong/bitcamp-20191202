package com.eomcs.generic.ex03;

import java.lang.reflect.Array;

public class Exam0110 {

  // 제네릭의 타입을 지정할 때 수퍼 클래스를 지정하지 않으면 모든 타입이 가능하다.
  // 즉 T 자리에 어떤 타입이라도 올 수 있다.

  static class ArrayList<T> {

    T[] arr;
    int index = 0;

    @SuppressWarnings("unchecked")
    public ArrayList(Class<?> clazz) {
      // 제네릭 타입 파라미터로 레퍼런스는 선언할 수 있지만 인스턴스를 생성할 수 없다.
      // arr = new T[10]; // 컴파일 오류!

      // 다음과 같이 Array.newInstance()를 이용하여 배열을 생성해아 한다.
      this.arr = (T[]) Array.newInstance(clazz, 10);
    }

    public void add(T v) {
      arr[index++] = v;
    }

    public T get(int index) {
      return arr[index];
    }

    public static void main(String[] args) {

      ArrayList<Member> obj = new ArrayList<>(Member.class);
      obj.add(new Member());
      obj.add(new Student());
      obj.add(new Teacher());
      obj.add(new Manager());
      obj.add(new Administrator());

      // 클래스 관계:
      /*
       *            Member
       *       /      |       \   
       *   Teacher  Student  Manager
       *                        |
       *                     Administrator   
       */
      System.out.println(obj.get(0));
      System.out.println(obj.get(1));
      System.out.println(obj.get(2));
      System.out.println(obj.get(3));
    }
  }
}
