package com.java.on;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class test {

	@RequestMapping("/test")
public	String  m1() {
	
	return "helloG";
}

}