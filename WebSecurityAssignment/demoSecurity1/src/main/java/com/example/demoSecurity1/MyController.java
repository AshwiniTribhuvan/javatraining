package com.example.demoSecurity1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@GetMapping("/")
	public String home()
	
	{String S1="<h1> hello world </h1>";
	String S2=" <br> <a href = /logout >Logout </a>";
	return S1+S2;

		
	
	}
	
	

}
