package scanner;

import java.util.Scanner;

public class PerimeterOfTriangle {
             public void perimeter(int a ,int b ,int c) {
            	 int perimeter = a + b + c;
            	 System.out.println("Peritmeter of the triangle is : " + perimeter);
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the first side :" );
				int a = sc.nextInt();
				
				System.out.println("Enter the Second side : ");
				int b = sc.nextInt();
				
				System.out.println("Enter the Third side : ");
				int c = sc.nextInt();
		
				PerimeterOfTriangle p = new PerimeterOfTriangle();
				p.perimeter(a, b, c);
			}
}
