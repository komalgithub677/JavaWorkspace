package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tka.entities.Student;

@SpringBootApplication
public class SpringDay5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDay5Application.class, args);
		System.err.println("Application is started...");
		Student s = new Student();
		
		
	    
	}
}
