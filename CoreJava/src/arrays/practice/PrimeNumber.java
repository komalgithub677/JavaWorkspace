package arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
             public void prime(int n) {
            	    boolean isPrime = true;
            	    
            	    if(n<=1) {
            	    	isPrime =true;
            	    }
            	    
            	    for(int i=2; i<=Math.sqrt(n); i++) {
            	    	if(n%2==0) {
            	    		isPrime = false;
            	    	}
            	    }
            	    
            	    if(isPrime) {
            	    	System.out.println("Number is prime");
            	    }
            	    else {
            	    	System.out.println("Number is not prime");
            	    }
             }
             
             public void fibonnacciNumber(int n) {
            	    int a =0, b =1;
            	    
            	    for(int i=1; i<=n; i++) {
            	    	System.out.println(a);
            	    	int c = a + b;
            	    	a =b;
            	    	b=c;
            	    }
            	    
             }
             
             public void reverse(int n) {
            	 int rev =0;
            	 
            	 for(int i=n; i>0; i=i/10) {
            		 int digit = i%10;
            		 rev = rev * 10 + digit;
            	 }
            	 
            	 System.out.println("Reverse of digit is" + rev);
             }
             
             public void palindromeNumber(int n) {
            	 int rev = 0;
            	 int original =n;
            	 
            	 for(int i=n; i>0; i=i/10) {
            		 int digit = i%10;
            		 rev = rev * 10 + digit;
            	 }
            	 
            	 if(rev==original) {
            		 System.out.println("Number is palindrome Number");
            	 }
            	 else {
            		 System.out.println("Number is not a palindrome number");
            	 }
             }
             
             public void armstrongNumber(int n) {
            	 int sum =0;
            	 for(int i=n; i>0; i=i/10) {
            		 int digit = i%10;
            		 sum = digit * digit * digit;
            	 }
            	 
            	 System.out.println("Sum of digits" + sum);
             }
             
             public void sumOfDigits(int n) {
            	 int sum = 0;
            	 
            	 for(int i=n; i>0; i=i/10) {
            		 int digit = i%10;
            		 sum +=digit;
            	 }
            	 System.out.println("Sum of digits " + sum);
             }
             
             public void largest(int a ,int b , int c) {
            	 if(a>b && a>c) {
            		 System.out.println("A is largest");
            	 }
            	 else if(b>c && b>a) {
            		 System.out.println("B is largest");
            	 }
            	 else {
            		 System.out.println("C is largest");
            	 }
             }
             
             public void gcd(int a , int b) {
            	 while(b!=0) {
            		 int temp =b;
            		 b = a % b;
            		 a = temp;
            	 }
            	 System.out.println("GCD : " + a);
             }
             
             public void lcm(int a , int b) {
            	 while(b!=0) {
            		 int temp = b;
            		 b =a%b;
            		 a =temp;
            	 }
            	 
            	 int gcd = a;
            	 int lcm = a * b / gcd;
            	 
            	 System.out.println("Lcm of the two number is : " + lcm);
             }
             
             public void checkLeapYear(int year) {
            	 if((year%4==0 && year%400==0) || (year%100!=0)){
            		 System.out.println("Leap year");
            	 }
            	 else {
            		 System.out.println("Not a leap year");
            	 }
             }
             
             public void consonantVowels(char ch) {
            	 if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e' || ch=='A' || ch=='I' || ch=='O'|| ch=='U' || ch=='E') {
            		 System.out.println("Character is vowel");
            	 }
            	 else {
            		 System.out.println("Character is not vowel");
            	 }
             }
             
             public void reverseString(String s) {
            	 String reverse = " ";
            	 
            	 for(int i=s.length()-1; i>0; i--) {
            		 reverse += s.charAt(i);
            	 }
            	 System.out.println("Reverse of the String is : ");
             }
             
             public void anagrams(String s1 , String s2) {
            	 char []a = s1.toCharArray();
            	 char []b =s1.toCharArray();
            	 
            	 Arrays.sort(a);
            	 Arrays.sort(b);
            	 
            	 if(Arrays.equals(a, b)) {
            		 System.out.println("Arrays are equals");
            	 }
            	 else {
            		 System.out.println("Arrays are not equals");
            	 }
             }
             
             public void removeSpace(String s2) {
            	 
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
				PrimeNumber p =new PrimeNumber();
				int n = sc.nextInt();
				p.prime(n);
				p.fibonnacciNumber(n);
				p.reverse(n);
				p.palindromeNumber(n);
				p.armstrongNumber(n);
				p.sumOfDigits(n);
				int a = sc.nextInt();
				int b = sc.nextInt();
				p.gcd(a, b);
				p.lcm(a, b);
				String s1 = "Komal";
				String s2 ="lamaKo";
				p.anagrams(s1, s2);
				
			}
}


