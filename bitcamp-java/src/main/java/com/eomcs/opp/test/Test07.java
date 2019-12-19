package com.eomcs.opp.test;

// gym 회원 정보를 입력 받아 출력
public class Test07 {
  public static void main(String[] args) {

    // 회원 정보를 담을 수 있는 메모리의 설계도
    class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraining;
    }

    // 레퍼런스 배열
    // new Member[5]; //인스턴스를 생성한 후 그 주소를 반드시 저장해야 한다.

    // 배열 주소를 저장한 변수 선언
    // => 배열의 주소를 저장하는 변수도 "레퍼런스"라 부른다.
    //
    Member[] arr;

    // 레퍼런스 배열을 선언한다.
    // 즉 레퍼런스 배열은 다음과 같다.
    // Member m0, m1, m2, m3, m4;
    //
    arr = new Member[5];

  }
}
