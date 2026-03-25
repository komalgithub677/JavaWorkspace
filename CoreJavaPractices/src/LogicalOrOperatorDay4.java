
public class LogicalOrOperatorDay4 {
       public static void main(String[] args) {
		 
		  System.out.println(true || false);
		  
		  int x =5;
		  System.out.println(x>10 || x<10);
		  
		  int n=8;
		  System.out.println(n%2 == 0 || n>10);
		  
		  int x1=7;
		  System.out.println(x1 >10 || x1++ >5);
		  
		  boolean flag = false;
		  System.out.println( flag || true);
		  
		  int p=10 , q =5;
		  System.out.println(p<5 || q>2);
		  
		  int n1 =3;
		  System.out.println(n1>10 || n1<5);
		  
		  boolean result =(10>20 || 5<10);
		  System.out.println(result);
		  
		  int a1=10 , b1=0;
		  System.out.println(a1>5 || (10/b1)>2);
		  
         //Write a program to check if a person is eligible to vote (age >= 18 || citizenship == "Indian").
		  int age = 30;
		  String citizenship ="Indian";
		  System.out.println("Checking if person is eligible for vote or not :" +(age>=18 && citizenship.equals(citizenship)) );
//
         //Check if a number is positive or even using ||.
		  int number4 = 5;
		  System.out.println("Checking number is positive or even : " + (number4>0 || number4%2==0));
//
         //Write a program to check if a student passed in any one subject (math ≥ 40 || science ≥ 40).
		  int mathMarks = 20;
		  int scienceMarks = 30;
		  System.out.println("Check if a student passesd in any one subject : " +(mathMarks>=40 || scienceMarks>=40));
//
//		  Check if a number is divisible by 3 or 5.
		  int number5 = 6;
		  System.out.println("Number is divisible by 3 and 5 : " + (number5%3==0 || number5%5==0));
//
          // Write a program to check if a given character is a vowel (a, e, i, o, u) using ||.
		  char c = 'a';
		  System.out.println("Check if a given character is a vowel : " +(c=='a' || c =='i' || c=='e' || c=='o' || c=='u'));
//
         // Check if a person can enter a building (has ID card || visitor pass).
		  boolean hasIDCard = true;
		  boolean visitorPass = true;
		  System.out.println("Check if a person can enter a building : " +(hasIDCard || visitorPass));
//
         // Write a program to check if a year is a century year or leap year.
		  int year = 2020;
		  System.out.println("Checking if a year is leap year or not : " + (year%4==0 ||year%100==0 || year%400!=0));
//
         // Check if a number is less than 0 or greater than 100.
		  int num4 = 8;
		  System.out.println("Check if a number is less than 0 or greater than 100 : "+ (num4<0 || num4>100));
        //Write a program to check if a person can get admission (marks ≥ 80 || sports quota == true).
		  int marks = 60;
		  boolean sportsQuota = true;
		  System.out.println("Check if a person can get a admission : " + (marks>=80 || sportsQuota==true));
//
       //Check if a number is even or multiple of 5.
		  int num5 = 7;
		  System.out.println("Number is even and multiple of 5 : "+ (num5%2==0 || num5%5==0));
		  
//		  Write a program to check if a password is weak (length < 8 || missing special character).
		  String password = "123";
		  boolean specialCharacter = true;
		  System.out.println("Check if a password is weak or not :" + (password.length()<8 || specialCharacter==true));
//
//		  Write a program to check if either of two students passed (marks1 >= 40 || marks2 >= 40).
		  int marks1 = 40;
		  int marks2=40;
		  System.out.println("Check if a two student passed :" + (marks1>=40 || marks2>=40));
//
//		  Check if a user can log in (entered username correct || entered email correct).
		  boolean enteredUsername = true;
		  boolean enteredEmail = true;
		  System.out.println("Check if auser can log in : "+ (enteredUsername || enteredEmail));
//
//		  Write a program to check if a person can get a driving license (age ≥ 18 || parent approval == true).
		  int ages = 30;
		  boolean parentApproval = true;
		  System.out.println("Check if a person can get a driving license : " + (age>=18 || parentApproval == true));
//
//		  Check if a rectangle is invalid (length <= 0 || width <= 0).
		  int length =6;
		  int width = 7;
		  System.out.println("Check if a rectangle is invalid : " + (length<=0 || width<=0));
//
//		  Write a program to check if temperature is too low or too high (temp < 0 || temp > 40).
		  int temp = 30;
		  System.out.println("Check if atemperature is too low or not :" + (temp<0 || temp>40));
//
//		  Check if a triangle is invalid (a + b <= c || b + c <= a || c + a <= b).
		  int sidea = 1;
		  int sideb =2;
		  int sidec =3;
		  System.out.println("Check if a triangle ids invalid : " + (sidea + sideb <=sidec || sideb+sidec<=sidea || sidec+sidea <=sideb));
//
//		  Check if a student can enter the exam (hasID || hallTicket).
		  boolean hasID = true;
		  boolean hallTicket = true;
		  System.out.println("Student can enter the exam :" + (hasID || hallTicket));
//
//		  Check if a device should restart (lowBattery || systemCrash).
		  boolean lowBattery = true;
		  boolean systemCrash = true;
		  System.out.println("Check if a device should restart :" + (lowBattery || hallTicket));
//
//		  Write a program to check if a number is negative or zero.
		  int num6 = 6;
		  System.out.println("Checking if a number is negative or zero :" + (num6<0 || num6==0));
	}
}
