package ControlFlow;

public class DecisionMakingQuestionsWithMultipleConditionsDay13 {
             public static void main(String[] args) {
            	 //✅ DECISION-MAKING WITH MULTIPLE CONDITIONS

            	 

            	 //2.Check if employee salary is above 50,000; if yes, apply bonus.
            	 float salary = 40000;
            	 if(salary>50000) {
            		 System.out.println("Salary is above 50,000"); 
            		 
            		 float bonus = salary * 0.10f;
            		 System.out.println("Bonus apllied :" + bonus);
            		 System.out.println("total salary : " + (salary + bonus));
            	 }
            	 else {
            		 System.out.println("Salary is 50,000 or helow ");
            		 System.out.println("No bonus applied");
            	 }

            	 //3.Check if number is divisible by 2, 3, or both.
            	 int num = 10;
            	 if(num%2==0 && num%3==0) {
            		 System.out.println("Number is divisible by both");
            	 }
            	 else if(num%2==0) {
            		 System.out.println("Number is divisible by 2");
            	 }
            	 else if(num%3==0) {
            		 System.out.println("Number is divisible by 3");
            	 }
            	 else {
            		 System.out.println("Number is nt divisible by 2 or 3");
            	 }
            	 

            	 //4.Check traffic light color (red/yellow/green).
            	 String TrafficColor = "red";
            	 
            	 if(TrafficColor=="red") {
            		 System.out.println("Traffic light color is red");
            	 }
            	 else if(TrafficColor=="yellow") {
            		 System.out.println("Traffic light color is yellow");
            	 }
            	 else if(TrafficColor=="green") {
            		 System.out.println("traffic light color is green");
            	 }

            	 //5.Check if username and password are correct.
            	 String userName ="Komal";
            	 String CorrectUserName ="Komal";
            	 String password ="123";
            	 String CorrectPassword = "123";
            	 if(userName==CorrectUserName) {
            		 System.out.println("Username is correct");
            	 }
            	 else if(password==CorrectPassword) {
            		 System.out.println("Password is correct");
            	 }
            	 else {
            		 System.out.println("Password and username is not correct");
            	 }
            	 

            	 //6.Check if number is between 10 and 50.
            	 int num1 =30;
            	 if(num1>=10 && num1<=50) {
            		 System.out.println("Number is betwwen the 10 and 50");
            	 }

            	 //7.Check if number is between 100 and 200.
            	 int num2=70;
            	 if(num2>=100 && num2<=200) {
            		 System.out.println("Number is between the 100 and 200");
            	 }
            	 else {
            		 System.out.println("Number is not between the 100 and the 200");
            	 }

            	 //8.Check if person is senior citizen, adult, or minor.
            	 int age =45;
            	 if(age>=15 && age<=65) {
            		 if(age>=50 && age<=65) {
            			 System.out.println("Person is a senior citizen");
            		 }
            		 else if(age>=18) {
            			 System.out.println("Person is Adult");
            		 }
            		 else if(age<18) {
            			 System.out.println("Person is minor");
            		 }
            	 }
            	 else {
            		System.out.println("Person is a child");
            	 }

            	 //9.Check if electricity bill is low, medium, or high.
            	 int bill = 200;
            	 if(bill>=50 && bill<=1000) {
            		 if(bill>=50 && bill<=100) {
            			 System.out.println("Bill is too low");
            		 }
            		 else if(bill>=100 && bill<=500) {
            			 System.out.println("Bill is medium");
            		 }
            		 else {
            			 System.out.println("Bill is too High");
            		 }
            	 }
            	 else {
            		 System.out.println("Given bill is invalid");
            	 }
            	 

            	 //10.Check if two numbers are equal, greater, or smaller.
            	 int a3 =23,a4=20;
            	 if(a3>a4) {
            		 System.out.println("A3 is greater than the a4");
            	 }
            	 else if(a4>a3) {
            		 System.out.println("a4 is greater than the a3");
            	 }
            	 else {
            		 System.out.println("a3 is equal to the a4");
            	 }
            	 
			}
}
