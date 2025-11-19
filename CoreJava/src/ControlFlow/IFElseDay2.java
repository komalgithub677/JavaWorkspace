
package ControlFlow;

public class IFElseDay2 {
             public static void main(String[] args) {
				//1.Checks if a person’s age is greater than 18, then print “Adult”. 
				//2.Checks if a person’s age is greater than 18, then print “Adult”.
            	 int age = 23;
            	 if(age>18) {
            		 System.out.println("Print Adult");
            	 }
            	 

				//3.Checks whether a number is divisible by 10.
            	 int num =10;
            	 if(num%2==0) {
            		 System.out.println("Number is divisible by 10");
            	 }

				//4.Checks whether a temperature is above 30°C, then print “Hot Day”.
            	 double temp = 30;
            	 if(temp>30) {
            		 System.out.println("Temperature is above 30 degree then hot day");
            	 }
            	 

				//5.Checks whether a number is even or odd.
            	 int num1=20;
            	 if(num%2==0) {
            		 System.out.println("Number is even");
            	 }
            	 else {
            		 System.out.println("Number is odd");
            	 }

				//6.Checks whether a given year is leap year or not.
            	 int year = 2020;
            	 if(year%4==0 &&(year%400==0 && year%100!=0)) {
            		 System.out.println("Year is a leap year");
            	 }
            	 else {
            		 System.out.println("year is not leap year");
            	 }

				//7.Checks whether a number is positive or negative.
            	 int num2 =5;
            	 if(num>0) {
            		 System.out.println("Number is positive");
            	 }
            	 else {
            		 System.out.println("Number is negative");
            	 }
            	 
            	 //8Write a program to find grade of a student based on marks:
            	// 90–100 → Grade A
            	 // 90–100 → Grade A
            	 //75–89 → Grad
            	 //50–74 → Grade C
            	 // 35–49 → Grade D
            	 // Below 35 → Fail
            	 int marks = 60;
            	 if(marks>=90 && marks<=100 ) {
            		 System.out.println("Student passed with the grade A");
            	 }
            	 else if(marks>=75 && marks<=89) {
            		 System.out.println("Student passed with the grade B");
            	 }
            	 else if(marks>=50 && marks<=74) {
            		 System.out.println("Student passed with the grade C");
            	 }
            	 else if(marks>=35 && marks<=49) {
            		 System.out.println("Student passed with the grade D");
            	 }
            	 else {
            		 System.out.println("Student failed");
            	 }
            	 
            	 
            	 //9.Prints the day of the week based on day number (1–7).
            	 int DayNumber = 5;
            	 if(DayNumber ==1) {
            		 System.out.println("Day is Monday");
            	 }
            	 else if(DayNumber ==2) {
            		 System.out.println("Day is Tuesday");
            	 }
            	 else if(DayNumber==3) {
            		 System.out.println("Day is Wednesday");
            	 }
            	 else if(DayNumber==4) {
            		 System.out.println("Day is Thursday");
            	 }
            	 else if(DayNumber==5) {
            		 System.out.println("Day is Friday");
            	 }
            	 else if(DayNumber==6) {
            		 System.out.println("Day is Saturday");
            	 }
            	 else if(DayNumber ==7){
            		 System.out.println("Day is Sunday");
            	 }
            	 else {
            		 System.out.println("Another day");
            	 }

            	 //10.Checks the type of triangle (Equilateral, Isosceles, or Scalene).
            	 int x = 20;
            	 int y = 20;
            	 int z = 20;
            	 if(x==y && x==z) {
            		 System.out.println("Triangle is equilateral");
            	 }
            	 else if(x==y || y==z || x==z) {
            		 System.out.println("Triangle is an Isoceles Triangle ");
            	 }
            	 else if(x!=y || y!=z || z!=x) {
            		 System.out.println("Triangle is Scalene");
            	 }

            	 //11.Prints a message based on age group:

            	 //12.0–12 → Child

            	 //13.13–19 → Teenager

            	 //14.20–59 → Adult

            	 //15.60+ → Senior Citizen
            	 float age1=30;
            	 if(age1>=12.0 && age1<=12) {
            		 System.out.println("Child");
            	 }
            	 else if(age1>=13.13 && age1<=19) {
            		 System.out.println("Teenager");
            	 }
            	 else if(age1>=14.20 && age1<=59) {
            		 System.out.println("Adult");
            	 }
            	 else {
            		 System.out.println("Senior Citizen");
            	 }
            	 
            	 //Classify a temperature as Hot, Warm, Cool, or Cold.
            	 double temp1 = 45;
            	 if(temp1<10) {
            		 System.out.println("Too Cold");
            	 }
            	 else if(temp1>=20 && temp<=30) {
            		 System.out.println("Cool");
            	 }
            	 else {
            		 System.out.println("Hot");
            	 }

            	 //Check whether a number is positive, negative, or zero.
            	 int num3=5;
            	 if(num3>0) {
            		 System.out.println("Number is positive");
            	 }
            	 else if(num3<0) {
            		 System.out.println("Number is negative");
            	 }
            	 else {
            		 System.out.println("Number is zero");
            	 }

            	 //Check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
            	 int age3 =45;
            	 if(age3>=18) {
            		 System.out.println("Person is eligible to vote");
            	 }
            	 if(age3>=25) {
            		 System.out.println("They can contest in elections");
            	 }
            	 else {
            		 System.out.println("They are not eligible to vote");
            	 }
            	 

            	 //Check if a year is leap year, and if leap, check if it’s a century year.
            	 int year1 =4000;
            	 if(year%4==0 ||(year%400==0 && year%100!=0)) {
            		 System.out.println("Year is a leap year");
            	 }
            	 if(year%100==0) {
            		 System.out.println("Year is century year");
            	 }

            	 //Check whether a number is even, and if even, check whether it’s greater than 50.
            	 int num4 =50;
            	 if(num4%2==0) {
            		 System.out.println("Number is Even");
            		 if(num4>=50) {
            			 System.out.println("Number is greater than 50");
            		 }
            	 }
        }
}