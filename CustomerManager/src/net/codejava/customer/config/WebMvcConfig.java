package net.codejava.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//스프링 IoC 컨테이너에게 클래스가 자바 빈을 만드는(구성하는) 클래스임을 알린다.빈을 등록하기 위한 클래스 
//빈? Spring IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라는 용어로 부른다.
//new 연산자로 어떤 객체를 생성했을 때 그 객체는 빈이 아니다.
//
//ApplicationContext.getBean()으로 얻어질 수 있는 객체는 빈이다.
//
//즉 Spring에서의 빈은 ApplicationContext가 알고있는 객체, 즉 ApplicationContext가 만들어서 그 안에 담고있는 객체를 의미한다.
@Configuration
@ComponentScan("net.codejava")
public class WebMvcConfig {

	
	@Bean(name="viewRepository")
	public InternalResourceViewResolver getViewResolver(){
		
		
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
}
