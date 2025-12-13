package scanner;

import java.util.Scanner;

public class AreaOfCircle {
             public void area(float radius) {
            	 float area = radius * radius;
            	 System.out.println("Area of The Circle is : " + area);
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter radius : ");
				float radius = sc.nextFloat();
				
				AreaOfCircle a = new AreaOfCircle();
				a.area(radius);
				
			}
}
