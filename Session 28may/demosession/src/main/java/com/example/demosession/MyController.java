package com.example.demosession;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;

			@Controller
			public class MyController {
				
				@GetMapping("/main")
				public String goToMain(@RequestParam String uname,Model model)
				{
					model.addAttribute("uname",uname);
					return "main";
					
				}
				@GetMapping("/movie")
				public String MoviePage(@RequestParam String uname,Model model)
				{
				model.addAttribute("uname",uname);
				
				return "movie";
				}
				
				@GetMapping("/sport")
				public String sportPage(@RequestParam String uname,Model model)
				{
				model.addAttribute("uname",uname);
				
				return "sport";
			}
			}






	
	


