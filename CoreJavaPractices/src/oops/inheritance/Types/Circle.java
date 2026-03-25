package oops.inheritance.Types;

public class Circle extends Shape {
             public void circle() {
            	 System.out.println("This is the circle");
             }
             public static void main(String[] args) {
				Circle c = new Circle();
				c.shapes();
				c.circle();
			}
}
