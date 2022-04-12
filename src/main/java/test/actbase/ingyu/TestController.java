package test.actbase.ingyu;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
		
	@GetMapping("hello")
	public ModelAndView hello(HttpServletRequest request,ModelAndView mav) {
		
		//문제에 파라미터로 넘어온 값에 홀따옴표가 있지만 결과에 따옴표 없이 출력되기 때문에 따옴표 제거
		String name = request.getParameter("name").replaceAll("\'", "");
		
		//해당 값을 페이지에 넘겨줌
		mav.addObject("name", name);
		//뷰페이지 이름지정
		mav.setViewName("hello");
		
		return mav;
	}
	
}