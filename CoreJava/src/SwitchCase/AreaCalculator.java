package SwitchCase;

public class AreaCalculator {
       public static void main(String[] args) {
    	   //Choice → circle/rectangle/triangle.
		String choice = "circle";
		
		switch(choice) {
		case "circle":
			int radius = 10;
			int area = radius * radius;
			System.out.println("Area of the circle would be" + (area));
		break;
		
		case "rectangle":
			int length = 20;
			int width = 12;
			int area1 = length * width;
			System.out.println("area of the rectangle would be :" + (area1));
		break;
		
		case "triangle":
			int height = 10;
			int base = 20;
			int area2 =  1/2*(base*height);
			System.out.println("Are of triangle would be the :" +(area2));
		break;
		default:
			System.out.println("Invalid choice");
			
		}
	}
}
