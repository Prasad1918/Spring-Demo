package com.selium.com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class laveclassApplicationInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

		AnnotationConfigWebApplicationContext weapplication =new AnnotationConfigWebApplicationContext(); 
		
		weapplication.register(loveclassAppConfig.class);
		
		 
//		XmlWebApplicationContext weapplication=new XmlWebApplicationContext();
//		
//		weapplication.setConfigLocation("classpath:spring-mvc-demo-servlet.xml");
		//cretae Dispatcher servlet
		
		DispatcherServlet dx=new DispatcherServlet(weapplication);
		
		//Register the dispatcher servelt
		
		ServletRegistration.Dynamic myCustomreg=	servletContext.addServlet("myDispatcherServlet", dx);
		
		//set the URL mapping 
		myCustomreg.setLoadOnStartup(1);
		myCustomreg.addMapping("/site.com/*");
		
		
	}

}
