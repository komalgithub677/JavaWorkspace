import java.util.Scanner;


public class QuestionsPractice {
	         public void fact(int n) {
	        	 int fact =1;
	        	 for(int i=1; i<=n; i++) {
	        		 fact *=i;
	        	 }
	        	 System.out.println("Factorial : " + fact);
	         }
	         
	         public void fibonacciNumber(int n) {
	        	 int a =0;
	        	 int b =1;
	        	 
	        	 for(int i=1; i<=n; i++) {
	        		 System.out.println(a + " ");
	        		 int c =a+ b;
	        		 a=b;
	        		 b =c;
	        	 }
	         }
	         
	         public void reverseNumber(int n) {
	        	 int rev =0;
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 rev = rev * 10 + digit;
	        	 }
	        	 
	        	 System.out.println("Reverse Number :" + rev);
	         }
	         
	         
	         public void palindromeNumber(int n) {
	        	 int rev =0;
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 rev = rev * 10 + digit;
	        	 }
	        	 
	        	 if(rev ==n) {
	        		 System.out.println("Number is palindrome");
	        	 }
	        	 else {
	        		 System.out.println("Number is not palindrome");
	        	 }
	         }
	         
	         public void armstrongNumber(int n) {
	        	 int sum =0;
	        	 
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 sum = digit * digit * digit;
	        	 }
	        	 if(sum == n) {
	        		 System.out.println("Armstrong number");
	        	 }
	        	 else {
	        		 System.out.println("Not a armstrong number");
	        	 }
	         }
	         
	         public void sumOfDigits(int n) {
	        	 int sum =0;
	        	 
	        	 for(int i=n; i>0; i=i/10) {
	        		 int digit = i%10;
	        		 sum +=digit;
	        	 }
	        	 System.out.println(sum);
	         }
	         
	         public void largestOfThreeNumbers(int a , int b , int c) {
	        	 if(a>b && a>c) {
	        		 System.out.println("Largest is a : ");
	        	 }
	        	 else if(b>a && b>c) {
	        		 System.out.println("Largest is b ");
	        	 }
	        	 else {
	        		 System.out.println("Largest is a : ");
	        	 }
	         }
	         
	         public int gcd(int a , int b) {
	        	 while(b!=0) {
	        		 int temp = b;
	        		 b =a%b;
	        		 a =temp; 
	        	 }
	        	 System.out.println("GCD : " + a);
				 return a;
	         }
	         
	         public void lcm(int a ,int b) {
	        	 int gcdValue = gcd(a,b);
	        	 int lcm = (a*b) /gcdValue;
	        	 
	        	 System.out.println("LCM : " + lcm);
//	        	 while(b!=0) {
//	        		 int temp = b;
//	        		 b =a % b;
//	        		 a = temp;
//	        	 }
//	        	 int lcm = (a * b) / a;
//	        	 System.out.println("LCM : " + lcm);
	         }
             
             public static void main(String[] args) {
				QuestionsPractice q = new QuestionsPractice();
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter your Number :");
				int n =sc.nextInt();
				
				System.out.println("Enter the number a : ");
				int a = sc.nextInt();
				
				System.out.println("Enter the number b :");
				int b =sc.nextInt();
				
				System.out.println("Enter the number c :");
				int c =sc.nextInt();
				
				
				if(n%2==0) {
					System.out.println("Even");
				}
				else {
					System.out.println("Odd");
				}
				
				//Check prime number
				boolean isPrime = true;
				
				if(n<=1) {
					isPrime =false;
				}
				
				for(int i=2; i<=Math.sqrt(n); i++) {
					if(n%i==0) {
						isPrime =false;
						break;
					}
				}
				if(isPrime =true) {
					System.out.println("Prime number");
				}
				else {
					System.out.println("Not prime number");
				}	
				
				//factorial
				q.fact(n);
				
				//fibonacci number
				q.fibonacciNumber(n);
				
				//reverse number
				q.reverseNumber(n);
				
				//palindrome number
				q.palindromeNumber(n);
				
				//Armstroong Number
				q.armstrongNumber(n);
				
				//Sum of digits
				q.sumOfDigits(n);
				
				//Largest Of three numbers
				q.largestOfThreeNumbers(a, b, c);
				
				//greatest common divisor
				q.gcd(a, b);
				
				//lcm of the numbers
				q.lcm(a, b);
				
				
}
}