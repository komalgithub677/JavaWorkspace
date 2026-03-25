
public class SundayRevision {
       public static void main(String[] args) {
		int a = 10 , b =20 , c=4;
		System.out.println("Addition of two number is : " + (a + b));
		System.out.println("Remainder of two number is :" +(a%b));
		System.out.println("Average of three numbers is : " + (a + b + c));
		
		//Write a program to find the area of a circle using the formula πr².
		int radius = 10;
		int area = (int)3.14 * (radius*radius);
		System.out.println(area);
		

		//Write a program to convert temperature from Celsius to Fahrenheit.
		//°F=(°C×59​)+32
		int celcius = 20;
		int CelciustoFahrenheit = (celcius * 59) + 32;
		System.out.println(CelciustoFahrenheit);
		

		//Write a program to calculate simple interest.
		int principleAmount = 1000;
		int rate = 20;
		int time = 3;
		int SimpleInterest = (principleAmount * rate * time)/100;
		System.out.println("Simple interest is : " + (SimpleInterest));

		//Write a program to compute the perimeter of a rectangle.
		int length = 10;
		int width =20;
		int perimeter = 2*(length +width);
		System.out.println("Perimeter of Rectangle is :" + (perimeter));

		//Write a program to swap two numbers using a temporary variable.
		int x =2;
		int y =4;
		
		System.out.println("Printing elements before swapping:"+ x + " " + y);
		int temp = x;
		  x =y;
		  y=temp;
		
		System.out.println("Printing elemnts after swapping :" + x + " " + y);

		//Write a program to calculate the power of a number (use Math.pow() or loops).
		int base =2;
		int exponent = 3;
		double result = Math.pow(base , exponent);
		
		System.out.println(base + "  raised to the power of " + exponent);
		
		//Relational operators 10 questions 
		//1.Write a Java program to check if a number is greater than 100.
		int num =10;
		System.out.println("Checking Number is greaer than 100 or not :" + (num >100));

		//2.Check if two numbers are equal or not.
		int a1 = 10 , b1 =20;
		System.out.println("Checking if two numbers are equal or not :" + (a1 == b1));

		//3.Check if a person is eligible to vote (age ≥ 18).
		int age = 21;
		System.out.println("Checking eligibility of person for checking that is eligible for voting or not :" + (age >=18));

		//4.Compare three numbers and find the largest one.
		int a2 =13 , b2 =34 ,c2 =25;
	    System.out.println("Printing largest of three numbers : " + ((a2>b2 && a2 >c2 )  && (b2>c2 && b2 >a2) && (c2>b2 && c2>a2)));
	    

		//5.Write a program to check if a number is positive, negative, or zero.
	    int num3 =10;
	    System.out.println("Number is positive :" + (num3>0));
	    System.out.println("Number is negative : " + (num3<0));
	    System.out.println("Number is 0 : " + (num3 == 0));

		//6.Check if a number is within the range 10 to 50.
	    int num4 =30;
	    System.out.println("Number is within range 10 or 50 :" + (num4 >=10 && num4<=50) );

		//7.Write a program to compare two floating-point numbers up to 2 decimal places.
	    float a3 = 3.57f , b3 = 4.57f;
	    System.out.println("Comparison of two floating point numbers : " + (a3 > b3 && a3 == b3));

		//8.Check if a number is divisible by both 3 and 5.
	    int num5 = 40;
	    System.out.println("Number is divisible by 3 and 5 :" + (num5%3==0 && num5%5==0));

		//9.Check if a given year is a leap year.
        int year = 2020;
        System.out.println("Checking if year is a leap year or not : " +(year%4 ==0 && (year%400==0 && year%100 !=0)) );
        
	    
	}
}
