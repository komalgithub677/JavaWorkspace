package Method;

public class MethodPractice8 {
//	Write a method that returns the square of a number.
	int square() {
 	   int n = 6;
 	   int square = n*n;
 	   return square;
    }
//	Write a method that returns the cube of a number.
	 int cube() {
  	   int n =35;
  	   int cube = n * n * n;
  	   return cube;
     }
//	Write a method that returns the sum of two numbers.
	 int sum() {
		 int a = 10 , b=20;
		 int sum = a + b;
		 return sum;
	 }
//	Write a method that returns the greatest of three numbers
	 int greatestNumber() {
		 int a =10 , b =20 , c=12;
		 if(a>b && a>c) {
			 System.out.println("A is greater");
			 return a;
		 }
		 else if(b>a && b>c) {
			 System.out.println("b is greater");
			 return b;
		 }
		 else {
			 System.out.println("c is greater");
			 return c;
		 }
	 }
//	Write a method that returns true if a number is even, else false.
	 int evenOdd() {
		 int num =46;
		 if(num%2==0) {
			 System.out.println("Even Number");
		 }
		 else {
			 System.out.println("Odd Number");
		 }
		 return num;
	 }
//	Write a method that returns the factorial of a number.
	 int fact() {
		 int fact = 1;
		 int num =34;
		 for(int i=1; i<=num; i++) {
			 fact *=fact;
		 }
		 return fact;
	 }
//	Write a method that returns the reverse of a number.
	 int reverse() {
		 int rev =0;
		 int num =1024;
		 for(int i=1; i<=num; i++) {
			 int digit = i%10;
			 rev = rev * 10 + digit;
		 }
		 return rev;
	 }
//	Write a method that returns whether a number is prime or not.
	 int primeNumber() {
  	   int num = 10;
  	   boolean isPrime = true;
  	   if(num>=1) {
  		  isPrime = false;
  	   }
  	   for(int i=2; i<=num; i++) {
  		   if(i%2==0) {
  			   isPrime = false;
  		   }
  	   }
  	   
  	   if(isPrime==true) {
  		   System.out.println("Number is a prime");
  	   }
  	   else {
  		   System.out.println("Number is prime");
  	   }
  	   return num;
     }
	 
//	Write a method that returns the count of digits in a number.
       int countDigit() {
    	   int countOfDigit=0;
    	   int num = 1024;
    	   for(int i=1; i>0; i=i/10) {
    		   countOfDigit++;
    	   }
    	   return countOfDigit;
    	   
       }
       
       
//       Method with return type with parameters
//       Write a method that returns the square of a number.
       int squareOfNumber(int num) {
    	   int square = num * num;
    	   return square;
       }
//       Write a method that returns the cube of a number.
       int cubeOfNumber(int num) {
    	   int cube = num * num * num;
    	   return cube; 
       }
//       Write a method that returns the sum of two numbers.
       int SumOfNumbers(int a ,int b) {
    	   int sum = a + b;
    	   return sum;
       }
//       Write a method that returns the greatest of three numbers
       int Greatest(int a , int b , int c) {
    	   if(a>b && a>c) {
    		   System.out.println("a is greater");
    		   return a;
    	   }
    	   else if(b>a && b>c) {
    		   
    		   System.out.println("b is greater");
    		   return b;
    	   }
    	   else {
    		   System.out.println("c is greater");
    		   return c;
    	   }
       }
//       Write a method that returns true if a number is even, else false.
       int even(int num) {
    	   if(num%2==0) {
    		   System.out.println("Number is even");
    	   }
    	   else {
    		   System.out.println("Number is odd");
    	   }
    	   return num;
       }
//       Write a method that returns the factorial of a number. 
       int factorial(int num) {
    	   int fact = 1;
    	   for(int i=1; i<=num; i++) {
    		   fact *=fact;
    	   }
    	   return num;
    	   
       }
//       Write a method that returns the reverse of a number.
       int reverse(int num) {
    	   int rev = 0;
    	   for(int i=1; i<=num; i++) {
    		   int digit = i%10;
    		   rev = rev *10 + digit;
    	   }
    	   return num;
       }
//       Write a method that returns whether a number is prime or not.
       int prime(int num) {
    	   boolean isPrime = true;
           
    	   if(num>=1) {
    		   isPrime = false;
    	   }
    	   for(int i=1; i<=num; i++) {
    		   if(num%2==0) {
    			   isPrime =false;
    		   }
    	   if(isPrime == true) {
    		   System.out.println("Number is prime");
    	   }
    	   else {
    		   System.out.println("Number is not prime");
    	   }
    	   }
    	   return num;
       }
       
//       Write a method that returns the count of digits in a number.
       int countOfDigits(int num) {
    	   int count = 0;
    	   
    	   for(int i=1; i>0; i=i/10) {
    		
    		   count++;
    		   
    	   }
    	   return count;
       }
       
//       without Return Type Parameterised & Non-Parameterised
//       Write a method that returns the square of a number.
       public void squareNum() {
    	   int num = 21;
    	   int square = num * num;
       }
//       Write a method that returns the cube of a number.
       public void CubeNum() {
    	   int num =12;
    	   int cube = num * num * num;
       }
//       Write a method that returns the sum of two numbers.
       public void methodSum() {
    	   int a=12 , b =10;
    	   int sum = a + b;
    	   System.out.println("Sum of two number is" + sum);
       }
//       Write a method that returns the greatest of three numbers
       public void greatestOfThree() {
    	   int a = 12;
    	   int b =21;
    	   int c =24;
    	   if(a>b&& a>c) {
    		   System.out.println("Number a is greater");
    	   }
    	   else if(b>a && b>c){
    		   System.out.println("Number b is greater");
    	   }
    	   else {
    		   System.out.println("Number c is greater");
    	   }
       }
//       Write a method that returns true if a number is even, else false.
       public void evenOddNumber() {
    	   int num =10;
    	   if(num%10 == 0) {
    		   System.out.println("Number is even");
    	   }
    	   else {
    		   System.out.println("Number is odd");
    	   }
       }
//       Write a method that returns the factorial of a number.
       public void factorial() {
    	   int num =21;
    	   int fact =1;
    	   for(int i=1; i<=num; i++) {
    		   fact *=fact;
    	   }
       }
//       Write a method that returns the reverse of a number.
       public void reverseOfNum() {
    	   int num =12;
    	   int rev = 0;
    	   for(int i=1; i<=num; i++) {
    		   int digit = i%10;
    		   rev = rev * 10 + digit;
    	   }
       }
//       Write a method that returns whether a number is prime or not.
       public void primeNum() {
    	   int num = 13;
    	   boolean isPrime = true;
    	   if(num>=1) {
    		   isPrime = false;
    	   }
    	   for(int i=1; i<=num; i++) {
    		   if(i%2==0) {
    			   isPrime = false;
    		   }
    	   }
    	   if(isPrime == true) {
    		   System.out.println("Number is even");
    	   }
    	   else {
    		   System.out.println("Number is not prime");
    	   }
       }
       
//       Write a method that returns the count of digits in a number.
       public void countDigitsInNumber() {
    	   int num = 1024;
    	   int count = 0;
    	   for(int i=1; i>0; i=i/10) {
    		   count++;
    	   }
    	   System.out.println("Count of digits wouls be the :" + count);
       }
       
       
//     without Return Type Parameterised
       
//       Write a method that returns the square of a number.
       public void squaretheNum (int num) {
    	   int square = num * num;
    	   System.out.println("Square of the number:" + square);
       }
//       Write a method that returns the cube of a number.
       public void cubetheNum(int num) {
    	   int cube = num * num * num;
    	   System.out.println("Cube of the number is: " + cube);
       }
//       Write a method that returns the sum of two numbers.
       public void sumOfNum(int a , int b) {
    	   int sum = a+ b;
    	   System.out.println("Sum of two number is : " + sum);
       }
//       Write a method that returns the greatest of three numbers
       public void greaterOfNum(int a ,int b , int c) {
    	   if(a>b && a>c) {
    		   System.out.println("Number a is greater");
    	   }
    	   else if(b>a && b>c) {
    		   System.out.println("Number b is greater");
    	   }
    	   else {
    		   System.out.println("Number c is greater");
    	   }
       }
//       Write a method that returns true if a number is even, else false.
       
