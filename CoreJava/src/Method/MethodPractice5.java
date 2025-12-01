package Method;

public class MethodPractice5 {
//	Use arithmetic operators to perform +, -, *, /, % on two numbers.
	public void ArithmeticOperations() {
		int a =20 ,b=10;
		System.out.println("Addition of two number is :" + (a+b));
		System.out.println("Substraction of two number is : " +(a-b));
		System.out.println("Multiplication of two number is :" +(a));
		System.out.println("Division of two number is :" + (a/b));
		System.out.println("Modulo of two number is :" + (a%b));
	}
//
//	Check whether two numbers are equal using relational operators.
	public void Equality() {
		int a =10;
		int b =20;
		if(a==b) {
			System.out.println("Two Numbers are equal");
		}
		else {
			System.out.println("Two numbers are not equal");
		}
	}
//
//	Demonstrate pre-increment vs post-increment.
	
//
//	Write a program using logical operators to validate eligibility:
//	– Age > 18 and marks ≥ 60.
	public void eligibility() {
		int age = 20;
		int marks =30;
		if(age>=18 && marks>=60) {
			System.out.println("Person is eligible to take admission in the College");
		}
		else {
			System.out.println("Person is not eligible to tkae admission in the college");
		}
	}
//
//	Use assignment operators to update value of a variable stepwise.
//
	public void UpdateValue() {
		
	}
//	Use ternary operator to find greater between two numbers.
//
//	Use bitwise operators to perform operations &, |, ^.
//
//	Write a program that swaps two numbers using arithmetic operators only.
//
//	Demonstrate (a++ + ++a) behavior through output.
//
//	Use short-circuit AND(&&) to show difference from bitwise AND(&).
}
