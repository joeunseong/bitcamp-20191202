package team.test.jo;

import java.sql.Date;
import java.util.List;

public class Review {
  int reviewNo;
  int userNo;
  Date createDate;
  int sort;
  List<reviewDay> reviewDays;
}
