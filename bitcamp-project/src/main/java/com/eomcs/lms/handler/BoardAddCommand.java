// "/board/add" 명령어 처리

package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.List;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardAddCommand implements Command {

  List<Board> boardList;

  public Prompt prompt;

  public BoardAddCommand(Prompt prompt, List<Board> list) {
    // list 파라미터는 list 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    this.boardList = list;
  }

  @Override
  public void excute() {
    Board board = new Board();
    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("내용? "));
    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);
    boardList.add(board);
    System.out.println("저장하였습니다.");
  }
}
