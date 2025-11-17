<<<<<<< HEAD
package ControlFlow;

public class IFElsePracticeDay12 {
             public static void main(String[] args) {
//            	 ✅ BASIC IF–ELSE QUESTIONS
//
//            	 Check if a number is positive or negative.
            	 int num = 20;
            	 if(num>0) {
            		 System.out.println("Number is positive");
            	 }
            	 else {
            		 System.out.println("Number is negative");
            	 }
//
//            	 Check if a number is even or odd.
            	 if(num%2==0) {
            		 System.out.println("Number is even");
            	 }
            	 else {
            		 System.out.println("Number is odd");
            	 }
//
//            	 Check if a person is eligible to vote (age ≥ 18).
            	 int age =30;
            	 if(age>=18) {
            		 System.out.println("Person is eligible to vote");
            	 }
//
//            	 Check if a number is divisible by 5.
            	 if(num%5==0) {
            		 System.out.println("Number is divisible by 5");
            	 }
//
//            	 Check if a number is divisible by 10.
            	 if(num%10==0) {
            		 System.out.println("Number is divisible by 10");
            	 }
//
//            	 Check if a number is divisible by both 3 and 5.
            	 if(num%3==0) {
            		 System.out.println("Number is divisible by 3");
            		 if(num%5==0) {
            			 System.out.println("Number is divisible by 5");
            		 }
            	 }
//
//            	 Check if a number is divisible by 7 or 11.
            	 int num2=89;
            	 if(num2%7==0) {
            		 System.out.println("Number is divisible by 7");
            		 if(num2%7==0) {
            			 System.out.println("Number is divisible by 11");
            		 }
            	 }
//
//            	 Check if a given year is a leap year.
            	 int year =3030;
            	 if(year%4==0 && (year%400==0 && year%100!=0) ) {
            		 System.out.println("Year is aleap year");
            	 }
//
//            	 Check if temperature is above 30°C (print “Hot Day”).
            	 double temp =50;
            	 if(temp>30) {
            		 System.out.println("Hot Day");
            	 }
//
//            	 Check if password length is greater than 6.
            	 String password = "123";
            	 if(password.length()>6) {
            		 System.out.println("Password length is greater than 6");
            	 }
//
//            	 Check if a user’s age is more than 60 (senior citizen).
            	 int age3 =89;
            	 if(age3>60) {
            		 System.out.println("Person is senior citizen");
            	 }
//
//            	 Check if a student passed (marks ≥ 35).
            	 int marks = 60;
            	 if(marks>=35) {
            		 System.out.println("Student passed if marks is greatr than 35");
            	 }
//
//            	 Check if a number is a single-digit number.
            	 int num4 = 21;
            	 if(num4>=0 && num<10) {
            		 System.out.println("Single digit number");
            	 }
            	 else {
            		 System.out.println("Not a single digit number");
            	 }
//
//            	 Check if a number is a two-digit number.
            	 int num5 =40;
            	 if(num>=10 && num<100) {
            		 System.out.println("Two - Dogit Number");
            	 }
            	 else {
            		 System.out.println("Not a Two-Digit Number");
            	 }
//
//            	 Check if a character is a vowel or consonant.
            	 char ch ='A';
            	 if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e'||ch=='A'|| ch=='I'|| ch=='O' || ch=='U' || ch=='E') {
            		 System.out.println("Character is a Vowel");
            	 }
            	 else {
            		 System.out.println("Character is consonant");
            	 }
//
//            	 Check if a character is uppercase or lowercase.
            	 char ch1 ='a';
            	 if(Character.isUpperCase(ch1)) {
            		 System.out.println("Charater is uppercase");
            	 }
            	 else {
            		 System.out.println("Character is lowercase");
            	 }
//
//            	 Check if a number is greater between two numbers.
            	 int a1 = 20;
            	 int a2 = 30;
            	 if(a1>a2) {
            		 System.out.println("Number a1 is greater");
            	 }
            	 else {
            		 System.out.println("Number a2 is greater");
            	 }
//
//            	 Check if a number is smaller between two numbers.
            	 int b1 =40;
            	 int b2 =30;
            	 if(b1>b2) {
            		 System.out.println("Number b1 is greater");
            	 }
            	 else {
            		 System.out.println("Number b2 is greater");
            	 }
//
//            	 Check if a person is eligible for a driving license (age ≥ 18).
            	 int age4 =40;
            	 if(age4>=18) {
            		 System.out.println("Person is Eligible for a driving license");
            	 }
//
//            	 Check if water level is high, medium, or low.
            	 int waterLevel = 75;
            	 if(waterLevel>=70 && waterLevel<=100) {
            		 System.out.println("WaterLevel is High");
            	 }
            	 else if(waterLevel>=40 && waterLevel<=70) {
            		 System.out.println("Water level is medium");
            	 }
            	 else {
            		 System.out.println("Waterlevel is low");
            	 }
            	 

			}
}
=======
package ControlFlow;

