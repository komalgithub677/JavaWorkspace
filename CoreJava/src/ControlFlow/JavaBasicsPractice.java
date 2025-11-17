<<<<<<< HEAD
package ControlFlow;

public class JavaBasicsPractice {
       public static void main(String[] args) {
    	  // Take two integers a and b. Print the sum, difference, product, and quotient.
    	   int a =10;
    	   int b=20;
    	   System.out.println("Sum of These two integers is :" + (a + b));
    	   System.out.println("Difference of this two intgers id :" +(a-b));
    	   System.out.println("Product of this two integers is :" +(a*b));
    	   System.out.println("Quotient of this two integers is :" + (a/b));

    	  // Given radius, calculate the area of circle.
    	   int radius = 24;
    	   int area = radius*radius;
    	   System.out.println("Area of circle is :" + (area));

    	   //Given three numbers, find the largest number using comparisons.
    	   int a1 =10;
    	   int b1 =2;
    	   int c1 = 3;
    	   
    	   if(a1>b1 && a1>c1) {
    		   System.out.println("Number is greater than a1 and c1");
    	   }
    	   else if(b1>a1 && b1>c1) {
    		   System.out.println("Number b1 is greater");
    	   }
    	   else {
    		   System.out.println("Number  c1 greater");
    	   }
    		   
    		   
    		// Swap two numbers without using third variable.

    	  // Check if a number is even or odd using % operator.
    	   int num =30;
    	   if(num%2==0) {
    		   System.out.println("Number is even");
    	   }
    	   else {
    		   System.out.println("Number is odd");
    	   }

    	  // Convert temperature from °C to °F.
    	   double Celcius = 30;
    	   double fahrenheit = (Celcius*9/5) + 32;
    	   System.out.println("Celcius to Fahrenheit:" + fahrenheit);
    	   

    	  // Given marks in 5 subjects, calculate total and percentage.
    	   int s1=30,s2=40, s3 =50 , s4=60, s5=70;
    	   int total = s1 + s2 + s3 + s4 + s5;
    	   System.out.println("Subjects total would be the :" + (total));
    	   float percentage = total/100;
    	   System.out.println("Percentage of five subjects would be the :" + (percentage));

    	  // Find the remainder when a number is divided by another number.
    	   int number = 20;
    	   System.out.println("Reminder of number is divided by another number :" + (number%3));

    	  // Compute the power of a number (a^b) using a loop.
    	   
           
    	  //Check if two floating numbers are approximately equal (difference < 0.001).
    	   float a2 = 1.21f;
    	   float a3 = 1.25f;
    	   float difference = Math.abs(a2 -a3);  //New point
    	   
    	   if(difference<0.001) {
    		   System.out.println("This two floating numbers are equal" + (difference));
    	   }
    	   else {
    		   System.out.println("This two floating point numbers are not equal");
    	   }
    	   

    	  //Calculate simple interest SI = (P × R × T) / 100.
    	   int principleAmount = 3000;
    	   int rate = 20;
    	   int time =3;
    	   
    	   int SI = (principleAmount * rate * time)/100;
    	   System.out.println("Simple interest would be : " + (SI));

    	  //Convert a number of days into years, weeks, and days.
    	   int days =600;
    	   
    	   int years = days/365;
    	   int remainingDays = days%365;
    	   
    	   int weeks = remainingDays /7;
    	   int daysLeft = remainingDays %7;
    	   
    	   System.out.println("Years would be the :" +(years));
    	   System.out.println("Weeks would be the : " + (weeks));
    	   System.out.println("daysLeft would be the : " +(daysLeft));
               	   

    	  //Calculate BMI using formula BMI = weight/(height*height).
    	   int height = 30;
    	   int weight = 40;
    	   
    	   int BMI = weight /(height*height);
    	   System.out.println("BMI value would be the : "+ (BMI));

    	  //Given three edges, check if they can form a triangle.
    	   int c4 = 23;
    	   int c2 = 24;
    	   int c3 = 25;
    	   
    	   if(c4+c2>c3 && c2+c3>c4 && c3 + c4 >c2) {
    		   System.out.println("This form a triangle");
    	   }

    	  //Divide two integers and print floor value.
    	   int d1 = 20;
    	   int d2 =30;
    	   
    	   int divide = (int)Math.floor(d1 /d2);
    	   System.out.println("Floor value would be the : "+ (divide));
    	   
    	   
	}
}
=======
package ControlFlow;

