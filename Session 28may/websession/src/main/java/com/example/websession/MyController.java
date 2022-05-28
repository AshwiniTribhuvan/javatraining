package com.example.websession;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

		@Controller
		public class MyController {
			
			@GetMapping("/main")
			public String goToMain(@RequestParam String uname,HttpSession session)
			{
				session.setAttribute("uname",uname);
				return "main";
				
			}
			@GetMapping("/movie")
			public String goToMovie(HttpSession session,Model model)
			{
			model.addAttribute("uname",session.getAttribute("uname"));
			String n=(String)session.getAttribute("uname");
			System.out.println("Name of User :"+n);
			return "movie";
			}
			@GetMapping("/sport")
			public String goTosport() {
				return "sport";
				
			}
		}
		





