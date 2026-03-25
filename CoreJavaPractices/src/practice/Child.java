package practice;

public class Child extends Parent{
// if a child class constructor does not called the Parent class constructor explicitly when object get created of the child class then jvm automatically
//insert the constructor automatically	
	        Child(){
	        	System.out.println("Child class constructor");
	        }
        public static void main(String[] args) {
			Child c = new Child();
		}
}
