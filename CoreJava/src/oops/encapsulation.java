package oops;

public class encapsulation {
	
//	1️⃣ Basic Getter and Setter
//
//	Create a class Student with:
//
//	private variables: name, age
//
//	public getter and setter methods
//	Set values using setters and display them using getters.
	         int age;
	         String name;
	         
	         public int getAge() {
	        	 return age;
	         }
	         public void setAge(int age) {
	        	 this.age =age;
	         }
	         
	         public String getName() {
	        	 return name;
	         }
	         
	         public void setName(String name) {
	        	 this.name = name;
	         }
	       
	
             public static void main(String[] args) {
				encapsulation e = new encapsulation();
				e.setAge(12);
				System.out.println("Age : " + e.getAge());
				e.setName("Komal");
				System.out.println("Name : " + e.getName());
			}
}
