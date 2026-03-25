package oops.inheritance.Types;

public class Y extends X {
//	2.Create class Parent with variable x = 10.
//			Create class Child extending Parent with variable y = 20.
//			Print both values using object of Child.
             int y = 20;
             public static void main(String[] args) {
				Y y = new Y();
				System.out.println("Y  : " + y.y);
				System.out.println("X : " + y.x);
				
			}
             
}
