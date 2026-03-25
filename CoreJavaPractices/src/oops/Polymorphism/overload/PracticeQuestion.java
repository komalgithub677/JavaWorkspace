package oops.Polymorphism.overload;

public class PracticeQuestion {
//	🔹 Method Overloading – Practice Questions (20)
//	Basic Level
//
//	1️⃣ Create a class Calculator with overloaded add() methods to add:
	public void add() {
		System.out.println("Addition of two numbers");
	}
	public void add(int a ,int b) {
		System.out.println(a+b);
	}
//
//	two integers
//
//	three integers
//
//	2️⃣ Write a program to overload a method display() to print:
//
//	an integer
//
//	a string
	
	public void display(int a ) {
		        System.out.println(a);
	}
	public void display( String s) {
		System.out.println(s);
	}
//
//	3️⃣ Create overloaded methods multiply() to multiply:
//
//	two integers
//
//	two doubles
	public void multiply(int a , int b) {
		System.out.println("Multiplication of Two numbers : " + (a*b));
	}
	public void multiply(double a , double b) {
		System.out.println("Multiplication of two numbers  : " + (a*b));
	}
//
//	4️⃣ Write a class Area with overloaded methods to calculate:
//
//	area of square
//
//	area of rectangle
	
	public void area(int length , int width) {
		System.out.println("Area of rectangle : " + (length * width));
	}
	public void area(int r , float pi) {
		System.out.println("Area of cicrcle : " + (pi * r*r));
	}
//
//	5️⃣ Create a method sum() that accepts:
//
//	two integers
//
//	variable number of integers (var-args)
	public void sum(int a , int b) {
		System.out.println(a+b);
	}
	public void sum(int a ,int b ,int c) {
		System.out.println(a+b+c);
	}
//
//	Intermediate Level
//
//	6️⃣ Write a program to overload method login() for:
//
//	username & password
//
//	mobile number & OTP
	public void login(String username , String password) {
		System.out.println("Username  : " + username );
		System.out.println("   Password :  " + password );
	}
	
	public void login(long mobNo , String otp) {
		System.out.println("mobNo : " + mobNo);
		System.out.println("Otp : " + otp);
	}
	
//
//	7️⃣ Create a class Student and overload method getDetails() to accept:
//
//	roll number
	public void getDetails(int rollNo) {
		System.out.println("Roll No : " + rollNo);
	}
//
//	roll number & name
	public void getDetails(int rollNo , String name) {
		System.out.println("Roll No : " + rollNo);
		System.out.println("Nmae : " + name);
	}
//
//	roll number, name & marks
	public void getDetails(int rollNo ,String name , int marks) {
		System.out.println("roll No : " + rollNo);
		System.out.println("Name :" + name);
		System.out.println("Marks : " + marks);
	}
	
//
//	8️⃣ Overload a method print() using:
//
//	int parameter
//
//	float parameter
	public void print(int a) {
		System.out.println(a);
	}
	public void print(float a) {
		System.out.println(a);
	}
//
//	9️⃣ Write a program where method overloading is done by changing parameter order.
	public void changingParameter(int a ,String b) {
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}
	public void changingParameter(String b , int a) {
		System.out.println("Value of b : " + b);
		System.out.println("Value of a : " + a);
	}
//
//	🔟 Create overloaded methods calculate() to calculate:
//
//	simple interest
	public void calculate(int p , int r , int t) {
	            int si = (p*r*t)/100;
	            System.out.println(si);
	}
//	compound interest
	public void calculate(int p ,int r ,int t , boolean isCompound) {
		int CI = (int) (p * Math.pow((1 + r / 100), t) - p);
		System.out.println("Compound interest would be : " + CI);
	}
//


}
