package com.web.springboot.springbootwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.springboot.springbootwebapp.model.User;
import com.web.springboot.springbootwebapp.service.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello() {
		return "This is homePage";
	}
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String userName, @RequestParam String firstName,
			@RequestParam String lastName, @RequestParam int age, @RequestParam String password) {
	User user=new User(userName,firstName,lastName,age,password);
		userService.saveMyUser(user);
		return "user Saved";
	}
}
