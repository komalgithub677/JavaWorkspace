package oops.contructor;

public class Student1 {
        
//	1. Create a class Student with private variables id and name.
//	Provide getters and setters. Write a program to set values and print them.**
	private int student_id ;
	private String name;
	
	public int  getStudent_id() {
	       return student_id;
	}
	
	public void setStudent_id(int student_id) {
		this.student_id =student_id;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public void setStudentName(String name) {
		this.name = name;
	}
}
