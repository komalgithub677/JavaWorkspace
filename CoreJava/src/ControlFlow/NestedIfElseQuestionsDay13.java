<<<<<<< HEAD
package ControlFlow;

public class NestedIfElseQuestionsDay13 {
             public static void main(String[] args) {
            	 //✅ NESTED IF–ELSE QUESTIONS

            	 //Check if a number is positive, negative, or zero.
            	 int num =4;
            	 if(num>0) {
            		 System.out.println("Number i spositive");
            		 if(num<0) {
            			 System.out.println("Number is negative");
            		 }
            		 else {
            			 System.out.println("Number is zero");
            		 }
            	 }
            	 

            	 //Check day of the week from 1–7 (Monday to Sunday).
            	 int day = 4;
            	 if(day>=1 && day<=7) {
            		 if(day==1) {
            			 System.out.println("Day is monday");
            		 }
            		 else if(day==2) {
            			 System.out.println("Day is Tuesday");
            		 }
            		 else if(day==3) {
            			 System.out.println("Day is WEdnesday");
            		 }
            		 else if(day==4) {
            			 System.out.println("Day is Thursday");
            		 }
            		 else if(day==5) {
            			 System.out.println("Day is Friday");
            		 }
            		 else if(day==6) {
            			 System.out.println("Day is saturday");
            		 }
            		 else if(day==7) {
            			 System.out.println("Day is sunday");
            		 }
            		 
            	 }
            	 else {
            		 System.out.println("Invalid day number");
            	 }

            	 //Check the type of triangle: Equilateral, Isosceles, Scalene.
            	 int a =10;
            	 int b = 20;
            	 int c = 30;
            	 if(a==b || b==c) {
            		 System.out.println("Triangle is equilateral");
            	 }
            	 else if(a==b || b==c || c==a) {
            		 System.out.println("Triangle is Isoceles");
            	 }
            	 else if(a!=b || b!=a || c!=a) {
            		  System.out.println("Triangle is Scalene");
            	 }

            	 //Check grade of a student based on marks (A, B, C, D, Fail).
            	 int marks = 60;
            	 if(marks>=35 && marks<=90) {
            		 if(marks>=80 && marks<=90) {
            			 System.out.println("Student Passed with the distinction ");
            		 }
            		 else if(marks>=70 && marks<=80) {
            			 System.out.println("Student Passed with the grade A");
            		 }
            		 else if(marks>=60 && marks<=80) {
            			 System.out.println("Student passed with the Grade B");
            		 }
            		 else if(marks>=50 && marks<=60) {
            			 System.out.println("Student Passed with the grade C");
            		 }
            		 else if(marks>=40 && marks<=50) {
            			 System.out.println("Student Passed with the Grade D");
            		 }
            		 else if(marks>=30 && marks<=40) {
            			 System.out.println("Student Passed with the Grade E");
            		 }
            		 else if(marks>=35 && marks<=40) {
            			 System.out.println("Student Passed with the the Grade P ");
            		 }
            	 }
            	 else {
            		 System.out.println("Student Failed");
            	 }

            	 //Check if a year is leap year, and if yes, check if it's a century year.
            	 int year = 2020;
            	 if(year%4==0 &&(year%100==0 && year%400==0)) {
            		 System.out.println("Year is aLeap yaer");
            	 }

            	 //Check if a person is adult (18+), teenager (13–17), or child.
            	 int age = 24;
            	 if(age>=18) {
            		 if(age>=13 && age<=17) {
            			 System.out.println("Person is a Teenager");
            		 }
            		 else if(age>=0 && age<=13) {
                         System.out.println("Person is Child");            			 
            		 }
            	 }
            	 else {
            		 System.out.println("Person is a Not adult or Teenager or child");
            	 }

            	 //Check whether a number is even, and if even, check if it’s greater than 50.
            	 int num1 = 22;
            	 if(num1%2==0 && num1>=50) {
            		 System.out.println("Number is Even ");
            		 System.out.println("Number is Greater than 50");
            	 }
            	 else {
            		 System.out.println("Number is not even or Number is not greater than 50");
            	 }

            	 //Check if a person is eligible for voting and contesting (age ≥ 25).
            	 int age1 =13;
            	 if(age1>=18) {
            		 System.out.println("Person is eligible for voting");
            	
            	      if(age1>=25) {
            		 System.out.println("Person is eligible for contesting");
            	     }
            	      else {
            		  System.out.println("Person is not eligible for contesting");
            	      }
            	 }
            	 else {
            		 System.out.println("Person is not eligible for voting or contestng");
            	 }
     
            	 //Check if number is positive, and if positive, check if it’s divisible by 10.
            	 int num2=16;
            	 if(num>0) {
            		 System.out.println("Number is positive");
            	 }
            	 else {
            		 System.out.println("Number is negative");
            	 }
            	 if(num%10==0) {
            		 System.out.println("Number is divisible by 10");
            	 }

            	 //Check if number is even; if even, check if divisible by 3.
            	 int num3=30;
            	 if(num3%2==0) {
            		 System.out.println("Number is even");
            	 }
            	 else if(num3%3==0){
            		 System.out.println("Number is Divisible by 3");
            	 }

            	 //Check if temperature is hot, warm, cool, or cold.
            	 double temp = 40;
            	 if(temp>=0 && temp<=100) {
            		 if(temp>50 && temp<=100) {
            			 System.out.println("Temperature is too hot");
            		 }
            		 else if(temp>=25 && temp<=49) {
            			 System.out.println("Temperature is warm");
            		 }
            		 else if(temp>=5 && temp <=24) {
            			 System.out.println("Temperatur is cool");
            		 }
            		 else {
            			 System.out.println("Temperature is too cold");
            		 }
            	 }

            	 //Check if student passed, and if passed, check if marks are distinction (≥ 75).
            	 int marks1 = 30;
            	 if(marks1<=35 && marks <=100) {
            		 if(marks1>=35) {
            			 System.out.println("Student Passed");
            		 }
            		 else if(marks1<35) {
            			 System.out.println("Student Failed");
            		 }
            		 else if(marks>=75) {
            			 System.out.println("Student Passed with the distinction");
            		 }
            	 }

            	 //Check if a character is alphabet, and if alphabet, check vowel or consonant.
            	 char ch = 'A';
            	 if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z' )) {
            		 System.out.println("Character is an alphabet");
            		 if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e' || ch=='A' || ch=='I' ||ch=='O' ||ch=='U' || ch=='E') {
            			 System.out.println("Character is a vowel");
            		 }
            		 else {
            			 System.out.println("Charater is consonant");
            		 }
            	 }
            	 else {
            		 System.out.println("Character is not a vowel character is not a consonat character is not a aplhabet");
            	 }

            	 //Check if number is divisible by 4; if yes, check if divisible by 8.
            	 int num4 =40;
            	 if(num4%4==0) {
            		 System.out.println("Number is divisible by 4");
            		 if(num4%8==0) {
            			 System.out.println("Number is divisible by 8");
            		 }
            	 }

            	 //Check if entered password is correct, and if correct, check if user is admin.
            	 String password ="123";
            	 String correctedPassword ="123";
            	 String role ="admin";
            	 
            	 if(password.equals(correctedPassword)) {
            		 System.out.println("Password is correct");
            		 if(role.equals(role)) {
            			 System.out.println("User is a Admin");
            		 }
            	 }
            	 else {
            		 System.out.println("Incorrect Password");
            	 }
            	 

            	 //Check if number is prime (simple nested logic).
            	 int num5 =13;
            	 if(num5>1) {
            		 System.out.println("Number is a prime number ");
            		 if(num5==2) {
            			 System.out.println("Number is prime number");
            		 }
            		 else if(num5%2==0) {
            			 System.out.println("Number is not prime");
            		 }
            		 else {
            			 System.out.println("Number is prime");
            		 }
            	 }
            	 else {
            		 System.out.println("Number is not prime");
            	 }

            	 //Check if month is valid (1–12) and print number of days.
            	 int month = 1;
            	 if(month>=1 && month<=12) {
            		 if(month==1) {
            			 System.out.println("Month is a january");
            		 }
            		 else if(month==2) {
            			 System.out.println("Month is February");
            		 }
            		 else if(month==3) {
            			 System.out.println("Month is March");
            		 }
            		 else if(month==4) {
            			 System.out.println("Month is a April");
            		 }
            		 else if(month==5) {
            			 System.out.println("Month is a May");
            		 }
            		 else if(month==6) {
            			 System.out.println("Month is a June");
            		 }
            		 else if(month==7) {
            			 System.out.println("Month is a July");
            		 }
            		 else if(month==8) {
            			 System.out.println("Month is August");
            		 }
            		 else if(month==9) {
            			 System.out.println("Month is a September");
            		 }
            		 else if(month==10) {
            			 System.out.println("Month is a October");
            		 }
            		 else if(month==11) {
            			 System.out.println("Month is a November");
            		 }
            		 else if(month==12) {
            			 System.out.println("Month is a december");
            		 }
            	 }
            	 else {
            		 System.out.println("Month is invalid");
            	 }

            	 //Check if given three sides can form a triangle, and if yes, print type.
            	 int a1 =15 , a2=15 , a3=15;
            	 if(a1+a2>a3 && a2+a3>a1 && a3+a1>a2) {
            		 System.out.println("These Three sides Can form a triangle");
            		 if(a1==a2 || a2==a3) {
            			 System.out.println("This form a equilateral triangle");
            		 }
            		 else if(a1==a2  || a2==a3 || a3==a1) {
            			 System.out.println("This form an isoceles triangle");
            		 }
            		 else if(a1!=a2 || a2!=a3 || a3!=a1) {
            			 System.out.println("This form an Scalene Triangle");
            		 }
            	 }
            	 else {
            		 System.out.println("This three sides not from a isoceles triangle");
            	 }

            	 //Check if number is Armstrong number (3-digit).
            	 int num6 = 155;
            	 if(num6>=100 && num6<=999) {
            		 int original = num;
            		 
            		 int a4 = num6%10;
            		 a4 = num6/10;
            		 
            		 int b4 = num6%10;
            		 int c4 =num6/10;
            		 
            		 int sum = (a4*a4*a4)+(b4*b4*b4)+(c4*c4*c4);
            		 
            		 if(sum==original)
            		 {
            			 System.out.println("Armstrong number");
            		 }
            		 else {
            			 System.out.println("Not an Armstrong number");
            		 }
            	 }
            	 else {
            		 System.out.println("Not a 3-digit number");
            	 }
			}
}
=======
package ControlFlow;

