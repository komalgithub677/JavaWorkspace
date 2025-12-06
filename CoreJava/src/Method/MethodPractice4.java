package Method;

public class MethodPractice4 {
             
//	🔥 SECTION B — If, Else, Else-If Questions
//
//	Write a program using if-else to check whether a person is eligible to vote.
	public void eligible() {
		int age =18;
		if(age>=18) {
			System.out.println("Person is eligible to vote");
		}
		else {
			System.out.println("Person is not eligible to vote");
		}
	}
//
//	Accept marks and print grade: A,B,C,D,Fail using else-if ladder.
	 public void PrintGrade() {
		 int marks =45;
		 if(marks<=100 && marks>=90) {
			 System.out.println("Grade A");
		 }
		 else if(marks<90 && marks>=75) {
			 System.out.println("Grade B");
		 }
		 else if(marks<75 && marks>=60) {
			 System.out.println("Grade C");
		 }
		 else if(marks>=35 && marks<60) {
			 System.out.println("Grade D");
		 }
		 else {
			 System.out.println("Fail");
		 }
	 }
//
//	Check whether the number is positive, negative or zero.
	 public void NumberPositiveNegativeZero() {
		 int num =10;
		 if(num==0) {
			 System.out.println("Number is zero");
		 }
		 else if(num>0) {
			 System.out.println("Number is positive");
		 }
		 else {
			 System.out.println("Number is negative");
		 }
	 }
//
//	Check whether a character is vowel or consonant.
	 public void VowelConsonant() {
		         char ch = 'A';
		         
		         if(ch=='A' || ch =='I' || ch=='O' || ch=='U' || ch=='E') {
		        	 System.out.println("Character is vowel");
		         }
		         else {
		        	 System.out.println("Character is a consonant");
		         }
	 }
//
//	Find the largest among 3 numbers using nested if-else.
	public void largest() {
		int a =23 , b=24,c=21;
		if(a>b && a>c) {
			System.out.println("a is largest");
		}
		else if(b>a && b>c) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}
	}
//
//	Accept age and gender, print if eligible for job (interview-type logic).
	public void jobeligibility() {
		int age = 23;
		String gender ="Female";
		
		if(age>=22 && (gender=="Male" || gender=="Female")) {
			System.out.println("Eleigible for job interview");
		}
		else {
			System.out.println("Not eligible for job interview");
		}
	}
//
//	Using if-else check whether a given year is a leap year.
	public void year() {
		int year = 2020;
		if(year%4==0 && (year%400==0 && year%100!=0)) {
			System.out.println("Yera is a leap year");
		}
		else {
			System.out.println("Year is not a leap year");
		}
	}
//
//	Write a program to determine the type of triangle based on sides.
	
//
//	Input salary and calculate bonus based on conditions.
	public void bonus() {
		int salary = 30000;
		if(salary>20000) {
			System.out.println("Very less bonus");
		}
		else if(salary>=60000) {
			System.out.println("Bonus is 20 percent");
		}
		else if(salary>=100000) {
			System.out.println("Bonus is 30 percent");
		}
		else if(salary>=200000) {
			System.out.println("Bonus is 40 percent");
		}
		else {
			System.out.println("Very high bonus");
		}
	}
//
//	Check if entered login credentials are valid (username + password).
	public void login() {
		boolean username = true;
		boolean password = true;
		
		if(username==true || password == true) {
			System.out.println("Login credential aare valid");
		}
		else{
			System.out.println("Login credential are not valid");
		}
	}
	
//	Write a Java program using a method to perform addition, subtraction, multiplication, and division of two numbers.
//
	public void addition(int a , int b) {
		int sum = a+b;
	    System.out.println("Sum :" + sum);
		
	}
	
	public void substraction(int a ,int b) {
		int sub = a -b;
		System.out.println("Substraction :" + sub);
	}
	
	public void division(int a , int b) {
		int div = a/b;
		System.out.println("Division :" + div);
	}
	
	public void modulo(int a , int b) {
		int modulo = a%10;
		System.out.println("Remainder :" + modulo);
	}
//	Create a method to check whether a number is even or odd using operators.
//
	public void evenOdd(int num) {
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
//	Write a method to find the largest of three numbers using relational operators.
//
	public void largest(int a , int b ,int c) {
		if(a>b && a>c) {
			System.out.println("a is largest" + a);
		}
		else if(b>a && b>c) {
			System.out.println("b is largest: " + b);
		}
		else {
			System.out.println("c is largest : "+ c);
		}
	}
//	Write a method to calculate simple interest using arithmetic operators.
//
//	Create a method to check whether a number is positive, negative, or zero.
//
//	Write a method to compare two numbers using relational operators and return the result.
//
//	Create a method to swap two numbers using:
//
//	(a) third variable
//
//	(b) without using third variable
}
