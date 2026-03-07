package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name ="empData")
public class Employee {
	       @Id
	       @GeneratedValue(strategy = GenerationType.IDENTITY)
	       //autoincrement added ,it takes the next record only when guessing the previous record
           private  int empID;
           private String name;
           
//           @Column(name="address")
           private String city;
           @Column(unique=false,  nullable=false)
           private String email;
           private double salary;
           
		   public Employee() {
			
		   }

		   public Employee(int empID, String name, String city, double salary) {
			super();
			this.empID = empID;
			this.name = name;
			this.city = city;
			this.salary = salary;
		   }

		   public String getEmail() {
			return email;
		}

		   public void setEmail(String email) {
			   this.email = email;
		   }

		   public double getSalary() {
			return salary;
		}

		

		   public void setSalary(double salary) {
			   this.salary = salary;
		   }

		   public int getEmpID() {
			   return empID;
		   }

		   public void setEmpID(int empID) {
			   this.empID = empID;
		   }

		   public String getName() {
			   return name;
		   }

		   public void setName(String name) {
			   this.name = name;
		   }

		   public String getCity() {
			   return city;
		   }

		   public void setCity(String city) {
			   this.city = city;
		   }
           
		   @Override
			public String toString() {
				return "Employee [empID=" + empID + ", name=" + name + ", city=" + city + ", email=" + email + ", salary="
						+ salary + "]";
		   }         
}
