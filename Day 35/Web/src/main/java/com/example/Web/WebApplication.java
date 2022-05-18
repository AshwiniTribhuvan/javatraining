package com.example.Web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(WebApplication.class, args);
		
		ApplicationContext context;
		context=SpringApplication.run(WebApplication.class, args);
		
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setdata();
		//st.showdata();
	}

}
