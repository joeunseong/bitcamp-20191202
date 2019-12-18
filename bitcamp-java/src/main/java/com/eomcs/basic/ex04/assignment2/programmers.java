package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

class Solution {
  public String solution(String[] seoul) {
    String[] arr = new String[1000];
    Scanner scn = new Scanner(System.in);
    String word = "";
    for (int i = 0; i < 1001; i++) {
      if (arr[i].equalsIgnoreCase("kim")) {
        word = arr[i];
      }

      String answer = "김서방은 " + word + "에 있다";

      return answer;
    }
  }
}
