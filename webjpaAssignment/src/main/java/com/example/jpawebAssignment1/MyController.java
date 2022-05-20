package com.example.jpawebAssignment1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	@Autowired
	  private EmployeeRepository Emp;
		//@GetMapping("/Student")
		//public List<Student> getAllStudent(){
		//	return Stud.findAll();
		//}
		
		
//
//	   @GetMapping("/Employee/{id}")
//  public Employee getStudentById(@PathVariable("id")Integer StudId){
//	  Optional<Employee> op= Emp.findById(StudId);
//	  Employee st=op.get();
//	   return st;
	  // }

	   
	
		@PutMapping("/updateEmp/{id}")
		public boolean updateEmployee(@PathVariable(value = "id") Integer studId,
				@RequestBody Employee studDetails) throws Exception {
			boolean f=true;
			try {
				Optional<Employee> op = Emp.findById(studId);
				Employee em = op.get();
				em.setName(studDetails.getName());
				final Employee updatedStud = Emp.save(em);
			} catch(Exception e) {
				f=false;
			}
		return f;
		}
//		@DeleteMapping("/deletestud/{id}")
//		public boolean deleteEmployee(@PathVariable(value = "id") Integer studId,
//				@RequestBody Employee studDetails) throws Exception {
//			Optional<Employee> op = Stud.findById(studId);
//			Employee em = op.get();
//			 
//			Stud.delete(em);
//			return true;
//		}
	}









