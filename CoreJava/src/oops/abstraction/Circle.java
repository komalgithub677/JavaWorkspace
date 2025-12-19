package oops.abstraction;

public class Circle implements Shape{
             public void draw() {
            	 System.out.println("Draw the circle of the given radius");
             }
             
             public void area(double r , double pi) {
            	 pi = 3.14;
            	 double area = pi *  r * r;
            	 System.out.println("Area of the circle : " + area);
             }
             
             public static void main(String[] args) {
				Circle c = new Circle();
				c.area(34.12, 12.34);
				c.draw();
			}
}
