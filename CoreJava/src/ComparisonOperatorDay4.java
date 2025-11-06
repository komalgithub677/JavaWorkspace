
public class ComparisonOperatorDay4 {
         public static void main(String[] args) {

     		int a =10, b =20 , c=10;
     		
     		System.out.println("a is equals to b :  "+(a == b)); //false
     		System.out.println("a is not equals to b :"+ (a!=b)); //true
     		System.out.println("a is greater than b :"+ (a > b)); //false
     		System.out.println("a is less than b :"+ (a <b));     //true
     		System.out.println("a is greater than or equal to c :"+(a >= c)); //true
     		System.out.println("b is less than or equal to c : " +(b <= c));  //false
     		System.out.println("b is greater than or equals to c :" +(b>=c)); //true
     		System.out.println("b is geater than c :" + (b>c)); //true
     	    
     		//output based questions
     		int x = 7 , y= 10 , z =7;
     		
     		
     		System.out.println(x == y);
     		System.out.println(x == z);
     		System.out.println(x<y);
     		
     		System.out.println(10 == 10.0);
     		System.out.println(10 == 10.1);
     		
     		//Java programme to check the number is greater than 100
     		int num =10;
     		System.out.println("Number is greater than 100 :" + (num>100));
     		
     		//Comparison operator to check if two numbers are equal or not
     		int num1 =10;
     		int num2 =20;
     		System.out.println("num1 is equals to num2 :" + (num1 == num2));
     		
     		//Comparison of char values
     		char ch1 = 'a' ;
     		char ch2 = 'b';
     		System.out.println("character ch1 is equals to ch2 :"+ (ch1 == ch2));
     		
     		//java programme for checking number is positive , negative or zero
     		int num3 = 3;
     		System.out.println("number is greater than zero then positive : " +(num3>0));
     		System.out.println("number is less than zero then number is negative:"+(num3<0));
     		System.out.println("numbe is zero : " + (num3 == 0));
     		
     		//java programme to compare two integers 
     		int num4 = 4;
     		int num5 = 6;
     		System.out.println("is num4 is equals to num5 : "+(num4 == num5));
     		
     		//write a java programme for is number enterd between 1 and 10 
     		int p = 8;
     		System.out.println("Is p between 1 and 10 : " + (p>1 && p<10));
     		
     		//programmes to check is age is greater than 18 for voting
     		int age = 12;
     		System.out.println("check age is greater than 18 :" + (age>=18));
     		
     		//Largest of two numbers
     		int a1 = 10;
     		int a2 = 20;
     		System.out.println("Largest of two numbers : " + (a1>a2 || a2>a1));
             System.out.println("Number is divisible by 3 :" + (a1%3 == 0));
             System.out.println("Number is divisible by 5 :" + (a1%5 == 0));
             
             //guess the output
             char ch3 ='A' , ch4 = 'B';
             System.out.println(ch3 == 65);
		}
}
