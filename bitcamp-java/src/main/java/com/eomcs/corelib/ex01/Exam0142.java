// String - 다형적 변수와 형변환, toLowerCase
package com.eomcs.corelib.ex01;

public class Exam0142 {
  public static void main(String[] args) {
    // 컴파일러는 어떤 걸 new 하든 레퍼런스가 담긴 클래스의 메소드만 가능하고
    // 실행을 하면 new한 객체에 담긴 메소드부터 검사
    Object obj = new String("Hello"); // 인스턴스 주소가 100이라 가정하자;

    // obj를 통해 원래 인스턴스를 호출하고 싶다면
    // 다음과 같이 원래 타입으로 형변환하라!
    String s = ((String) obj).toLowerCase();
    System.out.println(s);
    
    // 또는 다음과 같이 원래 타입의레퍼런스에 저장한 다음 사용하라.
    String x1 = (String) obj; // x1 = 100
    s = x1.toLowerCase();
    System.out.println(s);
  }
}


