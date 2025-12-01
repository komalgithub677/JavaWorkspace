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
	
//
//	Accept age and gender, print if eligible for job (interview-type logic).
//
//	Using if-else check whether a given year is a leap year.
//
//	Write a program to determine the type of triangle based on sides.
//
//	Input salary and calculate bonus based on conditions.
//
//	Check if entered login credentials are valid (username + password).
}
