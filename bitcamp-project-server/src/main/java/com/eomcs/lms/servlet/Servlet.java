package com.eomcs.lms.servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public interface Servlet {
  default void service(ObjectInputStream in, ObjectOutputStream out) throws Exception {}

  default void service(Scanner in, PrintStream out) throws Exception {}

  // default로 선언을 하면 꼭 구현을 안해줘도 상관없음, 기존 규칙을 변경하고 싶을 때 사용
}
