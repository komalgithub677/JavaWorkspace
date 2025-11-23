package ControlFlow;

public class IfElsePractice {
             public static void main(String[] args) {
//				
//				 Practise Questions on if else : 
//Accept a number and check whether it is a multiple of 5 and 11 or not.
            	 int a =20;
            	 if(a%5==0 && a%11==0) {
            		 System.out.println("Numbers is multiple of 5 and 11");
            	 }
            	 else {
            		 System.out.println("Number is not multiple of 5 and 11");
            	 }
//Accept a person's salary and apply tax:
//Salary < 50,000 → No Tax
//50,000 to 1,00,000 → 10% Tax
//Above 1,00,000 → 20% Tax
            	 float salary =30000;
            	 if(salary<50000) {
            		 System.out.println("No tax");
            	 }
            	 else if(salary>=50000 && salary<=100000) {
            		 System.out.println("10% tax");
            	 }
            	 else if(salary>100000) {
            		 System.out.println("20%tax");
            	 }
            	 else {
            		 System.out.println("Extremely High Tax");
            	 }
//Accept three sides of a triangle and check whether it is valid or not (sum of any two sides > third side).
            	 int a1 =10 , a2=20,a3=21;
            	 if(a1 +a2>a3 && a2+a3>a1 && a3+a1>a2) {
            		 System.out.println("Form a valid triangle");
            	 }
            	 else {
            		 System.out.println("Not found the valid Triangle");
            	 }
//Accept a character and check if it is uppercase, lowercase, digit, or special character.
            	 char ch ='b';
            	 boolean isUpperCase =true;
            	 boolean isLowerCase = true;
            	 boolean isDigit = true;
            	 boolean isSpeacialCharcter =true;
            	 if(isUpperCase) {
            		 System.out.println("Character is uppercase");
            	 }
            	 else if(isLowerCase) {
            		 System.out.println("Character is LowerCase");
            	 }
            	 else if(isDigit ) {
            		 System.out.println("Character is digit");
            	 }
            	 else if(isSpeacialCharcter) {
            		 System.out.println("Character is a speacial");
            	 }
            	 else {
            		 System.out.println("It is an simple character");
            	 }
//Accept a number and check if it is a perfect square or not.
            	 int num =4;
            	 int root = (int)Math.sqrt(num);
            	 if(root * root ==num) {
            		 System.out.println("It is an perfect square");
            	 }
            	 else {
            		 System.out.println("It is not an perfect square");
            	 }
//Accept time in 24-hour format and print:
            	 int time = 12;
            	 
            	 if(time>=0 && time<=11) {
            		 System.out.println("Good Morning");
            	 }
            	 else if(time>=12 && time<=16 ) {
            		 System.out.println("Good Afternoon");
            	 }
            	 else if(time>=17 && time<=20) {
            		 System.out.println("Good Evening");
            	 }
            	 else if(time>=21 && time<=23) {
            		 System.out.println("Good Night");
            	 }
            	 else {
            		 System.out.println("Another time");
            	 }
            	 
//0–11 → Good Morning
//12–16 → Good Afternoon
//17–20 → Good Evening
//21–23 → Good Night
//Accept two numbers and print which number is nearest to 100.
            	 int a4 =30;
            	 int a5 =40;
            	 
            	 int diff1 = Math.abs(100-a4);
            	 int diff2 = Math.abs(100-a5);
            	 
            	 if(diff1<diff2) {
            		 System.out.println("a4 is nearest to the 100");
            	 }
            	 else {
            		 System.out.println("a5 is nearest to the 100");
            	 }
            	 
            	 
//Accept the cost price and selling price; print Profit, Loss, or No Profit No Loss.
            	 int costPrice = 1000;
            	 int sellingPrice = 500;
            	 if(sellingPrice>costPrice) {
            		 System.out.println("Profit");
            	 }
            	 else if(sellingPrice<costPrice) {
            		 System.out.println("Loss");
            	 }
            	 else {
            		 System.out.println("No Profit No Loss");
            	 }
//Accept age and gender:
//If age > 60 and gender = 'F' → “Senior Woman Citizen”
//If age > 60 and gender = 'M' → “Senior Man Citizen”
//Else → “Not a Senior Citizen”
            	 int age= 67;
            	 char gender ='F';
            	 if(age>60 && gender=='F') {
            		 System.out.println("Senior Woman Citizen");
            	 }
            	 else if(age>60 && gender=='M') {
            		 System.out.println("Senior Man Citizen");
            	 }
            	 else {
            		 System.out.println("Not a senior Citizen");
            	 }
//Accept a month number (1–12) and check if it belongs to summer, rainy, or winter season.
				 
				
			}
}
