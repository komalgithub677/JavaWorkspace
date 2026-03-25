package oops.Polymorphism.overload;

import java.util.Scanner;

public class Calculators {
//	Calculator Overloading
//	Create a class Calculator and overload a method add() to:
//
//	add two integers
//
//	add three integers
//
//	add two double values
	public void add(int a ,int b) {
		System.out.println("Addition of Two Numbers : " + (a+b));
	}
	
	public void add(int a ,int b , int c) {
		System.out.println("Addition of three numbers : " + (a + b + c)); 
	}
	
	public void add(double c , double d) {
		System.out.println("Addition of two numbers : " + (d + c));
	}
	
	public static void main(String[] args) {
		Calculators cal = new Calculators();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number a :");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number b :");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number c :");
		int c = sc.nextInt();
		
		System.out.println("Enter the fourth number d : ");
		double d =sc.nextInt();
		
		System.out.println("Enter the fifith number e : ");
		double e = sc.nextInt();
		
		cal.add(a, b);
		
		cal.add(a, b, c);
		
		cal.add(d, e);
	}
}
