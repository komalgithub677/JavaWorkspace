package com.tka.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // --> getr,setr,hashcode ,toString
public class Student {
	   @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       int studId;
       String name;
       String email;
       String city;
       double marks;
	   public Object getName() {
		// TODO Auto-generated method stub
		return null;
	   }
	   public void setName(Object name2) {
		// TODO Auto-generated method stub
	   }    
}
