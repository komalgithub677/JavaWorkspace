
public class Circle extends Shape{

	@Override
	public void area() {
		double radius =12.10;
		double pi = 3.14;
		
		double area = pi * radius * radius;
		System.out.println("Area of circle : " + area);
		
	}
            
}
