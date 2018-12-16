package com.jungin.practiceProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenericController {
	
	@RequestMapping("generic.do")
	public String genericPage() {
		
		return "generic";
	}
}
