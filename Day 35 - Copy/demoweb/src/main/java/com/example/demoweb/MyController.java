package com.example.demoweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String SayHello()
	{
		return "Hello from pooja";
		
	}
	@GetMapping("/hello")
	public String getmsg()
	{
		return"Hello world";
	}
	

}
