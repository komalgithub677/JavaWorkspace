package Method;

public class MethodPractice6 {
//	SECTION D — Loops (for, while, do-while + Nested)
	
//
//	Print sum of digits of a number using while loop.
	public void sumOfDigits() {
		int num =1023;
		int sum =0;
		int i=num;
		while(i>0) {
			int digit = i%10;
			sum +=digit;
			i=i/10;
		}
		
		System.out.println("Sum of two digit is:" + (sum));
	}
//
//	Find factorial of a number using do-while loop.
	public void factorial() {
		int num =30;
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact *=fact;
		}
		System.out.println("Factorial of number is : " +(fact));
	}
//
//	Print multiplication table using for loop.
	public void MultiplicationTable() {
		for(int i=1; i<=10; i++) {
			int product = i*3;
			System.out.println(product);
		}
	}
//
//	Reverse a number using loop.
	public void  reverseNumber() {
		int num=15;
		int rev =0;
		for(int i=num; i>0; i=i/10) {
			int digit = i%10;
			rev = rev * 10 + digit;
		}
		System.out.println("Reverse number is : " +(rev));
	}
//
//	Generate Fibonacci series using while loop.
	
	public void fibonacciSequence() {
		int a = 0;
		int b =1;
		int fib = a + b;
		for(int i=1; i<20; i++) {
			System.out.println("Finbonacci seuence of the number is :" + (a));
			int next = a+b;
			a = b;
			b =next;
		}
	}
//
//	Check if number is Armstrong using loop.
//
//	Use nested loops to print pattern:
//
//	1
//	22
//	333
//	4444
//
//
	public void pattern() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
//	Print prime numbers between 1–100.
	public void PrintPrime() {
		int num = 36;
		boolean isPrime = false;
		if(num<=1) {
			isPrime = false;
		}
		for(int i=2; i<=num-1; i++) {
			if(i%2==0) {
				isPrime =false;
			}
		}
		if(isPrime==true) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}
//
//	Count number of digits using while loop.
	public void CountDigit() {
		int num =2345;
		int digitCount = 0;
		for(int i=1; i<=num; i++) {
			int digit = i%10;
			digitCount++;
		}
		System.out.println("Count of digit would be the " + digitCount);
	}
//
//	Create menu-driven calculator using switch + loops.
	public void Calculator() {
		char operation = '+';
		
		System.out.println("Enter the operation you want to perform : ");
		switch(operation) {
		case '+' :
			int a = 10 ,b=20;
			System.out.println("Addition of the two number is :" + (a+b));
			break;
		
		case '-':
			int a1 =30, a3 =30;
			System.out.println("Substraction of the two number is : " +  (a1-a3));
		break;
		
		case '*':
			int a5 =23 , a4=12;
			System.out.println("Multiplication of the two number is : " +(a5*a4));
		break;
		
		case '/':
			int a6 =23 ,a7=23;
			System.out.println("Division of the two number is : " +(a6/a7));
		break;
		
		default:
			System.out.println("Invalid operation");
			
		}
	}
}
