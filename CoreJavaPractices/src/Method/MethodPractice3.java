package Method;

public class MethodPractice3 {
//	💡 Methods without return type & without arguments
//
//			Write a void method that prints the first 10 natural numbers.
//
	        public void NaturalNumber() {
	        	for(int i=1;  i<=10; i++) {
	        		System.out.println(i);
	        	}
	        }
//			Create a method that prints "Welcome to Java Programming".
	       public void Welcome () {
	    	   System.out.println("Welcome to Java Programming");
	       }
//
//			Write a method that prints the sum of numbers from 1 to 100.
	       public void sum() {
	    	   int sum =0;
	    	   for(int i=1; i<=100; i++) {
	    		  sum +=i;
	    	   }
	    	   System.out.println("Sum of numbers :" + sum);
	       }
//
//			Create a method that prints all even numbers between 1–50.
	       public void even () {
	    	   for(int i=1; i<=50; i++) {
	    		   if(i%2==0) {
	    			   System.out.println("Even Number :" + i);
	    		   }
	    		   
	    	   }
	       }
//
//			Write a method that prints factorial of 5.
	       public void factorial() {
	    	   int fact =1;
	    	   for(int i=1; i<=5; i++) {
	    		   fact *=i;
	    	   }
	    	   System.out.println("Factorial of number : " + fact);
	       }
//
//			Create a method that prints Fibonacci series up to 10 terms.
	       public void fibonacci() {
	    	   int a = 0;
	    	   int b = 1;
	    	   for(int i=1; i<=10; i++) {
	    		   System.out.println("Fibonacci number : " + a);
	    		   int next = a + b;
	    		   a = b;
	    		   b =next;
	    		   
	    	   }
	       }
//
//			Write a method that prints table of 9 without taking input.
	       public void tableOf9() {
	    	   for(int i=1; i<=10; i++) {
	    		   int mul = i*9;
	    		   System.out.println( mul);
	    	   }
	       }
//
//			Create a method that prints your name 5 times.
	       public void printName5() {
	    	   for(int i=1; i<=5; i++) {
	    		   System.out.println("Komal Narawade");
	    	   }
	       }
//
//			Write a method that prints numbers divisible by 7 from 1–100.
	       public void numberDivisibleBy7() {
	    	   for(int i=1; i<=100; i++) {
	    		   if(i%7==0) {
	    			   System.out.println(i);
	    		   }
	    		  
	    	   }
	       }
//
//			Create a method that prints pattern:
//
//			*
//			**
//			***
//			****
	       public void printPattern() {
	    	   for(int i=1; i<=5; i++) {
	    		   for(int j=1; j<=i; j++) {
	    			   System.out.print("*");
	    		   }
	    		   System.out.println();
	    	   }
	       }
}
