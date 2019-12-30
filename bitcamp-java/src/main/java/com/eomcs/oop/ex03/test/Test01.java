package com.eomcs.oop.ex03.test;

/*
 * class A {} // 패키지 멤버 클래스
 */
class Score { // 패키지 멤버 클래스 public을 선언하면 다른 파일로 옮겨야한다.
  static int count; //공유해서 쓰기 때문에 인스턴스 대신에 static

  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  Score() {// 생성자 존재 이유: 초기화하려고, 인스턴스 생성 후 유효한 값으로 설정해 제대로 쓰기 위해 
    System.out.println("Score() -1");
  }

  Score(String name, int kor, int eng, int math) {
    System.out.println("Score() -2");
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
    Score.increase();
  }
  /* 
   static void compute(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
  }
  */
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
  
  static void increase() {
    Score.count++;
  }  
}

public class Test01 {
  public static void main(String[] args) {
    Score s1 = new Score(); //생성자가 2개가 선언될 때는 기본 생성자를 선언 안하면 자동으로 생성이 안됨
    System.out.println("-------");
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();
    Score.increase();

    Score s2 = new Score("임꺽정", 90, 80, 70);
    System.out.println("---------");
    
    System.out.printf("%s, %d, %d, %d", s2.name, s2.kor, s2.eng, s2.math);


  }

}
