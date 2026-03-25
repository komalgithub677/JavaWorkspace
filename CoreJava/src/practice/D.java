package practice;

public class D {
//	Create a class with default constructor
	
//	Create a class with parameterized constructor
	int id;
	String name;
	String city;
	public D(int id) {
		this.id = id;
	}
//	Create multiple constructors (constructor overloading)
	public D(int id , String name) {
		this.id =id;
		this.name =name;
	}
	
	public D(int id , String name , String city) {
		this.id =id;
		this.name =name;
		this.city = city;
	}
	
	public void display() {
		System.out.println("id :" + id);
		System.out.println("Name :" + name);
		System.out.println("city : " + city);
	}
//	Initialize object using constructor
//	Print values using constructor initialization
	
	public static void main(String[] args) {
//		D d = new D(); if we specify the explicitly constructor then compiler will not provide the default constructor
		D d1 = new D(1);
		D d2 = new D(1 ,"Komal");
		D d3 = new D(1,"Disha" , "Pune");
		d1.display();
		d2.display();
		d3.display();
	}
	

}
