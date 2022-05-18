package com.example.Crudassignment;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mapping.context.PersistentEntities;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class CrudassignmentApplication {

	private static final Iterable entities = null;

	public static void main(String[] args) {
		//SpringApplication.run(CrudassignmentApplication.class, args);
		
		ApplicationContext context;
		context=SpringApplication.run(CrudassignmentApplication.class, args);
		CrudRepository stud2;
		stud2=context.getBean(CrudRepository.class);
		//insert
		
		// User user =new User();
		 //user.SetName("Ashwini tribhuvan");
		 //user.Setcity("Aurangabad");
		 //user.setStatus("java programmer");
		 //User user1=userRepository.save(user);
		 //System.out.println(user1);
		 //create object of user
		 User user1=new User();
		 user1.setName("Shital");
		 user1.setCity("Seilu");
	     user1.setStatus("Student");
	
	
	     User user2=new User();
		 user2.setName("pooja");
		 user2.setCity("vaijapur");
	    user2.setStatus("python");
	
	    //Saving Single user
	   // user resultUser= userRepository.save(user2);
	   List<User> users=List.of(user1,user2);
	   CrudRepository userrepository = null;
	Iterable<User> result = userrepository.saveAll(users);
	   
	   result.forEach(user->{
		   
	   });
	   
	   
	  // userrepository.saveAll(entities)
	    
	    
	    
	    String resultUser = null;
		//String resultUser;
		System.out.println("saved user"+resultUser);
	    System.out.println("done");
	}


}
