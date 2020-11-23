package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@RequestMapping("/")
	public String index() {
		
		return "Welcome";
	}
	
	@GetMapping("/authenticated")
	public String loggedInUser() {
		
		return "your successfully authenticated using Oauth2 Login";
	}

}
