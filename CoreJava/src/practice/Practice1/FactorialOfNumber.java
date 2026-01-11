package practice.Practice1;

import java.util.Scanner;

public class FactorialOfNumber {
               public void fact(int n) {
            	   int fact = 1;
            	   for(int i=1; i<=n; i++) {
            		   fact *=i;
            	   }
            	   System.out.println(fact);
               }
//               Count the number of digits in a given number.
               public void countDigit(int n1) {
            	   int count = 0;
            	   for(int i=n1; i>0; i=i/10) {
            		   int digit = i%10;
            		   count++;
            	   }
            	   System.out.println("Count of Digit " + count);
               }
//
//               Reverse a given number using a loop.
               public void reverse(int n) {
            	   int rev =0; 
            	   for(int i=n; i>0; i=i/10) {
            		   int digit = i%10;
            		   rev = rev *10 + digit;
            	   }
            	   System.out.println("Reverse Number " + rev);
               }
//
//               Check whether a number is Palindrome.
//
//               Find the sum of digits of a number.
//
//               Print the multiplication table of a given number.
               
               
               public static void main(String[] args) {
				FactorialOfNumber f = new FactorialOfNumber();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number : ");
				int n = sc.nextInt();
				f.fact(n);
				
				f.countDigit(n);
				
				f.reverse(n);
				
			}
}
