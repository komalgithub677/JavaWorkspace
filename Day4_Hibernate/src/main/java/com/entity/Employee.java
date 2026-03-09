package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="empData")
public class Employee {//many to one
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   int empId;
       String empName;
       String city;
       @ManyToOne
       Department dept;
	   
	   public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	   
	   public Employee(int empId, String empName, String city, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.dept = dept;
	}

	   public int getEmpId() {
		   return empId;
	   }
	   public void setEmpId(int empId) {
		   this.empId = empId;
	   }
	   public String getEmpName() {
		   return empName;
	   }
	   public void setEmpName(String empName) {
		   this.empName = empName;
	   }
	   public String getCity() {
		   return city;
	   }
	   public Department getDept() {
		return dept;
	}

	   public void setDept(Department dept) {
		   this.dept = dept;
	   }

	   public void setCity(String city) {
		   this.city = city;
	   }

	   @Override
	   public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", dept=" + dept + "]";
	   }
	   
       
}
