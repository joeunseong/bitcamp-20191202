package com.eomcs.basic.ex04.assignment2;
import java.util.Scanner;
public class Test02{
public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  System.out.print("가위,바위,보? ");
  String a = keyboard.nextLine();
  int s=0;
  if(a.equals("가위")) {
     s = 1;
  }else if(a.equals("바위")) {
     s = 2;
  }else if(a.equals("보")) {
    s = 3;
  }
  
  keyboard.close();
  int num =(int)(Math.random()*3)+1;
  String computer = null;
  
  if(num==1) {
    computer = "가위";
  }else if(num==2) {
    computer = "바위";
  }else if(num==3) {
    computer = "보";
  }
  
  System.out.printf("컴퓨터? %s\n ", computer);
  
  if(s>num) {
    if(s==3&&num==1) {
      System.out.println("졌습니다.");
    }else {
    System.out.println("이겼습니다.");
    }
  }else if(s==num) {
    System.out.println("비겼습니다.");
  }else if(s<num) {
    if(num==3 && s==1){
      System.out.println("이겼습니다.");
    }else{
    System.out.println("졌습니다.");
    }
  }
  
  /*
  if(s == num)
    System.out.println("비겼습니다.");
  else if((s==1 && num==3) || (s==2 && num==1) || (s==3 && num==2))
    System.out.println("이겼습니다.");
  else
    System.out.println("졌습니다.");
  */
  
}
}