       public void evenOddNum(int num) {
    	   if(num%2==0) {
    		   System.out.println("Number is even");
    	   }
    	   else {
    		   System.out.println("Number is odd");
    	   }
       }
//       Write a method that returns the factorial of a number.
       public void factorialOfNum(int num) {
    	   int fact = 1;
    	   for(int i=1; i<=num; i++) {
    		   fact *=fact;
    	   }
    	   System.out.println("Factorial of number : " + fact);
       }
//       Write a method that returns the reverse of a number.
       public void reversetheNum(int num) {
    	   int rev = 0;
    	   for(int i=1; i<=num; i++) {
    		   int digit = i%10;
    		   rev = rev*10 + digit;
    	   }
    	   System.out.println("Reverse of number would be the:" + rev);
       }
//       Write a method that returns whether a number is prime or not.
       public void primeNumCheck(int num) {
    	   boolean isPrime =true;
    	   if(num>=1) {
    		   isPrime = false;
    	   }
    	   for(int i=1; i<=num; i++) {
    		   if(num%2==0) {
    			   isPrime = true;
    		   }
    	   }
    	   if(isPrime == true) {
    		   System.out.println("Number is prime");
    	   }
    	   else {
    		   System.out.println("Number is not prime");
    	   }
       }
       
//       Write a method that returns the count of digits in a number.
       public void countOfDigit(int num) {
    	   int count = 0;
    	   for(int i=1; i>0; i=i/10) {
    		   count++;
    	   }
    	   System.out.println("Count of digits in a number");
       }
       
      
       
      
}
