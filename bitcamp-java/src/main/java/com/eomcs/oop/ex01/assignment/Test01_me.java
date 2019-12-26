package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01_me {

  public static void main(String[] args) {
    class Score {
      String name;
      int kor;
      int mat;
      int eng;
      int sum;
      float aver;

    }
    Scanner keyboard = new Scanner(System.in);
    
    Score[] score = new Score[3];
    for (int i = 0; i < score.length; i++) {
      System.out.print("입력: ");
      score[i] = new Score();
      score[i].name = keyboard.next();
      score[i].kor = keyboard.nextInt();
      score[i].eng = keyboard.nextInt();
      score[i].mat = keyboard.nextInt();
      score[i].sum = score[i].kor + score[i].eng + score[i].mat;
      score[i].aver = score[i].sum / 3f;
    }
    keyboard.close();

    System.out.println("---------------------------------");
    for (int i = 0; i < score.length; i++) {
      System.out.printf("%s, %d, %d, %d, %s, %.1f\n", 
          score[i].name, score[i].kor, score[i].eng, score[i].mat, score[i].sum, score[i].aver);
    }
  }

}
