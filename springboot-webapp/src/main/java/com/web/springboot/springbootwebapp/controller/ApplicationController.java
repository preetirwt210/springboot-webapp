package com.web.springboot.springbootwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {

	@ResponseBody
	@RequestMapping("/home")
	public String sayHello() {
		
		return "Hello From Preeti Rawat";
	}
	
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "welcomePage";
	}
}
