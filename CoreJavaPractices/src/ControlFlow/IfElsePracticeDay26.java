package ControlFlow;

public class IfElsePracticeDay26 {
             public static void main(String[] args) {
//            	 Find the largest of two numbers.
            	 int a=10 , b=20;
            	 if(a>b) {
            		 System.out.println("Number a is greater");
            	 }
            	 else {
            		 System.out.println("Number b is greater");
            	 }
//
//            	 Find the largest of three numbers.
            	 int a1 =10 , a2=20 , a3=30;
            	 if(a1>a2 && a1>a3) {
            		 System.out.println("a1 is greater");
            	 }
            	 else if(a2>a1 && a2>a3) {
            		 System.out.println("a2 is greater");
            	 }
            	 else {
            		 System.out.println("a3 is greater");
            	 }
//
//            	 Check if a number is even or odd.
            	 int num =10;
            	 if(num%2==0) {
            		 System.out.println("Number is even");
            	 }
            	 else {
            		 System.out.println("Number is odd");
            	 }
//
//            	 Check if a number is positive, negative, or zero.
            	 int num1 =30;
            	 if(num1==0) {
            		 System.out.println("Number is zero");
            	 }
            	 else if(num1>0) {
            		 System.out.println("Number 1 is positive");
            	 }
            	 else {
            		 System.out.println("Num 1 is negative");
            	 }
//
//            	 Check if a character is vowel or consonant (without string methods).
            	 char ch = 'a';
            	 
            	 if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e') {
            		 System.out.println("Character is vowel");
            	 }
            	 else {
            		 System.out.println("Character is consonant");
            	 }
//
//            	 Check if a number is divisible by both 3 and 5.
            	 int num2 =30;
            	 if(num2%3==0 && num2%5==0) {
            		 System.out.println("Number is divisible by both 3 and 5");
            	 }
            	 else {
            		 System.out.println("Number is not divisible by both 3 and 5");
            	 }
//
//            	 Check if a number is divisible by either 4 or 6.
            	 int num3 = 90;
            	 if(num3%4==0) {
            		 System.out.println("Number is divisible by 4 and 6");
            	 }
            	 else {
            		 System.out.println("Number is not divisible by 4 and 6");
            	 }
//
//            	 Check if a year is leap year.
            	 int year = 2020;
            	 if(year%4==0 || (year%400==0 && year%100!=0))
            			 {
            		 System.out.println("Leap year");
            	 }
            	 else {
            		 System.out.println("Not a leap year");
            	 }
//
//            	 Check if the last digit of two numbers is same.
            	 int num4 = 40;
            	 int num5 =50;
            	
            	 int lastDigit1 = num4%10;
            	 int lastDigit2 = num5%10;
            	 
            	 if(lastDigit1 == lastDigit2){
            		 System.out.println("Last digit of two number would be the same");
            	 }
            	 else {
            		 System.out.println("Last digit of two numbers would not be same");
            	 }
            	
//
//            	 Check if a number is between 100 and 200.
            	 int number =100;
                 if(number>=100 && number<=200) {
                	 System.out.println("Number is between the 100 and 200");
                 }
                 else {
                	 System.out.println("Number is not between the 100 and 200");
                 }
//
//            	 Check if a number ends with digit 5.
                 int num6=15;
                 int lastDigit = num6%10;
                 if(lastDigit ==5) {
                	 System.out.println("Number ends with the digit 5");
                 }
                 else {
                	 System.out.println("Number does not ends with 5");
                 }
//
//            	 Check if a number is two-digit or three-digit.
                 int num7 =20;
                 
                 if(num7>=10 && num<=99) {
                	 System.out.println("Number is a two digit");
                 }
                 else {
                	 System.out.println("Number is not a two digit");
                 }
//
//
//            	 Check if a number is a perfect square (without sqrt).
               int num8 =30;
               boolean isPerfectSquare = false;
               
               for(int i=1; i*i<=num8; i++) {
            	   if(i*i ==num8) {
            		   isPerfectSquare =true;
            		   break;
            	   }
               }
            	  
               if(isPerfectSquare) {
            	   System.out.println("Number is a perfect square");
               }
               else {
            	   System.out.println("Number is not a perfect square");
          }
                 
//
//            	 Check if a number is a perfect cube (without cube root).
               int num9 =8;
               boolean isPerfectCube = false;
               for(int i=1; i*i*i<=num9; i++) {
            	   if(i*i*i==num9) {
            		   isPerfectCube = true;
            	   }
               }
               
               if(isPerfectSquare) {
            	   System.out.println("Number is a perfect square");
               }
               else {
            	   System.out.println("Number is not a perfect square");
               }  
			}
}
