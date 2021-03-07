package net.codejava.customer.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


//onStartup메소드가 실행이 되면 프론트 컨테이너에 자동으로 호출 
//그리고 나서 dispatcher servelet은 url "/" 매핑을 통해 모든 요청을 처리하고
//webConfig에서 구성을 찾음 
//즉 여기 클래스는 dipatcher servelet 역활 컨트롤러에게 뿌려주는 역활을 해줌
public class WebAppInitializer implements WebApplicationInitializer {
   @Override
   public void onStartup(ServletContext servletContext) throws ServletException {
       AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
       appContext.register(WebMvcConfig.class);
         
       ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
               "SpringDispatcher", new DispatcherServlet(appContext));
       dispatcher.setLoadOnStartup(1);
       dispatcher.addMapping("/");
         
   }
}