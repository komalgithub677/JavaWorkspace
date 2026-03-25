package oops.Polymorphism.overload;

public class Students {
//	Constructor Overloading
//	Create a class Student with:
//
//	default constructor
//
//	parameterized constructor (id, name)
//	Print the student details.
	static int id;
	static String name;
	
	Students(){
		System.out.println("Default constructor called : ");
	}
	
	Students(int id  ,String name){
		this.display();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("id " + id);
		System.out.println("Name :" + name);
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.display();
		
		Students s2 = new Students( 111 ,"Komal" );
		s2.display();
	}
}
