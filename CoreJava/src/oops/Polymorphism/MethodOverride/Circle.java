package oops.Polymorphism.MethodOverride;

public class Circle extends Shape {
           public void draw() {
        	   System.out.println("This is a Circle");
           }
           public static void main(String[] args) {
			Circle c = new Circle();
			c.draw();
			
			Shape s = new Shape();
			s.draw();
		}
}
