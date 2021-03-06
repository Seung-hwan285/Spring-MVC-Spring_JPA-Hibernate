package net.codejava.customer.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		
		appContext.register(WebMvcConfig.class);
	}
	
	

}