public class NestedIfElseQuestionsDay13 {
             public static void main(String[] args) {
            	 //✅ NESTED IF–ELSE QUESTIONS

            	 //Check if a number is positive, negative, or zero.
            	 int num =4;
            	 if(num>0) {
            		 System.out.println("Number i spositive");
            		 if(num<0) {
            			 System.out.println("Number is negative");
            		 }
            		 else {
            			 System.out.println("Number is zero");
            		 }
            	 }
            	 

            	 //Check day of the week from 1–7 (Monday to Sunday).
            	 int day = 4;
            	 if(day>=1 && day<=7) {
            		 if(day==1) {
            			 System.out.println("Day is monday");
            		 }
            		 else if(day==2) {
            			 System.out.println("Day is Tuesday");
            		 }
            		 else if(day==3) {
            			 System.out.println("Day is WEdnesday");
            		 }
            		 else if(day==4) {
            			 System.out.println("Day is Thursday");
            		 }
            		 else if(day==5) {
            			 System.out.println("Day is Friday");
            		 }
            		 else if(day==6) {
            			 System.out.println("Day is saturday");
            		 }
            		 else if(day==7) {
            			 System.out.println("Day is sunday");
            		 }
            		 
            	 }
            	 else {
            		 System.out.println("Invalid day number");
            	 }

            	 //Check the type of triangle: Equilateral, Isosceles, Scalene.
            	 int a =10;
            	 int b = 20;
            	 int c = 30;
            	 if(a==b || b==c) {
            		 System.out.println("Triangle is equilateral");
            	 }
            	 else if(a==b || b==c || c==a) {
            		 System.out.println("Triangle is Isoceles");
            	 }
            	 else if(a!=b || b!=a || c!=a) {
            		  System.out.println("Triangle is Scalene");
            	 }

            	 //Check grade of a student based on marks (A, B, C, D, Fail).
            	 int marks = 60;
            	 if(marks>=35 && marks<=90) {
            		 if(marks>=80 && marks<=90) {
            			 System.out.println("Student Passed with the distinction ");
            		 }
            		 else if(marks>=70 && marks<=80) {
            			 System.out.println("Student Passed with the grade A");
            		 }
            		 else if(marks>=60 && marks<=80) {
            			 System.out.println("Student passed with the Grade B");
            		 }
            		 else if(marks>=50 && marks<=60) {
            			 System.out.println("Student Passed with the grade C");
            		 }
            		 else if(marks>=40 && marks<=50) {
            			 System.out.println("Student Passed with the Grade D");
            		 }
            		 else if(marks>=30 && marks<=40) {
            			 System.out.println("Student Passed with the Grade E");
            		 }
            		 else if(marks>=35 && marks<=40) {
            			 System.out.println("Student Passed with the the Grade P ");
            		 }
            	 }
            	 else {
            		 System.out.println("Student Failed");
            	 }

            	 //Check if a year is leap year, and if yes, check if it's a century year.
            	 int year = 2020;
            	 if(year%4==0 &&(year%100==0 && year%400==0)) {
            		 System.out.println("Year is aLeap yaer");
            	 }

            	 //Check if a person is adult (18+), teenager (13–17), or child.
            	 int age = 24;
            	 if(age>=18) {
            		 if(age>=13 && age<=17) {
            			 System.out.println("Person is a Teenager");
            		 }
            		 else if(age>=0 && age<=13) {
                         System.out.println("Person is Child");            			 
            		 }
            	 }
            	 else {
            		 System.out.println("Person is a Not adult or Teenager or child");
            	 }

            	 //Check whether a number is even, and if even, check if it’s greater than 50.
            	 int num1 = 22;
            	 if(num1%2==0 && num1>=50) {
            		 System.out.println("Number is Even ");
            		 System.out.println("Number is Greater than 50");
            	 }
            	 else {
            		 System.out.println("Number is not even or Number is not greater than 50");
            	 }

            	 //Check if a person is eligible for voting and contesting (age ≥ 25).
            	 int age1 =13;
            	 if(age1>=18) {
            		 System.out.println("Person is eligible for voting");
            	
            	      if(age1>=25) {
            		 System.out.println("Person is eligible for contesting");
            	     }
            	      else {
            		  System.out.println("Person is not eligible for contesting");
            	      }
            	 }
            	 else {
            		 System.out.println("Person is not eligible for voting or contestng");
            	 }
     
            	 //Check if number is positive, and if positive, check if it’s divisible by 10.
            	 int num2=16;
            	 if(num>0) {
            		 System.out.println("Number is positive");
            	 }
            	 else {
            		 System.out.println("Number is negative");
            	 }
            	 if(num%10==0) {
            		 System.out.println("Number is divisible by 10");
            	 }

            	 //Check if number is even; if even, check if divisible by 3.
            	 int num3=30;
            	 if(num3%2==0) {
            		 System.out.println("Number is even");
            	 }
            	 else if(num3%3==0){
            		 System.out.println("Number is Divisible by 3");
            	 }

            	 //Check if temperature is hot, warm, cool, or cold.
            	 double temp = 40;
            	 if(temp>=0 && temp<=100) {
            		 if(temp>50 && temp<=100) {
            			 System.out.println("Temperature is too hot");
            		 }
            		 else if(temp>=25 && temp<=49) {
            			 System.out.println("Temperature is warm");
            		 }
            		 else if(temp>=5 && temp <=24) {
            			 System.out.println("Temperatur is cool");
            		 }
            		 else {
            			 System.out.println("Temperature is too cold");
            		 }
            	 }

            	 //Check if student passed, and if passed, check if marks are distinction (≥ 75).
            	 int marks1 = 30;
            	 if(marks1<=35 && marks <=100) {
            		 if(marks1>=35) {
            			 System.out.println("Student Passed");
            		 }
            		 else if(marks1<35) {
            			 System.out.println("Student Failed");
            		 }
            		 else if(marks>=75) {
            			 System.out.println("Student Passed with the distinction");
            		 }
            	 }

            	 //Check if a character is alphabet, and if alphabet, check vowel or consonant.
            	 char ch = 'A';
            	 if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z' )) {
            		 System.out.println("Character is an alphabet");
            		 if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e' || ch=='A' || ch=='I' ||ch=='O' ||ch=='U' || ch=='E') {
            			 System.out.println("Character is a vowel");
            		 }
            		 else {
            			 System.out.println("Charater is consonant");
            		 }
            	 }
            	 else {
            		 System.out.println("Character is not a vowel character is not a consonat character is not a aplhabet");
            	 }

            	 //Check if number is divisible by 4; if yes, check if divisible by 8.
            	 int num4 =40;
            	 if(num4%4==0) {
            		 System.out.println("Number is divisible by 4");
            		 if(num4%8==0) {
            			 System.out.println("Number is divisible by 8");
            		 }
            	 }

            	 //Check if entered password is correct, and if correct, check if user is admin.
            	 String password ="123";
            	 String correctedPassword ="123";
            	 String role ="admin";
            	 
            	 if(password.equals(correctedPassword)) {
            		 System.out.println("Password is correct");
            		 if(role.equals(role)) {
            			 System.out.println("User is a Admin");
            		 }
            	 }
            	 else {
            		 System.out.println("Incorrect Password");
            	 }
            	 

            	 //Check if number is prime (simple nested logic).
            	 int num5 =13;
            	 if(num5>1) {
            		 System.out.println("Number is a prime number ");
            		 if(num5==2) {
            			 System.out.println("Number is prime number");
            		 }
            		 else if(num5%2==0) {
            			 System.out.println("Number is not prime");
            		 }
            		 else {
            			 System.out.println("Number is prime");
            		 }
            	 }
            	 else {
            		 System.out.println("Number is not prime");
            	 }

            	 //Check if month is valid (1–12) and print number of days.
            	 int month = 1;
            	 if(month>=1 && month<=12) {
            		 if(month==1) {
            			 System.out.println("Month is a january");
            		 }
            		 else if(month==2) {
            			 System.out.println("Month is February");
            		 }
            		 else if(month==3) {
            			 System.out.println("Month is March");
            		 }
            		 else if(month==4) {
            			 System.out.println("Month is a April");
            		 }
            		 else if(month==5) {
            			 System.out.println("Month is a May");
            		 }
            		 else if(month==6) {
            			 System.out.println("Month is a June");
            		 }
            		 else if(month==7) {
            			 System.out.println("Month is a July");
            		 }
            		 else if(month==8) {
            			 System.out.println("Month is August");
            		 }
            		 else if(month==9) {
            			 System.out.println("Month is a September");
            		 }
            		 else if(month==10) {
            			 System.out.println("Month is a October");
            		 }
            		 else if(month==11) {
            			 System.out.println("Month is a November");
            		 }
            		 else if(month==12) {
            			 System.out.println("Month is a december");
            		 }
            	 }
            	 else {
            		 System.out.println("Month is invalid");
            	 }

            	 //Check if given three sides can form a triangle, and if yes, print type.
            	 int a1 =15 , a2=15 , a3=15;
            	 if(a1+a2>a3 && a2+a3>a1 && a3+a1>a2) {
            		 System.out.println("These Three sides Can form a triangle");
            		 if(a1==a2 || a2==a3) {
            			 System.out.println("This form a equilateral triangle");
            		 }
            		 else if(a1==a2  || a2==a3 || a3==a1) {
            			 System.out.println("This form an isoceles triangle");
            		 }
            		 else if(a1!=a2 || a2!=a3 || a3!=a1) {
            			 System.out.println("This form an Scalene Triangle");
            		 }
            	 }
            	 else {
            		 System.out.println("This three sides not from a isoceles triangle");
            	 }

            	 //Check if number is Armstrong number (3-digit).
            	 int num6 = 155;
            	 if(num6>=100 && num6<=999) {
            		 int original = num;
            		 
            		 int a4 = num6%10;
            		 a4 = num6/10;
            		 
            		 int b4 = num6%10;
            		 int c4 =num6/10;
            		 
            		 int sum = (a4*a4*a4)+(b4*b4*b4)+(c4*c4*c4);
            		 
            		 if(sum==original)
            		 {
            			 System.out.println("Armstrong number");
            		 }
            		 else {
            			 System.out.println("Not an Armstrong number");
            		 }
            	 }
            	 else {
            		 System.out.println("Not a 3-digit number");
            	 }
			}
}
>>>>>>> 4df4624 (Added new switch case package)
