package practice.Practice1;

import java.util.Scanner;

public class PracticeQuestions2 {
	
//	Find the largest digit in a number.
	public void largestDigit(int n) {
		        int maxDigit = Integer.MIN_VALUE;
		        
		        for(int i=n; i>0; i=i/10) {
		        	int digit = i%10;
		        	if(digit>maxDigit) {
		        		maxDigit = digit;
		        	}
		        }
		        System.out.println("Maximum digit : " + maxDigit);
	}
//
//	Count the occurrence of a digit in a number.
//
//	Print all factors of a given number.
//
//	Check whether a number is Armstrong number.
//
//	Find GCD (HCF) of two numbers using loop.
//
//	Find LCM of two numbers using loop.
//
//	Print numbers from N to 1 without using recursion.
             public static void main(String[] args) {
				PracticeQuestions2 p = new PracticeQuestions2();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter number : ");
				int n = sc.nextInt();
				p.largestDigit(n);
			}
}
