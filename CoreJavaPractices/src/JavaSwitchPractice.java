
public class JavaSwitchPractice {
//	Basic Coding
//
//	Write a Java program using switch to print the day of the week for numbers 1–7.
	public void days() {
		int days = 1;
		switch(days) {
		case 1 :
			System.out.println("Day is monday");
		break;
		
		case 2:
			System.out.println("Day is tuesday");
		break;
		
		case 3:
			System.out.println("Day is wednesday");
		break;
		
		case 4:
			System.out.println("Day is Thursday");
		break;
		
		case 5:
			System.out.println("Day is Friday");
		break;
		
		case 6:
			System.out.println("Day is saturday");
		break;
		
		case 7:
			System.out.println("Day is sunday");
		break;
		
		default:
			System.out.println("You have entered the wrong day");
		}
	}
//
//	Write a program to print the month name based on month number (1–12).
	public void monthCheck() {
		int month = 1;
		
		switch(month) {
		case 1 : 
			System.out.println("January");
		break;
		
		case 2 : 
			System.out.println("February");
		break;
		
		case 3 : 
			System.out.println("March");
		break;
		
		case 4 : 
			System.out.println("April");
		break;
		
		case 5 : 
			System.out.println("May");
		break;
		
		case 6 : 
			System.out.println("June");
		break;
		
		case 7 : 
			System.out.println("July");
		break;
		
		case 8 : 
			System.out.println("August");
		break;
		
		case 9 : 
			System.out.println("September");
		break;
		
		case 10 : 
			System.out.println("October");
		break;
		
		case 11 : 
			System.out.println("November");
		break;
		
		case 12 : 
			System.out.println("December");
		break;
		
		default :
			System.out.println("You have entered the wrong month");
		}
	}
//
//	Write a switch program to check whether a number is positive, negative, or zero.
	public void PositiveNegativeZero() {
		int num = 2;
		
		switch(num) {
		case 1 :
			System.out.println("Number is positive");
		break;
		
		case 2:
			System.out.println("Number is negative");
		break;
		
		case 3:
			System.out.println("Number is zero");
		break;
		
		default:
			System.out.println("You entered the invalid number");
			
		}
	}
//
//	Write a program using switch to check whether a character is a vowel or consonant.
	public void VowelConsonant() {
		char ch = 'a';
		
		switch(ch) {
		case 'a':
			System.out.println("Vowel a");
		break;
		
		case 'i':
			System.out.println("Vowel i");
		break;
		
		case 'o':
			System.out.println("Vowel o");
		break;
		
		case 'u':
			System.out.println("Vowel u");
		break;
		
		case 'e':
			System.out.println("Vowel e");
		break;
		
		case 'A':
			System.out.println("Vowel A");
		break;
		
		case 'I':
			System.out.println("Vowel I");
		break;
		
		case 'O':
			System.out.println("Vowel O");
		break;
		
		case 'U':
			System.out.println("Vowel U");
		break;
		
		case 'E':
			System.out.println("Vowel E");
		break;
		
		default:
			System.out.println("Character is consonant");
		
		}
	}
//
//	Write a Java program using switch to display the number of days in a month.
	public void daysInMonth() {
		int days = 1;
		
		switch(days) {
		case 1 :
			System.out.println("thirty days");
		break;
		
		case 2:
			System.out.println("31 days");
		break;
		
		case 3:
			System.out.println("29 days");
		break;
		
		default:
			System.out.println("You have entered the wrong days");
		}
	}
//
//	Logical / Condition-Based
//
//	Write a program using switch to implement a simple calculator ( + , − , × , ÷ ).
	public void calculator() {
		char operator = '+';
		
		switch(operator){
		case '+':
			int a = 10 , b=20;
			System.out.println("Addition : " + (a + b));
		break;
		
		case '-':
			int d = 20 , c =30;
			System.out.println("Substraction : " + ( d - c));
		break;
		
		case '*':
			int e = 10 ,f =30;
			System.out.println("Multiplication : " + (e * f));
		break;
		
		case '/':
			int g = 23 , h =10;
			System.out.println("Division : " + (g/h));
		break;
		
		case '%':
			int i = 10 , j =20;
			System.out.println("Remainder : " + (i%j));
		break;
		
		default:
			System.out.println("You have entere the wrong operator : ");
		}
	}
//
//	Write a switch program to check whether a number is even or odd.
	public void evenOdd() {
		int num =10;
		
		switch(num%2) {
		case 0 :
			System.out.println("Number is Even");
		break;
		
		case 2:
			System.out.println("Number is odd");
		break;
		
		default:
			System.out.println("You have entered the wrong number");
		}
	}
//
//	Write a program using switch to display grade description:
//	A → Excellent, B → Good, C → Average, others → Fail
	public void grade() {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
		break;
		
		case 'B':
			System.out.println("Good");
		break;
		
		case 'C':
			System.out.println("Average");
		break;
		
		default:
			System.out.println("You are failed : ");
		}
	}
//
//	Write a Java program using switch to print menu-driven operations (1–Insert, 2–Update, 3–Delete, 4–Exit).
	public void menuDrivenCalculator() {
		int menu = 1;
		switch(menu) {
		case 1 :
			System.out.println("Insert the values");
		break;
		
		case 2 :
			System.out.println("Update");
		break;
		
		case 3:
			System.out.println("Delete");
		break;
		
		case 4 :
			System.out.println("Exit");
		break;
		
		default:
			System.out.println("You have entered the wrong values");
		}
	}
