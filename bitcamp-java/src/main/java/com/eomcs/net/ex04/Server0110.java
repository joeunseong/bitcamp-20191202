// 클라이언트와 입출력 테스트 - character Stream
package com.eomcs.net.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0110 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("클라이언트의 연결을 기다리고 있음.");

      try (Socket socket = serverSocket.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          // bufferedReader 은 character 스트림이라서 바이트 스트림은 getInputStream을 바로 받지 못해서
          // InputStreamReader로 받아서 바꿔준다.
          PrintWriter out = new PrintWriter(socket.getOutputStream())) { // PrintStream - 데코레이터

        System.out.println("클라이언트가 보낸 한 줄의 문자열을 기다리고 있음!");

        String str = in.readLine();
        System.out.println(str);

        // 서버가 데이터를 보내지 않으면 클라이언트의 read()는 리턴하지 않는다.
        // 이를 확인하기 위해 잠시 실행을 멈춘다.
        System.out.print("> ");
        keyboard.nextLine();

        out.println(str);
        // out.flush();
        // character stream 클래스의 경우
        // 출력 데이터를 내부 버퍼에 보관하고 있다가
        // flush()가 호출되면 비로선 출력을 수행한다.
        // 따라서 위 출력 문자열은 클라이언트에 보내지 않는다.
        // 주의!
        // => 단 close()를 호출하면 close() 내부에서 flush()를 실행한다.
        System.out.println("클라인트에게 데이터를 보냈음.");

        // System.out.println("> ");
        // keyboard.nextLine();


      }
      System.out.println("클라이언트와의 연결을 끊었음.");

    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}

