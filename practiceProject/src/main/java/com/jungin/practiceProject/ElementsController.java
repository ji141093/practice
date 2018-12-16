package com.jungin.practiceProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ElementsController {

	@RequestMapping(value = "elements.do", method = RequestMethod.GET)
	public String elementsPage(){
		
		return "elements";
	}
	
}