//
//	Write a program using switch to convert numbers (1–5) into words.
	public void numberIntoWords() {
		int num = 1;
		
		switch(num) {
		case 1 :
			System.out.println("One");
		break;
		
		case 2:
			System.out.println("Two");
		break;
		
		case 3:
			System.out.println("Three");
		break;
		
		case 4:
			System.out.println("Four");
		break;
		
		case 5:
			System.out.println("Five");
		break;
		
		default:
			System.out.println("You have entered the wrong number which cannot convert into words : ");
		}
	}
//
//	String & Character Based
//
//	Write a program using switch to perform actions based on user role (admin, user, guest).
	public void actions() {
		String role = "admin";
		
		switch(role) {
		case "admin":
			System.out.println("You have an admin right");
		break;
		
		case "user":
			System.out.println("You are an user");
		break;
		
		case "guest":
			System.out.println("You are an guest");
		break;
		
		default:
			System.out.println("you do not have any role");
		}
	}
//
//	Write a Java program using switch to check traffic signal color and print the instruction.
	public void trafficSignal() {
		String color = "red";
		
		switch(color) {
		case "green":
			System.out.println("Go...");
		break;
		
		case "yellow":
			System.out.println("Get ready : ");
		break;
		
		case "red":
			System.out.println("Stop");
		break;
		
		default:
			System.out.println("You enterd the wrong which are not in the traffic signal ");
		}
	}
//
//	Write a program using switch to identify weekday or weekend.
	public void weekday() {
		int day = 1;
		
		switch(day) {
		case 1-5:
			 System.out.println("Weekdays");
		break;
		
		case 6-7:
			System.out.println("Weekend");
		break;
		
		default:
			System.out.println("You have entered the wrong day which does not belong to the weekdays or weekend");
		}
	}
//
//	Write a Java program using switch to display season name based on month.
	public void seasonName() {
		        int month =1;
		        
		        switch(month) {
		        case 2:
		        case 3:
		        	
		        	System.out.println("Spring");
		        break;
		        
		        case 4:
		        case 5:
		        case 6:
		        	System.out.println("Summer");
		        break;
		        
		        case 7:
		        case 8:
		        case 9:
		        	System.out.println("Monsoon");
		        break;
		        
		        case 10:
		        case 11:
		        case 12:
		        case 1:
		        	System.out.println("Winter");
		        break;
		        
		        default:
		        	System.out.println("You have entered the wrong season");
		        	
		        }
	}
//
//	Validation & Real-World Logic
//
//	Write a program using switch to validate a simple ATM menu.
	public void ATMMenu() {
		int key = 1;
		switch(key) {
		case 1 :
			System.out.println("Enter you account number");
		break;
		
		case 2:
			System.out.println("Enter the amount you want ");
		break;
		
		case 3:
			System.out.println("Enter the number of you notes count haved to withdraw in the multiple of 500");
		break;
		
		case 4:
			System.out.println("enter your pin");
		break;
			
		case 5:
			System.out.println("Take your money");
		break;
		
		case 6:
			System.out.println("Exit");
		break;
		
		default:
			System.out.println("invalid operation");
		}
	}
//
//	Write a Java program using switch to calculate electricity bill slabs.
	public void electricity() {
		int units = 250;
		int bills = 0;
		
		int slab;
		
		if(units<=100) {
			slab =1;
		}
		else if(units<=200) {
			slab = 2;
		}
		else if(units<=300) {
			slab = 3;
		}
		else {
			slab = 4;
		}
		
		switch(slab) {
		case 1:
			bills = units * 1;
		break;
		
		case 2:
			bills = 100 * 1+(units -100)* 2; 
		break;
		
		case 3:
			bills = (100 * 1) + (100 * 2) + (units -100) * 3;
		break;
		
		case 4:
			bills = (100 * 1 ) + (100 * 2 ) + (100 * 3) + (units -100 ) * 4;
		break;
		
	
			
		}

		System.out.println("Electricity Billl : " + bills);
		
	}
//
//	Write a program using switch to check input character type (digit, alphabet, special character).
	public void characterType() {
	    char ch = '2';
	    int type;

	    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	        type = 1;
	    } 
	    else if (ch >= '0' && ch <= '9') {
	        type = 2;
	    } 
	    else {
	        type = 3;
	    }

	    switch (type) {
	        case 1:
	            System.out.println("Alphabet");
	            break;

	        case 2:
	            System.out.println("Digit");
	            break;

	        case 3:
	            System.out.println("Special character");
	            break;
	    }
	}

//
//	Write a Java program using switch to map country code to country name.
	
//
//	Write a program using switch to determine shipping cost based on delivery type.
//
//	Write a Java program using switch to display course name based on course ID.
	public static void main(String[] args) {
		JavaSwitchPractice j = new JavaSwitchPractice();
		
		j.monthCheck();
		j.days();
		j.PositiveNegativeZero();
		j.daysInMonth();
		j.calculator();
		j.evenOdd();
		j.grade();
		j.menuDrivenCalculator();
		j.numberIntoWords();
		j.trafficSignal();
		j.actions();
		j.VowelConsonant();
		j.weekday();
		j.seasonName();
		j.ATMMenu();
		j.electricity();
		j.characterType();
		
	}
}
