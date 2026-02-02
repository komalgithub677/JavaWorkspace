package practice;

public class VariablePractice {
//	🔹 Java Variables & Data Types – Solve These
//	1️⃣ Variable Declaration
//
//	Write a Java program to:
//
//	Declare an int, double, char, and boolean
//
//	Assign values
//
//	Print them
	public void variableDeclaration() {
		int a = 10;
		double b =20;
		boolean isPassed = true;
		
		System.out.println("Value of variable : " + a);
		System.out.println("Value of variable b" + b);
		System.out.println("Value of boolean variable : " + isPassed);
	}
//
//	2️⃣ Default Values
//
//	Write a program to print the default values of instance variables of all primitive data types.
	String s;
	int age;
//
//	3️⃣ Local Variable Error
//
//	What will happen when you run this code? Why?
//
	
//
//	4️⃣ Type Casting (Implicit)
//
//	Write a program that assigns an int value to a double variable and prints the result.
	public void typeCasting() {
		int a = 10;
		double b = 23;
		System.out.println(b);
		int c = (int)12.30;
		System.out.println(c);
	}
	
//
//	5️⃣ Type Casting (Explicit)
//
//	Write a program that:
//
//	Converts a double value 98.76 to int
//
//	Prints both values
//
//	6️⃣ Final Variable
//
//	Write a program where:
//
//	A variable is declared as final
//
//	Try to change its value
//	What error do you get?
//
//	7️⃣ Char and ASCII
//
//	Write a program to:
//
//	Store a character 'A'
//
//	Print its ASCII value
//
//	8️⃣ Boolean Logic
//
//	Write a program that:
//
//	Declares two boolean variables
//
//	Prints the result of &&, ||, and ! operators
//
//	9️⃣ Variable Naming Rules
//
//	Identify valid and invalid variable names:
//
//	int 1value;
//	int _value;
//	int $amount;
//	int totalAmount;
//	int class;
//
//
//	Explain why.
//
//	🔟 Size of Data Types
//
//	Write a program to print:
//
//	Size of int
//
//	Size of double
//
//	Size of char
//
//	(Hint: use wrapper classes)
             public static void main(String[] args) {
            	 VariablePractice v = new VariablePractice();
            	 v.variableDeclaration();
            	 System.out.println(v.s);
            	 System.out.println(v.age);
            	 
            	 v.typeCasting();
            	 
//            	 int x;
//     	        System.out.println(x); //local variable initialization error
			}
}
