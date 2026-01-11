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
	public void DigitFrequency(int n , int targetDigit) {
		int digitFreq = 0;
		
		for(int i=n ;i>0; i=i/10) {
			int digit = i%10;
			if(digit == targetDigit) {
				digitFreq++;
			}
		}
		System.out.println("DigitFrequency would be : " + digitFreq);
		
		
		
	}
//
//	Print all factors of a given number.
	
	public void factors(int n) {
		   int factors =0;
		   
		   for(int i=1; i<=n; i++) {
			   if(n%i==0) {
				   System.out.println("Factors  " + i);
			   }
			   
		   }
	}
//
//	Check whether a number is Armstrong number.
	public void armStrongNumber(int n) {
		        int original = n;
		        int digits = 0;
		        int sum =0;
		        
		        for(int temp=n; temp>0; temp= temp/10) {
		        	digits++;
		        }
		        
		        //calculate the armstrong number
		        for(int temp=n ;temp>0; temp = temp/10) {
		        	int digit = temp%10;
		        	sum +=Math.pow(digits, digit);
		        }
		        
		        if(sum==original) {
		        	System.out.println("Armstrong number  : " + original);
		        }
		        else {
		        	System.out.println("Not a ArmStrong number : " + original);
		        }
	}
//
//	Find GCD (HCF) of two numbers using loop.
	public void findGCD(int a ,int b) {
		int gcd =1;
		
		for(int i=1; i<=a&& i<=b; i++) {
			if(a%i==0 && b%i==0) {
				gcd =i;
			}
		}
		
		System.out.println("GCD = " + gcd);
	}
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
				
				System.out.println("Enter the target digit : " );
				p.DigitFrequency(n, 3);
				
				p.factors(n);
				
				p.armStrongNumber(n);
				
				System.out.println("Enter a : ");
				int a = sc.nextInt();
				System.out.println("Enter b : ");
				int b = sc.nextInt();
				
				p.findGCD(a,b);
			}
}
