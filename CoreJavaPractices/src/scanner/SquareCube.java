package scanner;

import java.util.Scanner;

public class SquareCube {
             public void square(int a) {
            	    int square = a * a;
            	    System.out.println("Square would be : " + square);
             }
             
             public void cube(int b) {
            	 int cube = b * b * b;
            	 System.out.println("Cube of the number would be : " + cube );
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the number to square : ");
				int a = sc.nextInt();
				
				System.out.println("Enter number To calculate cube : ");
				int b =sc.nextInt();
				
				SquareCube s = new SquareCube();
				s.square(a);
				s.cube(b);
				
			}
}
