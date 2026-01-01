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
//
//	Write a program to find the largest of two numbers using if-else.
//
//	4️⃣ Find the Greatest of Three Numbers
//
//	Write a program to find the largest of three numbers using else-if.
//
//	5️⃣ Check Leap Year
//
//	Write a program to check whether a given year is a leap year or not.
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
	}
}
