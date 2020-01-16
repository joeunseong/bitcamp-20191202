// static nested class
package com.eomcs.oop.ex11.a;

import static com.eomcs.oop.ex11.a.Exam0112_X.*;

public class Exam0113 {
  public static void main(String[] args) {
    // import static 을 이용하면 패키지 멤버 클래스를 사용하는 것과 똑같은 방법으로
    // 클래스 이름을 생략할 수 있다.
    sValue = 100;
    
    // static nested class 또한 같은 방식으로 사용할 수 있다.
    Exam0112_X.A obj;
    obj = new Exam0112_X.A();
  }
}
