package com.example.demojpaweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private StudentRepository Stud;
	@GetMapping("/Student")
	public List<Student> getAllStudent(){
		return Stud.findAll();
	}

}
