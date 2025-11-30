package Method;

public class MethodPractice2 {
//	Methods without return type & with arguments
//
//			Write a void method that takes a number and prints whether it is even or odd.
            public void PrintNumberEvenOdd(int n) {
            	if(n%2==0) {
            		System.out.println("Number is even ");
            	}
            	else {
            		System.out.println("Number is odd");
            	}
            	
            }
	
//			Create a method that accepts two numbers and prints the larger one.
            public void largerNumber(int a , int b) {
                        if(a>b) {
                        	System.out.println("a is largest");
                        }
                        else{
                        	System.out.println("b is largest");
                        }
            }
//
//			Write a method that receives a string and prints its reverse.
            
//
//			Create a method with three integers and print their average.
            public void average(int a , int b , int c) {
            	int average = (a + b + c)/2;
            	System.out.println("average is : " + (average));
            }
//
//			Write a method that takes a number and prints its multiplication table.
            public void multiplication(int n) {
            	for(int i=1; i<=10; i++) {
            		int mul = i*n;
            		System.out.println("Multiplication  table of N : " + (mul));
            	}
            }
//
//			Create a method that accepts a number and checks if it is prime.
            public void PrimeNumber(int n) {
            	        boolean isPrime = true;
            	        
            	        //Base case
            	        if(n<=1) {
            	        	isPrime=false;
            	        }
            	        
            	        for(int i=2; i<n-1; i++) {
            	        	if(n%i==0) {
            	        		isPrime =false;
            	        	}
            	        	}
            	        if(isPrime == true) {
            	        	System.out.println("Number is a prime");
            	        }
            	        else {
            	        	System.out.println("Number is not a prime");
            	        }
            	        
            	        }
//
//			Write a method that takes a string and count vowels inside it.
//
//			Create a method that accepts temperature in Celsius and prints Fahrenheit.
//
//			Write a method that takes an amount and discount % and prints the final price.
//
//			Create a method that receives an array and prints the maximum element.
}
