// "/board/detail" 명령 처리

package com.eomcs.lms.handler;

import com.eomcs.util.Prompt;

public class ComputeCommand implements Command {

  public Prompt prompt;

  public ComputeCommand(Prompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public void excute() {
    int a = prompt.inputInt("수1? ");
    int b = prompt.inputInt("수2? ");
    System.out.printf("계산 결과는 %d 입니다.\n", a + b);
  }
}
