package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@RequestMapping("/")
	public String index() {
		
		return "Welcome";
	}

}
