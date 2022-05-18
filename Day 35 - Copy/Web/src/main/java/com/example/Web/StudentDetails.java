package com.example.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	private Student stud;
	@Autowired
	public StudentDetails(Student stud)
	{
		this.stud=stud;
		
	}
	
	void setdata() 
	{
		System.out.println(100);
		System.out.println("abc");
		
	}
	void showdata() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
		
	}

	}


