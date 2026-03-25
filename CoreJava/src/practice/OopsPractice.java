package practice;

public class OopsPractice {
	         
//	🟢 1. Class & Object (Basics)
//	Create a class Student with fields: id, name, marks. Print details.
	int id;
	String name;
	int marks;
	
	public  OopsPractice(int id ,String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks =marks;
	}
	
	public void display() {
		System.out.println("id :" + id);
		System.out.println("name :" + name);
		System.out.println("marks : " + marks);
	}
	

            public static void main(String[] args) {
            	OopsPractice o = new OopsPractice(1, "Komal", 98);
            	o.display();
			}
}
