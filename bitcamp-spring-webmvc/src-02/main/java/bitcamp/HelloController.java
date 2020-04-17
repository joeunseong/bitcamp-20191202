package bitcamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 프론트 컨트롤러(DispatchrServlet)가 실행할 페이지 컨트롤러는
// 다음과 같이 @Controller 애노테이션을 붙여야 한다.
@Controller
public class HelloController {

  // 클라이언트 요청이 들어왔을 때 호출될 메소드(request handler)를
  // 표시하려면 다음과 같이 @RequestMapping 애노테이션을 붙여야 한다.
  // => @RequestMapping(요청URL)
  // => @RequestMapping(value)

  // 리턴 값이 클라이언트
  @RequestMapping({"/hello", "/hello2", "/okok"})
  @ResponseBody
  public String hello() throws Exception {
    return "<html><body><h1>Hello!</h1></body></html>";
  }
}
