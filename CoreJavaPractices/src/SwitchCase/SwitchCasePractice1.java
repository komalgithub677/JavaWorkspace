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
	
	public void vowelOrConsonant(String ch1) {
		switch(ch1) {
		
		case "a":
			System.out.println("Vowel a");
		break;
		
		case "i":
			System.out.println("Vowel i");
		break;
		
		case"u":
			System.out.println("Vowel u ");
		break;
		
		case "e":
			System.out.println("vowel e");
		break;
		
		case "o":
			System.out.println("vowel u");
		break;
		
		default:
			System.out.println("you haven't enter the correct vowel");
		
		}
	}
//
//	4️⃣ Month Name
//
//	Write a program that takes a month number (1–12) and prints the month name.
//
//	5️⃣ Number of Days in a Month
	
	public void month(int month) {
		switch(month) {
		case 1:
			System.out.println("January : Days 31");
		break;
		
		case 2:
			System.out.println("February : Days 29 or 28");
		break;
		
		case 3:
			System.out.println("March : Days 31");
		break;
		
		case 4:
			System.out.println("April : Days 30");
		break;
		
		case 5:
			System.out.println("May :  Days 31" );
		break;
		
		case 6:
			System.out.println("June : Days 30");
		break;
		
		case 7:
			System.out.println("July : Days 31");
		break;
		
		case 8:
			System.out.println("August :  Days 30");
		break;
		
		case 9:
			System.out.println("September : Days 31");
       break;
       
		case 10:
			System.out.println("October : Days 30");
		break;
		
		case 11:
			System.out.println("November : Days 31");
		break;
		
		case 12:
			System.out.println("December : Days 30");
		break;
		
		default:
			System.out.println("You entered the wrong month");
		}
	}
//
//	Write a program to print the number of days in a month using switch-case.
//
//	6️⃣ Grade System
//
//	Write a program that takes a grade character (A, B, C, D, F) and prints the meaning of the grade.
	
	public void gradeSystem(String grade) {
		        switch(grade) {
		        case "A":
		        	System.out.println("Pass with the distinction: Grade A");
		        break;
		        
		        case "B":
		        	System.out.println("Pass with good marks : Grade B");
		        break;
		        
		        case "C":
		        	System.out.println("Pass with the low marks  : Grade C");
		        break;
		        
		        case "D":
		        	System.out.println("Pass with the low marks : Grde D");
		        break;
		        
		        case "F":
		        	System.out.println("Student Fail : Grde F");
		        break;
		        
		        default:
		        	System.out.println("Yo have entered the invalid grade");
		        
		        
		        
		        }
	}
//
//	7️⃣ Traffic Signal
//
//	Write a program that takes a signal color (Red, Yellow, Green) and prints the action to perform.
	public void trafficSignal(String colour) {
		switch(colour) {
		case "red":
			System.out.println("Stop");
		break;
		
		case "Yellow":
			System.out.println("Stay ready");
		break;
		
		case "Green":
			System.out.println("Go..");
		break;
		
		default:
			System.out.println("You entered the wrong colour");
		}
	}
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
	public void menu(int num) {
		switch(num) {
		case 1:
			System.out.println("You ordered Tea");
		break;
		
		case 2:
			System.out.println("You orderd the cofee");
		break;
		
		case 3:
			System.out.println("You ordered the juice");
		break;
		
		case 4:
			System.out.println("You ordered the Water");
		break;
		
		default:
			System.out.println("You ordered  the wrong menu which is not available in restaurant");
		}
	}
//
//	Print the selected item using switch-case.
//
//	9️⃣ Even or Odd (Using Switch)	
//
//	Write a program to check whether a number is even or odd using switch-case.
	public void evenOdd(int num1) {
		switch(num1%2) {
		case 0 :
			System.out.println("Number is even");
		break;
		
		case 1:
			System.out.println("Number is odd");
		break;
		
		default:
			System.out.println("You have entered the wrong number");
		}
	}
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
	public void area(String shape) {
		switch(shape) {
		case "Circle":
			double r = 34.13;
			double pi =3.14;
			double area = pi * r * r;
			System.out.println("Area of circle would be : " + area);
		break;
		
		case "Rectangle":
			int length = 12;
			int width = 13;
			int area1 =length * width;
			System.out.println("Area of the rectangle would be : " + area1);
		break;
		
		case "Triangle":
			int base =10;
			int height = 20;
			int area3 = 1/2*(base *height);
			System.out.println("Area of the Triangle would be : " + area3);
		break;
		
		default:
			System.out.println("You have entered the wrong shape : ");	
		}
	}
	
	public static void main(String[] args) {
		 SwitchCasePractice1 s = new  SwitchCasePractice1();
		 
		 Scanner sc = new Scanner("Sytem.in");
		 
		 System.out.println("Enter the day You want : ");
		 int days = sc.nextInt();
		 
		 s.daysOfWeek(days);
		 
		 System.out.println("Enter the operator");
		 String ch = sc.next();
		 
		 s.calculator(ch, days, days);
		 
		 System.out.println("Enter vowel");
		 String ch1 = sc.nextLine();
		 
		 s.vowelOrConsonant(ch1);
		 
		 System.out.println("Enter the Month");
		 int month = sc.nextInt();
		 
		 s.month(month);
		 
		 System.out.println("Enter the Grade You want : ");
		 String grade = sc.nextLine();
		 
		 s.gradeSystem(grade);
		 
		 System.out.println("Enter the colur you want");
		 String colour = "Red";
		 
		 s.trafficSignal(colour);
		 
		 System.out.println("Enter the menu you want :");
		 int menues = sc.nextInt();
		 
		 s.menu(menues);
		 
		 System.out.println("Enter the number of your choice");
		 int num1 = sc.nextInt();
		 
		 s.evenOdd(num1);
		 
		 System.out.println("Enter the shape : ");
		 String shape =sc.nextLine();
		 
		 s.area(shape);
	}
}
