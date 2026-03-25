package oops.Polymorphism.overload;

public class PracticeOverload2 {
//	1️⃣ Basic Overloading
//	Create a class Calculator with a method add().
//	Overload the method to add:
//
//	two integers
//
//	two double values
	public void add(int a , int b) {
		System.out.println("Addition :" + (a+b));
	}
	public void add(double a , double b) {
		System.out.println("Addition : " + (a+b));
	}
	
	
//
//	2️⃣ Different Number of Parameters
//	Create a class Printer with method print().
//	Overload it to print:
//
//	one integer
//
//	two integers
//
//	three integers
	public void print(int a) {
		System.out.println("Value of a : " + a);
	}
	public void print(int a ,int b) {
		System.out.println("Addition of two integers : " + (a+b));
	}
	public void print(int a , int b , int c) {
		System.out.println("Addition of Three Integers : " + (a+b+c));
	}
//
//	3️⃣ Different Data Types
//	Create a class Display with overloaded method show():
//
//	show(int a)
//
//	show(String s)
	public void show(int a) {
		System.out.println("Value of a : " + a);
	}
	public void show(String s) {
		System.out.println("Value of S : " + s);
	}
	
//
//	4️⃣ Different Order of Parameters
//	Create a class MathOperation with overloaded method calculate():
//
//	calculate(int a, double b)
//
//	calculate(double a, int b)
	public void calculate(int a , double b) {
		double add = a + b;
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		System.out.println("Addition : " + add);
	}
	
	public void calculate(double a , int b) {
		double add = a + b;
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		System.out.println("Addition : " + add);
	}
//
//	5️⃣ Overloading with Type Promotion
//	Create a class Test with method sum(int a, int b).
//	Call it using:
//
	public void sum(int a ,int b) {
		int sum = a + b; 
		System.out.println("Sum of a and b : " + sum);
	}
//	byte values
//
//	short values
//
//	Observe how Java performs type promotion.
	
	public static void main(String[] args) {
		PracticeOverload2 p = new PracticeOverload2();
		//Add method
		p.add(12, 13);
		p.add(23.23, 12.24);
		
		//Print method
		p.print(12);
		p.print(12, 23);
		p.print(11, 12, 13);
		
		//Show method
		p.show(12);
		p.show("Komal Narawade");
		
		//calculate
		p.calculate(12.23, 12);
		p.calculate(12, 12.23);
		
		//sum
		byte x = 10;
		byte y = 12;
		
		p.sum(x, y);
		
		short a = 10;
		short b = 12;
		
		p.sum(a, b);
			
	}
}
