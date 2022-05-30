package com.example.demoMVC3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class MyController {
	@Autowired
	 private UsersRepository userrepo;
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	
	@PostMapping("/createuser")
	public String createUser (@ModelAttribute Users user) {
		return "index";
	}
	@GetMapping("/showAll")
public String show(Model model) {
		List<Users> ob=userrepo.findAll();
		model.addAttribute("users",ob);
		return "result";
	}
}
