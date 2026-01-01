package SwitchCase;

import java.util.Scanner;

public class SwitchCasePractice1 {
//	1️⃣ Day of the Week
//
//	Write a program that takes a number (1–7) and prints the corresponding day of the week.
	
	public void daysOfWeek(int days) {
		
		switch(days) {
		case 1 : 
			System.out.println("Day is sunday");
		break;
		
		case 2:
			System.out.println("Day is monday");
		break;
		
		case 3:
			System.out.println("Day is tuesday");
		break;
		
		case 4:
			System.out.println("Day is wednesday");
		break;
		
		case 5:
			System.out.println("Day is Thursday");
		break;
		
		case 6:
			System.out.println("Day is friday");
		break;
		
		case 7:
			System.out.println("Day is saturday");
		break;
		
		default:
			System.out.println("You entered the wrong day");
		}
	}
//
//	2️⃣ Simple Calculator
//
//	Write a program that:
//
//	Takes two numbers
//
//	Takes an operator (+, -, *, /)
//
//	Performs the operation using switch-case
	
	public void calculator(String ch , int a , int b) {
	     switch(ch) {
	     case "+":
	    	 int add = a + b;
	    	 System.out.println("Addition of two numbers : " + (a+b));
	     break;
	     
	     case "-":
	    	 int sub = a-b;
	    	 System.out.println("Substraction of two numbers : "  + (a-b));
	    break;
	    
	     case "*":
	    	 int mul = a *b;
	    	 System.out.println("Multiplication of two numbers : " + (a*b));
	    break;
	    
	     case "/":
	    	 int div = a/b;
	    	 System.out.println("Division of two numbers : " +  (a/b));
	    break;
	    
	    default:
	    	System.out.println("Ypu entered the wrong operator ");
	     }
	}
//
//	3️⃣ Vowel or Consonant
//
//	Write a program to check whether a given character is a vowel or consonant using switch-case.
	
	
//
//	4️⃣ Month Name
//
//	Write a program that takes a month number (1–12) and prints the month name.
//
//	5️⃣ Number of Days in a Month
//
//	Write a program to print the number of days in a month using switch-case.
//
//	6️⃣ Grade System
//
//	Write a program that takes a grade character (A, B, C, D, F) and prints the meaning of the grade.
//
//	7️⃣ Traffic Signal
//
//	Write a program that takes a signal color (Red, Yellow, Green) and prints the action to perform.
//
//	8️⃣ Menu-Based Program
//
//	Write a menu-driven program:
//
//	1. Tea
//	2. Coffee
//	3. Juice
//	4. Water
//
//
//	Print the selected item using switch-case.
//
//	9️⃣ Even or Odd (Using Switch)
//
//	Write a program to check whether a number is even or odd using switch-case.
//
//	🔟 Area Calculation
//
//	Write a program to calculate the area of:
//
//	Circle
//
//	Rectangle
//
//	Triangle
//	Use switch-case to select the shape.
	
	public static void main(String[] args) {
		 SwitchCasePractice1 s = new  SwitchCasePractice1();
		 
		 Scanner sc = new Scanner("Sytem.in");
		 
		 System.out.println("Enter the day You want : ");
		 int days = sc.nextInt();
		 
		 s.daysOfWeek(days);
		 
		 System.out.println("Enter the operator");
		 String ch = sc.next();
		 
		 s.calculator(ch, days, days);
		 
		 
		 
	}
}
