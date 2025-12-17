package oops.Polymorphism.MethodOverride;

public class Calculator {
//	Create a class Calculator with a method add() that:
//
//		Adds two integers
	public void add(int a ,int b) {
		System.out.println("Addition of Two integer : " + (a+b));
	}
//
//		Adds two doubles
	public void add(double a , double b) {
		System.out.println("Addition of two double values : " + (a+b));
	}
//
//		Adds three integers
	public void add(int a , int b ,int c) {
		System.out.println("Addition of three integers : " + (a+b+c));
	}
	
	
}