public class IFElsePracticeDay12 {
             public static void main(String[] args) {
//            	 ✅ BASIC IF–ELSE QUESTIONS
//            	 Check if a number is positive or negative.
            	 int num = 20;
            	 if(num>0) {
            		 System.out.println("Number is positive");
            	 }
            	 else {
            		 System.out.println("Number is negative");
            	 }
//            	 Check if a number is even or odd.
            	 if(num%2==0) {
            		 System.out.println("Number is even");
            	 }
            	 else {
            		 System.out.println("Number is odd");
            	 }
//            	 Check if a person is eligible to vote (age ≥ 18).
            	 int age =30;
            	 if(age>=18) {
            		 System.out.println("Person is eligible to vote");
            	 }
//            	 Check if a number is divisible by 5.
            	 if(num%5==0) {
            		 System.out.println("Number is divisible by 5");
            	 }
//            	 Check if a number is divisible by 10.
            	 if(num%10==0) {
            		 System.out.println("Number is divisible by 10");
            	 }
//            	 Check if a number is divisible by both 3 and 5.
            	 if(num%3==0) {
            		 System.out.println("Number is divisible by 3");
            		 if(num%5==0) {
            			 System.out.println("Number is divisible by 5");
            		 }
            	 }
//            	 Check if a number is divisible by 7 or 11.
            	 int num2=89;
            	 if(num2%7==0) {
            		 System.out.println("Number is divisible by 7");
            		 if(num2%7==0) {
            			 System.out.println("Number is divisible by 11");
            		 }
            	 }
//            	 Check if a given year is a leap year.
            	 int year =3030;
            	 if(year%4==0 && (year%400==0 && year%100!=0) ) {
            		 System.out.println("Year is aleap year");
            	 }
//            	 Check if temperature is above 30°C (print “Hot Day”).
            	 double temp =50;
            	 if(temp>30) {
            		 System.out.println("Hot Day");
            	 }
//            	 Check if password length is greater than 6.
            	 String password = "123";
            	 if(password.length()>6) {
            		 System.out.println("Password length is greater than 6");
            	 }
//            	 Check if a user’s age is more than 60 (senior citizen).
            	 int age3 =89;
            	 if(age3>60) {
            		 System.out.println("Person is senior citizen");
            	 }
//            	 Check if a student passed (marks ≥ 35).
            	 int marks = 60;
            	 if(marks>=35) {
            		 System.out.println("Student passed if marks is greatr than 35");
            	 }
//            	 Check if a number is a single-digit number.
            	 int num4 = 21;
            	 if(num4>=0 && num<10) {
            		 System.out.println("Single digit number");
            	 }
            	 else {
            		 System.out.println("Not a single digit number");
            	 }
//            	 Check if a number is a two-digit number.
            	 int num5 =40;
            	 if(num>=10 && num<100) {
            		 System.out.println("Two - Dogit Number");
            	 }
            	 else {
            		 System.out.println("Not a Two-Digit Number");
            	 }
//            	 Check if a character is a vowel or consonant.
            	 char ch ='A';
            	 if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e'||ch=='A'|| ch=='I'|| ch=='O' || ch=='U' || ch=='E') {
            		 System.out.println("Character is a Vowel");
            	 }
            	 else {
            		 System.out.println("Character is consonant");
            	 }
//            	 Check if a character is uppercase or lowercase.
            	 char ch1 ='a';
            	 if(Character.isUpperCase(ch1)) {
            		 System.out.println("Charater is uppercase");
            	 }
            	 else {
            		 System.out.println("Character is lowercase");
            	 }
//            	 Check if a number is greater between two numbers.
            	 int a1 = 20;
            	 int a2 = 30;
            	 if(a1>a2) {
            		 System.out.println("Number a1 is greater");
            	 }
            	 else {
            		 System.out.println("Number a2 is greater");
            	 }
//            	 Check if a number is smaller between two numbers.
            	 int b1 =40;
            	 int b2 =30;
            	 if(b1>b2) {
            		 System.out.println("Number b1 is greater");
            	 }
            	 else {
            		 System.out.println("Number b2 is greater");
            	 }
//            	 Check if a person is eligible for a driving license (age ≥ 18).
            	 int age4 =40;
            	 if(age4>=18) {
            		 System.out.println("Person is Eligible for a driving license");
            	 }
//            	 Check if water level is high, medium, or low.
            	 int waterLevel = 75;
            	 if(waterLevel>=70 && waterLevel<=100) {
            		 System.out.println("WaterLevel is High");
            	 }
            	 else if(waterLevel>=40 && waterLevel<=70) {
            		 System.out.println("Water level is medium");
            	 }
            	 else {
            		 System.out.println("Waterlevel is low");
            	 }
			}
}
>>>>>>> 4df4624 (Added new switch case package)
