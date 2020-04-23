package bitcamp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class App2WebApplicationInitializer // 프론트 컨트롤러의 디스패처 서블릿을 등록해줌, Config 파일을 등록해주는 일까지만 함
    extends AbstractAnnotationConfigDispatcherServletInitializer {// 설정은 Config에 가서 해줘야함

  @Override
  protected Class<?>[] getRootConfigClasses() { // IoC 컨테이너 설정 정보
    return null;
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {App2Config.class};
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/app2/*"};
  }

  @Override
  protected String getServletName() {
    return "app2";
  }
}


