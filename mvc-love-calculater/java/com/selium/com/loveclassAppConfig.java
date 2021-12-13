package com.selium.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.java.on")
public class loveclassAppConfig {
	
	//now we can inject the depency file here like web.xml 
	//and view conroller
	@Bean
public	InternalResourceViewResolver viewcontrol() {
	
	InternalResourceViewResolver viewcontrol=new InternalResourceViewResolver();
	
	
	viewcontrol.setPrefix("/WEB-INF/view/");
	viewcontrol.setSuffix(".jsp");
	return viewcontrol;
	
	}

}
