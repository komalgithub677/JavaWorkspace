package SwitchCase;

public class SwitchCasePractice {
                public static void main(String[] args) {
//					//
//                	Accept a day number (1–7) and print the day name (Monday to Sunday) using switch case.
                	int day = 6;
                	
                	switch(day) {
                	case 1:
                		System.out.println("Monday");
                	break;
                	
                	case 2:
                		System.out.println("Tuesday");
                	break;
                	
                	case 3:
                		System.out.println("Wednesday");
                	break;
                	
                	case 4:
                		System.out.println("Thursday");
                	break;
                	
                	case 5:
                		System.out.println("Friday");
                	break;
                	
                	case 6:
                		System.out.println("Saturday");
                	break;
                	
                	case 7:
                		System.out.println("Sunday");
                	break;
                	
                	default:
                		System.out.println("Another day");
                	}
//                	Accept a grade (A, B, C, D, F) and print the remark using switch case.
                	char grade ='B';
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
                	
                	case 'D':
                		System.out.println("Pass");
                	break;
                	
                	case 'F':
                		System.out.println("Fail");
                	break;
                	
                	default:
                		System.out.println("Invalid grade");
                	}
//                	Accept a month number (1–12) and print how many days the month has.
                	int month =7;
                	switch(month) {
                	case 1 :
                		System.out.println("January : 31 days");
                	break;
                	
                	case 2 :
                		System.out.println("January : 28/29 days");
                	break;
                	case 3 :
                		System.out.println("January : 31 days");
                	break;
                	case 4 :
                		System.out.println("January : 30 days");
                	break;
                	case 5 :
                		System.out.println("January : 31 days");
                	break;
                	case 6 :
                		System.out.println("January : 30 days");
                	break;
                	case 7 :
                		System.out.println("January : 31 days");
                	break;
                	case 8 :
                		System.out.println("January : 31 days");
                	break;
                	case 9 :
                		System.out.println("January : 30 days");
                	break;
                	case 10 :
                		System.out.println("January : 31 days");
                	break;
                	case 11 :
                		System.out.println("January : 30days");
                	break;
                	case 12 :
                		System.out.println("January : 31 days");
                	break;
                	
                	default:
                		System.out.println("Invalid Day");
                		
                	}
//                	Accept a character and check whether it is a vowel or consonant using switch case.
                	char ch ='A';
                	
                	switch(ch) {
                	case 'A':
                		System.out.println("Vowel");
                	break;
                	
                	case 'I':
                		System.out.println("Vowel");
                	break;
                	
                	case 'O':
                		System.out.println("Vowel");
                	break;
                	
                	case 'U':
                		System.out.println("Vowel");
                	break;
                	
                	case 'E':
                		System.out.println("Vowel");
                	break;
                	
                	default:
                		System.out.println("It is an consonant");
                	}
//                	Create a simple calculator using switch case (addition, subtraction, multiplication, division).
                	char operation = '+';
                	
                	switch(operation) {
                	case '+':
                		int a=2, b=3;
                		System.out.println("Addition = " + (a+b));
                	break;
                	
                	case '-':
                		int c=2, d=3;
                		System.out.println("Addition = " + (c-d));
                	break;
                	
                	case '*':
                		int e=2, f=3;
                		System.out.println("Addition = " + (e*f));
                	break;
                	
                	case '/':
                		int g=2, h=3;
                		System.out.println("Addition = " + (g/h));
                	break;
                	
                	default:
                		System.out.println("Invalid Operation");
                	
                	
                	}
//                	Accept a number between 1–4 and print the corresponding season:
//                	1 → Summer
//                	2 → Rainy
//                	3 → Winter
//                	4 → Spring
                	int num =1;
                	switch(num) {
                	case 1:
                		System.out.println("Summer");
                	break;
                	
                	case 2:
                		System.out.println("Rainy");
                	break;
                	
                	case 3:
                		System.out.println("Winter");
                	break;
                	
                	case 4:
                		System.out.println("Spring");
                	break;
                	
                	default:
                		System.out.println("Season not available that");
                	}
//                	Accept a vehicle type (Car, Bike, Bus, Truck) and print the toll tax amount using switch case.
                	String vehicleType ="Car";
                	
                	switch(vehicleType) {
                	case "Car" :
                		System.out.println("Tax amount would be 100");
                	break;
                	
                	case "Bike" :
                		System.out.println("Tax amount would be 50");
                	break;
                	
                	case "Bus" :
                		System.out.println("Tax amount would be 200");
                	break;
                	
                	case "Truck" :
                		System.out.println("Tax amount would be 300");
                	break;
                	
                	default:
                		System.out.println("No Tax amount");
                	
                	
                	}
//                	Accept a color code (R, G, B, Y) and print the color name.
                	char color = 'R';
                	switch(color) {
                	case 'R':
                		System.out.println("Red");
                	break;
                	
                	case 'G':
                		System.out.println("Green");
                	break;
                	
                	case 'B':
                		System.out.println("Blue");
                	break;
                	
                	case 'Y':
                		System.out.println("Yellow");
                	break;
                	
                	default:
                		System.out.println("Invalid color");
                	}
                	
//                	Accept a number 1–5 and print the star pattern type (Square, Triangle, Pyramid, Diamond, Reverse Triangle).
                	int num1 = 1;
                	switch(num1) {
                	case 1 :
                		System.out.println("Square");
                	break;
                	
                	case 2 :
                		System.out.println("Triangle");
                	break;
                	
                	case 3 :
                		System.out.println("Diamond");
                	break;
                	
                	case 4 :
                		System.out.println("Reverse Triangle");
                	break;
                	
                	default:
                		System.out.println("Not in a given patterns");
                	
                	}
//                	Accept user choice (1–3):
//                	1 → Print “Start”
//                	2 → Print “Stop”
//                	3 → Print “Restart”
//                	Use switch case.
                	int choice = 3;
                	switch(choice) {
                	case 1:
                		System.out.println("Start");
                	break;
                	
                	case 2:
                		System.out.println("Stop");
                	break;
                	
                	case 3:
                		System.out.println("Restart");
                	break;
                	
                	default:
                		System.out.println("Not belongs to that choices");
                	}
				}
}
