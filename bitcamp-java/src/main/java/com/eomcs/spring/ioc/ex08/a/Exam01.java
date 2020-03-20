// 의존 객체 주입 자동화하기 - XML로 설정하기
package com.eomcs.spring.ioc.ex08.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer =
        new ClassPathXmlApplicationContext("com/eomcs/spring/ioc/ex08/a/application-context.xml");

    System.out.println(iocContainer.getBean("c1"));
  }

}


