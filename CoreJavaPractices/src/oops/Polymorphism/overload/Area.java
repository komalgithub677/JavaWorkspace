package oops.Polymorphism.overload;

public class Area {
//	3.Create a method area() to calculate:
//		area of circle
//		area of rectangle
             public void area(double length , double width) {
            	    double area = length * width;
            	    System.out.println("Area of Rectangle : " + (area));
             }
             
             public void area(double r ) {
            	 double pi = 3.14;
            	 double area = pi * r * r;
            	 System.out.println("Area of the Circle : " + area);
             }
             
             public static void main(String[] args) {
				Area a = new Area();
				a.area(12);
				a.area(12, 13);
			}
}
