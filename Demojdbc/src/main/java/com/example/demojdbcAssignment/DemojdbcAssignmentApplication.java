package com.example.demojdbcAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemojdbcAssignmentApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemojdbcAssignmentApplication.class, args);

		ApplicationContext context;
		context=SpringApplication.run(DemojdbcAssignmentApplication.class, args);
		MyRepository stud;
		stud=context.getBean(MyRepository.class);
		stud.getClass();

	}


	}

 
