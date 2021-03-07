package net.codejava.customer;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//클라이언트가 보내는 모든 요청을 프론트 컨트롤러가 하는 서블릿 클래스가 다받는다
//모든 요청을 받고 실제 일은 처리하지 않음 즉 실젱 일은 컨트롤로(핸들러 클래스) 위임 지금 여기 클래스가 그역활
//url을 하나의 클래스에서 다 처리하게 해줌 이렇게 해서 컨트롤러는 자바 빈을 이용해서 결과를 만들어내고
//만들어낸 결과를 모델에다가 담고프론트 컨트롤러에게 보내면 프론트 컨트롤러가 알맞은 뷰에게 모델을 전달해서 그결과를 출력함
@Controller
public class CustomerController {

	
	private CustomerService service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		ModelAndView mav=new ModelAndView("index");
		
		List<Customer>listCustomer=service.listAll();
		
		mav.addObject("listCustomer",listCustomer);
		return mav;
	}
}
