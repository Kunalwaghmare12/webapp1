package com.mywebapp.webapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path="/hello")
	public String getPage() {
		return "Hello Welcome to Kunal app";
		
	}

}
