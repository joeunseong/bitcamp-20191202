// 컬렉션 타입의 프로퍼티의 값 설정 - Map<,>
package com.eomcs.spring.ioc.ex05.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer =
        new ClassPathXmlApplicationContext("com/eomcs/spring/ioc/ex05/d/application-context.xml");

    System.out.println(iocContainer.getBean("c1"));
  }

}


