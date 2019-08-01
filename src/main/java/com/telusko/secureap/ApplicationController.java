package com.telusko.secureap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
}
