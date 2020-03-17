package com.eomcs.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 실행 중에 메소드에 붙은 애노테이션 정보를 추출해야 한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
  // 메소드와 명령어를 연결하기 위해,
  // 명렁어를 저장할 프로퍼티를 정의한다.


}
