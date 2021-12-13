package com.java.on;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.in.DTOclass;

@Controller
public class Homeclass  {

	@RequestMapping("/")
	public String m1(@ModelAttribute("info") DTOclass dtoclass) {

		return "home-page";
	}

	@RequestMapping("/proces-next")

	public String m2(@ModelAttribute("info") DTOclass dtoclass) {

		System.out.println("User Name" + dtoclass.getUserName());
//System.out.println("Crush Name"+ dtoclass.getCrushName());
		// modd.addAttribute("info", DTOclass);
//modd.addAttribute("info", dtoclass);

		return "confirmation";
	}
}
