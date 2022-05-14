package com.example.oneToonedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToonedemoApplication {

	public static void main(String[] args) {
		ApplicationContext  context=SpringApplication.run(OneToonedemoApplication.class, args);
		RoleRepository role=context.getBean(RoleRepository.class);
		EmpRepository emp=context.getBean(EmpRepository.class);
				Role r1=new Role(1,"Admin");
				Role r2=new Role(2,"HR");
		role.save(r1);
		role.save(r2);
		Emp e1=new Emp(001,"Shital",r1);
		Emp e2=new Emp(002,"Ashwini",r2);
		emp.save(e1);
		emp.save(e2);
		
	}

}
