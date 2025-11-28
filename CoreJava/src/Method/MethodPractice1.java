package Method;

public class MethodPractice1 {
           
//	Write a method to print your name (no return, no parameters).
    public void name() {
    	System.out.println("Komal Narawade");
    }
//
//	Write a method to print the sum of two numbers (no return, with parameters).
    public void sum() {
    	int a =10;
    	int b=20;
    	System.out.println("Sum :" + a + "and" + b + "=" + (a+b));
    }
//
//	Write a method that returns your age (return type, no parameters).
    public void age() {
    	int age = 23;
    	System.out.println("Age is " + age);
    }
//
//	Write a method that returns the square of a number (return type, with parameters).
    public void square() {
    	int num = 20;
    	int square = num * num;
    	System.out.println("Square of number : " + (square));
    }
//
//	Write a method to print the first 10 natural numbers.
    public void naturalNumbers() {
    	for(int i=1; i<=10; i++) {
    		System.out.println(i);
    	}
    }
//
//	Write a method to check whether a number is even or odd.
    public void evenOdd() {
    	int num=20;
    	if(num%2==0) {
    		System.out.println("Number is even");
    	}
    	else {
    		System.out.println("Number is Odd ");
    	}
    }
//
//	Write a method to calculate the factorial of a given number.
    public void factOfNumber() {
//    	int num =10;
//    	int fact = 1;
//    	fact *=num;
//    		System.out.println("Factorial of given number : " + (fact));
    	int fact = 1;
    	int n = 10;
    	for(int i=1; i<=n; i++) {
    		fact *=i;
    		
    	}
    	System.out.println("Factorial of given number is : " + (fact));	
    }
//
//	Write a method to check if a number is prime or not.
    public void primeNumber() {
    	int num =34;
    	boolean isPrime = true;
    	
    	//0,1 and neagtive numbers are not prime
    	if(num<=1) {
    		isPrime = false;
    	}
    	else {
    		for(int i=2; i<Math.sqrt(num); i++) {
    			if(num%i==0) {
    				isPrime =false;
    				break;
    			}
    		}
    	}
    	
    	//output result
    	if(isPrime) {
    		System.out.println(num + "  Is a prime number");
    	}
    	else {
    		System.out.println(num + "  Is not a prime number");
    	}
    }
//
//	Write a method to return the largest of three numbers.
//
    public void GreatestOfThreeNumbers() {
    	int a =10 , b=23, c=21;
    	if(a>b && b>c) {
    		System.out.println("a is Greater ");
    	}
    	else if(b>a && b>c) {
    		System.out.println("b is Greater");
    	}
    	else {
    		System.out.println("c is Greater");
    	}
    }
   
//	Write a method to count the number of digits in a number.
    
    public void CountNumberOfDigits() {
    	int num =23;
    	int countOfDigit =0;
    	for(int i=num; i>0; i=i/10) {
    		int digit = i%10;
    		countOfDigit++;
    	}
    	System.out.println("Count Of Digit" + countOfDigit);
    }
}
