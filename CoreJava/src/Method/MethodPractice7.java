package Method;

public class MethodPractice7 {
//	🔥 20 Advanced / Hard Switch Case Problems (Java)
//
//	Use classic switch, enhanced switch expression, nested switch, and fall-through where required.
	
//
//	Write a menu-driven switch program that performs different mathematical operations:
//
//	Power, Square-Root, Factorial, Permutation, Combination.
//
//	Create a switch program that evaluates student performance based on two parameters:
//
//	Theory Marks + Practical Marks
//	Use nested switch for grade decision.
//
//	Implement a switch using string cases where a user enters a programming language and you must return:
//
//	Frameworks related to that language
//	(Java → Spring/Servlets, Python → Django/Flask, etc.)
	
	public void Language() {
		String language = "Java";
		
		switch(language) {
		case "Java":
			System.out.println("Framework related to the java are : Spring /Servets");
		break;
		
		case "Python":
			System.out.println("Framework related to the laguage are : Django/Flask");
		break;
		
		case "Javscript":
			System.out.println("Framework related to the javascript are the : React");
		break;
		
		case "Css":
			System.out.println("Framework related to the css are :  bootstrap" );
		break;
		
		default:
			System.out.println("The framework not related to the langauage");
		}
		
	}
//
//	Build a switch-based calculator that supports:
//
//	+, −, ×, ÷, %, Average, Logarithm (using Math.log).
//
//	Write a switch program to classify a triangle based on side lengths or angles.
//
//	Use a switch to convert a number system:
//
//	Decimal → Binary, Octal, Hex
//
//	Binary → Decimal
//	(User selects conversion type)
//
//	Create switch program that takes day number (1–365) and returns:
//
//	Day name + Month name + Quarter
//	(Use nested switch for month distribution
    public void month() {
    	int month =1;
    	
    	switch(month) {
    	case 1 :
    		System.out.println("Month would be the January");
    	break;
    	
    	case 2:
    		System.out.println("Month would be the february");
    	break;
    	
    	case 3:
    		System.out.println("Month would be the March");
    	break;
    	
    	case 4:
    		System.out.println("Month would be the April");
    	break;
    	
    	case 5:
    		System.out.println("Month would be the May");
    	break;
    	
    	case 6 :
    		System.out.println("Month would be the June");
    	break;
    	
    	case 7:
    		System.out.println("Month would be the July");
    	break;
    	
    	case 8:
    		System.out.println("Month would be the August");
    	break;
    	
    	case 9:
    		System.out.println("Month would be the September");
    	break;
    	
    	case 10:
    		System.out.println("Monthwould be the October");
    	break;
    	
    	case 11:
    		System.out.println("Month would be the november");
    	break;
    	
    	case 12:
    		System.out.println("Month would be the december");
    	break;
    	
    	default:
    		System.out.println("Enter month is not valid");
    	}
    }
	
//
//	Write a switch that categorizes a credit score & assigns eligibility for loan tiers:
//
//	Excellent / Good / Moderate / Risky / Rejected.
    public void loanEligibility() {
    	int creditScore = 1;
    	
    	switch(creditScore) {
    	case 1 :
    		System.out.println("Credit score would be excellent");
    	break;
    	
    	case 2:
    		System.out.println("Credit score would be moderate");
    	break;
    	
    	case 3:
    		System.out.println("Credit score would be the Risky");
    	break;
    	
    	case 4:
    		System.out.println("Credit score would be the Rejected");
    	break;
    	
    	default:
    		System.out.println("Credit score is not eligible to pass the loan");
    		
    	}
    }
//
//	Design a switch to manage Bank operations:
//
//	Withdraw, Deposit, Check Balance, Mini-Statement, Change PIN.
    public void BankOperations() {
    	int operation = 1;
    	
    	switch(operation) {
    	case 1:
    		System.out.println("Withdraw amount from the bank");
    	break;
    	case 2:
    		System.out.println("Deposit the money in the bank");
    	break;
    	
    	case 3:
    		System.out.println("Check balance from your account");
    	break;
    		
    	case 4:
    		System.out.println("Mini statement of your bank account");
    	break;
    	
    	case 5:
    		System.out.println("Change your PIN of the bank account");
    	break;
    	
    	default:
    		System.out.println("You cannot do anything from your account because it is blocked!!!");
    	}
    }
//
//	Write enhanced switch -> multiple case labels to classify age groups:
//
//	Teen, Young, Adult, Mid-age, Senior.
    public void ageClassification() {
    	int a =1;
    	switch(a) {
    	case  1 :
    		System.out.println("Age is teenage between the greater than 16");
    	break;
    	
    	case 2:
    		System.out.println("Young");
    	break;
    	
    	case 3:
    		System.out.println("Adult");
    	break;
    	
    	case 4:
    		System.out.println("Mid-age");
    	break;
    	
    	case 5:
    		System.out.println("Senior");
    	break;
    	
    	default:
    		System.out.println("Age is not valid");
    	}
    }
//
//	Use enum + switch to simulate traffic signal behavior:
//
//	RED, YELLOW, GREEN → time to wait + message.
    
    public void trafficSignal() {
    	String color ="Yellow";
    	
    	switch(color) {
    	case "Green":
    		System.out.println("You can go");
    	break;
    	
    	case "Yellow":
    		System.out.println("Stay ready");
    	break;
    	
    	case "Red":
    		System.out.println("You cannot go");
    	break;
    	
        default:
        	System.out.println("Signal is not valid");
    	}
    }
//
//	Create an E-Commerce menu using switch:
//
//	Show categories, apply coupon, calculate delivery charges, track order.
    
//
//	Write switch program for real-life scenario:
//	Ticket pricing system for flight/train/bus based on:
//
//	Class type (Economy/Business)
//
//	Distance
//
//	Passenger type (Adult/Child/Senior)
//
//	Build calendar operation using switch:
//
//	Input month → Print number of days
//
//	Handle leap year check inside switch.
//
//	Switch based employee HR evaluation system:
//
//	Input performance A/B/C/D
//	→ Assign bonus %, promotion eligibility, warning, termination.
//
//	Write nested switch for Restaurant Ordering System:
//
//	Category → FastFood / Drinks / Sweets
//
//	Each category has sub-items with individual prices.
//
//	Create a switch to find area/perimeter based on shape choice:
//
//	Circle / Rectangle / Square / Triangle / Trapezium.
//
//	Use Java enhanced switch to evaluate Boolean logic operator:
//
//	AND, OR, XOR, NOT
//	Input two booleans → Return result.
//
//	Create a timezone converter using switch:
//
//	Convert IST ↔ GMT ↔ PST ↔ CST ↔ EST.
//
//	Implement a Pattern Printer using switch:
//
//	Pattern A → Right Angle Triangle
//
//	Pattern B → Floyd’s Triangle
//
//	Pattern C → Diamond Shape
//
//	Pattern D → Number Pyramid
}
