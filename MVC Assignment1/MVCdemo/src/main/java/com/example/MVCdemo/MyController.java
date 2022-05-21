package com.example.MVCdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MyController {
	@GetMapping("/sayhello")
	public String greeting( @RequestParam(name="uname",required =false,defaultValue ="DIEMS") String fname,@RequestParam(name="pass",required =false,defaultValue ="DIEMS") String upass, Model model){
		model.addAttribute("uname", fname);
		model.addAttribute("pass", upass);
		return "hello";
	}

}