public class JavaBasicsPractice {
       public static void main(String[] args) {
    	  // Take two integers a and b. Print the sum, difference, product, and quotient.
    	   int a =10;
    	   int b=20;
    	   System.out.println("Sum of These two integers is :" + (a + b));
    	   System.out.println("Difference of this two intgers id :" +(a-b));
    	   System.out.println("Product of this two integers is :" +(a*b));
    	   System.out.println("Quotient of this two integers is :" + (a/b));

    	  // Given radius, calculate the area of circle.
    	   int radius = 24;
    	   int area = radius*radius;
    	   System.out.println("Area of circle is :" + (area));

    	   //Given three numbers, find the largest number using comparisons.
    	   int a1 =10;
    	   int b1 =2;
    	   int c1 = 3;
    	   
    	   if(a1>b1 && a1>c1) {
    		   System.out.println("Number is greater than a1 and c1");
    	   }
    	   else if(b1>a1 && b1>c1) {
    		   System.out.println("Number b1 is greater");
    	   }
    	   else {
    		   System.out.println("Number  c1 greater");
    	   }
    		   
    		   
    		// Swap two numbers without using third variable.

    	  // Check if a number is even or odd using % operator.
    	   int num =30;
    	   if(num%2==0) {
    		   System.out.println("Number is even");
    	   }
    	   else {
    		   System.out.println("Number is odd");
    	   }

    	  // Convert temperature from °C to °F.
    	   double Celcius = 30;
    	   double fahrenheit = (Celcius*9/5) + 32;
    	   System.out.println("Celcius to Fahrenheit:" + fahrenheit);
    	   

    	  // Given marks in 5 subjects, calculate total and percentage.
    	   int s1=30,s2=40, s3 =50 , s4=60, s5=70;
    	   int total = s1 + s2 + s3 + s4 + s5;
    	   System.out.println("Subjects total would be the :" + (total));
    	   float percentage = total/100;
    	   System.out.println("Percentage of five subjects would be the :" + (percentage));

    	  // Find the remainder when a number is divided by another number.
    	   int number = 20;
    	   System.out.println("Reminder of number is divided by another number :" + (number%3));

    	  // Compute the power of a number (a^b) using a loop.
    	   
           
    	  //Check if two floating numbers are approximately equal (difference < 0.001).
    	   float a2 = 1.21f;
    	   float a3 = 1.25f;
    	   float difference = Math.abs(a2 -a3);  //New point
    	   
    	   if(difference<0.001) {
    		   System.out.println("This two floating numbers are equal" + (difference));
    	   }
    	   else {
    		   System.out.println("This two floating point numbers are not equal");
    	   }
    	   

    	  //Calculate simple interest SI = (P × R × T) / 100.
    	   int principleAmount = 3000;
    	   int rate = 20;
    	   int time =3;
    	   
    	   int SI = (principleAmount * rate * time)/100;
    	   System.out.println("Simple interest would be : " + (SI));

    	  //Convert a number of days into years, weeks, and days.
    	   int days =600;
    	   
    	   int years = days/365;
    	   int remainingDays = days%365;
    	   
    	   int weeks = remainingDays /7;
    	   int daysLeft = remainingDays %7;
    	   
    	   System.out.println("Years would be the :" +(years));
    	   System.out.println("Weeks would be the : " + (weeks));
    	   System.out.println("daysLeft would be the : " +(daysLeft));
               	   

    	  //Calculate BMI using formula BMI = weight/(height*height).
    	   int height = 30;
    	   int weight = 40;
    	   
    	   int BMI = weight /(height*height);
    	   System.out.println("BMI value would be the : "+ (BMI));

    	  //Given three edges, check if they can form a triangle.
    	   int c4 = 23;
    	   int c2 = 24;
    	   int c3 = 25;
    	   
    	   if(c4+c2>c3 && c2+c3>c4 && c3 + c4 >c2) {
    		   System.out.println("This form a triangle");
    	   }

    	  //Divide two integers and print floor value.
    	   int d1 = 20;
    	   int d2 =30;
    	   
    	   int divide = (int)Math.floor(d1 /d2);
    	   System.out.println("Floor value would be the : "+ (divide));
    	   
    	   
	}
}
>>>>>>> 4df4624 (Added new switch case package)
