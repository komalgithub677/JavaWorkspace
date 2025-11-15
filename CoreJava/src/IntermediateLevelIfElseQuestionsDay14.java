package ControlFlow;

public class IntermediateLevelIfElseQuestionsDay14 {
             public static void main(String[] args) {
            	 //INTERMEDIATE IF–ELSE QUESTIONS

            	 //Check profit or loss from selling price and cost price.
            	 float costPrice = 500;
            	 float sellingPrice = 650;
            	 
            	 if(sellingPrice>costPrice) {
            		 System.out.println("Profit :" + (sellingPrice - costPrice));
            	 }
            	 else if (sellingPrice<costPrice) {
            		 System.out.println("Loss :"+(costPrice - sellingPrice));
            	 }
            	 else {
            		 System.out.println("No profit No Loss");
            	 }

            	 //2.Check if a person is eligible for scholarship.
            	 float percentage = 82.5f;
            	 float income = 150000;
            	 
            	 if(percentage>=75) {
            		 if(income<=200000) {
            			 System.out.println("Person is eligible for scholership");
            		 }
            		 else {
            			 System.out.println("Person is not eligible for scholership : Income is too high");
            		 }
            	 }
            	 else {
            		 System.out.println("Not eligible : Percentage is too low");
            	 }
            	 

            	 //Check if a worker receives overtime pay.
            	 int workingHours =15;
            	 int regularHours =8;
            	 int overtimeRate = 100;
          
            	 
            	 if(workingHours>regularHours) {
            		 int extraHours = workingHours - regularHours;
            		 int overtimePay = extraHours*overtimeRate;
            		 System.out.println("worker receives the overtime pay :" + overtimePay);
            	 }
            	 else {
            		 System.out.println("No overtime Pay");
            	 }
            	 

            	 //Check if a number ends with digit 5.
            	 int num =5;
            	 if(num%10==5) {
            		 System.out.println("Number Ends with the 5");
            	 }
            	 else {
            		 System.out.println("Number not ends with the 5");
            	 }

            	 //Check if a character is digit or alphabet.
            	 char ch ='1';
            	 if((ch>='A' && ch<='z') || (ch>='a' && ch<='z')) {
            		 System.out.println("Character is an aplhabet");
            	 }
            	 else if(ch>='0' || ch<='9') {
            		 System.out.println("Character is a digit");
            	 }
            	 else {
            		 System.out.println("Character is not a alphabet and not a digit");
            	 }

            	 //Check if a number is perfect square.
            	 int num1 = 4;
            	 int sqrt = (int)Math.sqrt(num1);
            	 
            	 if(sqrt * sqrt == num1) {
            		 System.out.println("Number is a perfect square");
            	 }
            	 else {
            		 System.out.println("Number is not a perfect square");
            	 }

            	 

            	 //Check if a triangle is valid based on the sum of sides.
                 int a1 = 10;
                 int a2 = 9;
                 int a3 = 8;
                 if(a1+a2>a3 && a2+a3>a1 && a1+a3>a2) {
                	 if(a1==a2 && a2 ==a3) {
                		 System.out.println("Triangle is an equilateral triangle");
                	 }
                	 else if(a1==a2 || a2==a3 || a3==a1) {
                		 System.out.println("Triangle is an isoceles traigle");
                	 }
                	 else {
                		 System.out.println("Triangle is an scalene");
                	 }
                 }
                 else {
                	 System.out.println("Triangle is not an valid triangle");
                 }

            	 //Check if a number is within the voting booth number range.
                 
                  int number = 24;
                  if(number>=18 && number<=60) {
                	  System.out.println("Number is from the voting booth number");
                  }
                  else {
                	  System.out.println("Number is not from an voting booth number");
                  }
            	 //Check if marks are valid (0–100).
                  int marks =60;
                  if(marks>=0 && marks<=100) {
                	  System.out.println("Marks are valid");
                  }
                  else {
                	  System.out.println("Marks are not valid");
                  }
			}          
	
}
