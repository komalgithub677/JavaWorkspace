package scanner;

import java.util.Scanner;

public class MultiplicationDivision {
             public void multiplicationDivision(int a , int b) {
            	 System.out.println("Multiplication of two number is :" + (a*b));
            	 System.out.println("Division of two number is : " + (a/b));
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter first number a : ");
				int a = sc.nextInt();
				
				System.out.println("Enter the second number b : ");
				int b = sc.nextInt();
				
				MultiplicationDivision m = new MultiplicationDivision();
				m.multiplicationDivision(a, b);
			}
}
