package com.eomcs.lms;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Spring IoC 컨테이너가 이 클래스를 Java Config로 자동 인식하려면
// 다음 태그를 붙여야한다.
// 단, 이 클래스가 @ComponentScan 에서 지정한 패키지 안에 있어야 한다.
@Configuration

// Mybatis DAO 프록시를 자동 생성할 인터페이스를 지정하기
@MapperScan("com.eomcs.lms.dao")
public class MybatisConfig {

  public MybatisConfig() {
    System.out.println("MybatisConfig 객체 생성!");
  }

  // Spring IoC 컨테이너에 수동으로 객체를 등록하고 싶다면,
  // 그 객체를 만들어주는 팩토리 메소드를 정의해야 한다.
  // 메소드를 만들어 리턴한다.
  // => 단 메소드 선언부에 @Bean 애노테이션을 붙여야 한다.
  // => 그래야만 Spring IoC 컨테이너는 이 메소드를 호출하고 그 리턴 값을 보관한다.

  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource, // DB 커넥션 풀
      ApplicationContext appCtx /* Spring IoC 컨테이너 */) throws Exception {

    // Spring IoC 컨테이너 용으로 mybatis 측에서 따로 제작한 SqlSessionFactory 이다
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setTypeAliasesPackage("com.eomcs.lms.domain");
    sqlSessionFactoryBean.setMapperLocations(//
        // Spring IoC 컨테이너를 통해 SQL 맵퍼 파일의 위치 정보를 가져온다.
        appCtx.getResources("classpath:com/eomcs/lms/mapper/*Mapper.xml"));
    return sqlSessionFactoryBean.getObject();
  }

}
