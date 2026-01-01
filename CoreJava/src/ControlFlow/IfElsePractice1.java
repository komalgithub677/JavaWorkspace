package ControlFlow;

import java.util.Scanner;

public class IfElsePractice1 {
//	1️⃣ Check Even or Odd
	public void evenOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
//
//	Write a program to check whether a given number is even or odd.
//
//	2️⃣ Check Positive, Negative or Zero
	public void positiveNegativeZero(int num1) {
		        if(num1==0) {
		        	System.out.println("Number is zero");
		        }
		        else if(num1>0) {
		        	System.out.println("Number is positive");
		        }
		        else {
		        	System.out.println("Number is negative");
		        }
		        
	}
//
//	Write a program to check whether a number is:
//
//	Positive
//
//	Negative
//
//	Zero
//
//	3️⃣ Find the Greatest of Two Numbers
	public void greatestNumber(int a ,int b) {
		if(a>b) {
			System.out.println("Number a is greater");
		}
		else {
			System.out.println("Number b is greater");
		}
	}
//
//	Write a program to find the largest of two numbers using if-else.
//
//	4️⃣ Find the Greatest of Three Numbers
//
//	Write a program to find the largest of three numbers using else-if.
	public void greatestOfThree(int x , int y , int z) {
		if(x>y && x>z) {
			System.out.println("X is greater");
		}
		else if(y>x && y>z) {
			System.out.println("Y is greater");
		}
		else {
			System.out.println("Z is greater");
		}
	}
//
//	5️⃣ Check Leap Year
//
//	Write a program to check whether a given year is a leap year or not.
	public void leap
//
//	6️⃣ Check Vowel or Consonant
//
//	Write a program to check whether a given character is a vowel or consonant.
//
//	7️⃣ Student Grade System
//
//	Write a program to assign grades based on marks:
//
//	Marks	Grade
//	≥ 90	A
//	≥ 75	B
//	≥ 60	C
//	≥ 40	D
//	< 40	Fail
//	8️⃣ Electricity Bill Calculation
//
//	Write a program to calculate electricity bill:
//
//	Units ≤ 100 → ₹1/unit
//
//	Units 101–200 → ₹2/unit
//
//	Units > 200 → ₹3/unit
//
//	9️⃣ Check Eligibility for Voting
//
//	Write a program to check if a person is eligible to vote (age ≥ 18).
//
//	🔟 Simple Calculator
//
//	Write a program that:
//
//	Takes two numbers
//
//	Takes an operator (+, -, *, /)
//
//	Performs the operation using if-else
	
	public static void main(String[] args) {
		IfElsePractice1 i = new IfElsePractice1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		i.evenOdd(num);
		
		System.out.println("Enter your num1 : ");
		int num1 = sc.nextInt();
		i.positiveNegativeZero(num1);
		
		System.out.println("Enter the forst number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b =sc.nextInt();
		
		i.greatestNumber(a, b);
		
		System.out.println("Enter the first number x : ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second number y : ");
		int y =sc.nextInt();
		
		System.out.println("Enter the third number z : ");
		int z = sc.nextInt();
		
		i.greatestOfThree(x, y, z);
		
		
		
		
	}
}
