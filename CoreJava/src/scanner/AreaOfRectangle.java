package scanner;

import java.util.Scanner;

public class AreaOfRectangle {
             public void area(int length , int width) {
            	 int area = length * width;
            	 System.out.println("Area of rectangle is : " + area);
             }
             
             public static void main(String[] args) {
				    Scanner sc = new Scanner(System.in);
				    
				    System.out.println("Enter length : ");
				    int length = sc.nextInt();
				    
				    System.out.println("Enter width : ");
				    int width = sc.nextInt();
				    
				    AreaOfRectangle a =new AreaOfRectangle();
				    a.area(length, width);
				    
			}
}
