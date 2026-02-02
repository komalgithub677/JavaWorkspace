
public class JavasIfElsePractice {
//	Basic if Questions
//
//	Write a Java program to check whether a number is positive.
public void positiveNumber() {
	int a =10;
	if(a>0) {
		System.out.println("Number is positive");
	}
	
}
//
//	Write a program to check if a given number is even using if.

public void evenNumber() {
	int a = 20;
	
	if(a%2==0) {
		System.out.println("Number is even");
	}
}
	
//
//	What will be the output?
//
public void output() {
	int x = 10;
	if (x > 5)
	    System.out.println("Hello");
}
//
//
//	Write a program to check if a person is eligible to vote (age ≥ 18).
public void voteEleigibility() {
	int age = 20;
	if(age>=18) {
		System.out.println("Person eleigible to vote");
	}
}
//
//	🔹 if – else Questions
//
//	Write a Java program to check whether a number is even or odd using if-else.
public void evenOdd() {
	int a = 20;
	if(a%2==0) {
		System.out.println("Number is even");
	}
	else {
		System.out.println("Number is odd");
	}
}
//
//	What will be the output?
//
public void outputP() {
	int a = 10;
	if (a > 20)
	    System.out.println("A");
	else
	    System.out.println("B");
}
//
//
//	Write a program to check whether a number is positive or negative.
public void PNZ() {
	int a =10;
	if(a==0) {
		System.out.println("Number is zero");
	}
	else if(a>0) {
		System.out.println("Number is positive");
	}
	else {
		System.out.println("Number is negative");
	}
}
//
//	Write a Java program to check whether a given year is a leap year using if-else.
public void leapCheck() {
	int year = 2020;
	
	if(year %4 ==0 && (year%400==0 && year%100!=0)) {
	System.out.println("Leap year ");
	}
	else {
		System.out.println("Not a leap year");
	}
}
//
//	🔹 else-if Ladder Questions
//
//	Write a Java program to check student grade based on marks:
//
//	≥ 90 → A
//
//	≥ 75 → B
//
//	≥ 60 → C
//
//	< 60 → Fail

public void studentGrade() {
	int marks = 80;
	
	if(marks>=90) {
		System.out.println("Grade : A ");
	}
	else if(marks>=75) {
		System.out.println("Grade : b");
	}
	else if(marks>=60) {
		System.out.println("Grade : C ");
	}
	else if(marks<60) {
		System.out.println("Fail");
	}
}
//
//	What will be the output?
//
public void predictOutPut() {
	int x = 50;

	if (x > 60)
	    System.out.println("First");
	else if (x > 40)
	    System.out.println("Second");
	else
	    System.out.println("Third");
}
//
//
//	Write a Java program to display the day of the week using else-if.
public void Days() {
	int days = 1;
	if(days ==1) {
		System.out.println("Sunday");
	}
	else if(days ==2) {
		System.out.println("Monday");
	}
	else if(days ==3) {
		System.out.println("Tuesday");
	}
	else if(days==4) {
		System.out.println("Wednesday");
	}
	else if(days ==5) {
        System.out.println("Thursday");
	}
	else if(days ==6) {
		System.out.println("Friday");
	}
	else if(days ==7) {
		System.out.println("Saturday");
	}
	else {
		System.out.println("Any days");
	}
}
//
//	Write a program to find the largest of three numbers using else-if.
public void largest() {
	int a = 2, b =3, c =4;
	if(a>b & a>c) {
		System.out.println("a is largest");
	}
	else if(b>a & b>c) {
		System.out.println("b is largest");
	}
	else {
		System.out.println("c is largest");
	}
}
//
//	🔹 Nested if-else Questions
//
//	What will be the output?
//
public void nestedIf() {
	int x = 15;

	if (x > 10) {
	    if (x < 20)
	        System.out.println("Between 10 and 20");
	}
}
//
//
//	Write a program to check username and password using nested if-else.
public void usernamePass() {
	String username = "Komal";
	String password = "123";
	
	String inputU = "Komal";
	String inputP = "123";
	
	if(username.equals(inputU)) {
		if(password.equals(inputP)) {
			System.out.println("Correct Password : Login successful");
		}
		else {
			System.out.println("Login failed");
		}
	}
	else {
		System.out.println("Incorrect username");
	}
}
//
//	🔹 Logical & Tricky Questions
//
//	What will be the output?
//
public void outputPredict() {
	int x = 5;

	if (x > 10)
	    System.out.println("A");
	else if (x > 3)
	    System.out.println("B");
	else
	    System.out.println("C");
}
//
//
//	Write a Java program to check whether a character is a vowel or consonant.
public void vowelOrConsonant() {
	char ch = 'a';
	
	if(ch == 'a' || ch =='i' || ch=='o' || ch=='u' || ch =='e' || ch =='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E') {
		System.out.println("Vowel");
	}
	else {
		System.out.println("Consonant");
	}
}
//
//	What will be the output?
//
public void o() {
	int a = 10, b = 20;

	if (a > b)
	    System.out.println("A");
	else if (a == b)
	    System.out.println("Equal");
	else
	    System.out.println("B");
}
//
//	🔹 Interview-Level Questions ⭐
//
//	Can we use else without if in Java? Explain.
// no we cannot use the else without if
//
//	What is the difference between else-if ladder and nested if-else?
// else -if ladder is used to check the multiple conditions and the if-else are used to check the two conditions 

public static void main(String[] args) {
	JavasIfElsePractice  j = new JavasIfElsePractice();
	j.positiveNumber();
	j.evenNumber();
	j.output();
	j.voteEleigibility();
	j.evenOdd();
	j.outputP();
	j.PNZ();
	j.leapCheck();
	j.studentGrade();
	j.predictOutPut();
	j.Days();
	j.largest();
	j.nestedIf();
	j.usernamePass();
	j.outputPredict();
	j.vowelOrConsonant();
	j.o();
}
	
}	

