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
	 
//	Write a method that returns true if a number is even, else false.
//	Write a method that returns the factorial of a number. 
//	Write a method that returns the reverse of a number.
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
       
      
       
       int sumOfTwoNumbers() {
    	   int a = 10;
    	   int b = 20;
    	   int sum = a + b;
    	   return sum;
       }
}
