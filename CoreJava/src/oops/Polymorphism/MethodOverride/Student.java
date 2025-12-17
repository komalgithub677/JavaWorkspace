package oops.Polymorphism.MethodOverride;

public class Student extends Person {
             public void show() {
            	    System.out.println("This is the show method");
             }
             public static void main(String[] args) {
				Student s = new Student();
				s.show();
				
				Person p = new Person();
				p.show();
			}
}
