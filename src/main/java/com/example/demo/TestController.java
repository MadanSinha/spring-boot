package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dude/")
public class TestController {
	
	@GetMapping("message")
	public String message() {
		
		return "Hello this dude spring app";
	}

}
