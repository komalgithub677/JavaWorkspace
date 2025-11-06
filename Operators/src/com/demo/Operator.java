package com.demo;

public class Operator {
      public static void main(String[] args) {
		int result = 5 + 2 * 3;
		System.out.println(result);
		
		int a =10;
		int b =3;
		System.out.println("Division is : " + a/b);
		System.out.println("Remainder is : " + a%b);
		
		double x = 10.0;
		double y = 3.0;
		System.out.println("Division is : " + x/y);
		System.out.println("Remainder is : " + x%y);
		
		int c = 10;
		c += c++ + ++c;
		System.out.println(c);
		
		int  p=2,  q=4, r=6;
		int P = p + q * r;
		System.out.println("Value of p is : " + P);
		
		int d =8;
		int e = 3;
		System.out.println((d+e)* (d-e)/e);
		
		int v =7;
		System.out.println(v *(v+3)/2);
		
		//Perimeter and the area of the rectangle
		int length =12;
		int width = 10;
		int area = length * width;
		int perimeter = 2*(length + width);
		System.out.println("Area of Rectangle is : " + area);
		System.out.println("Perimeter of the rectangle is the :" + perimeter);
		
		//Sum , difference ,product ,division and remainder
		int f = 10;
		int g = 11;
		int sum = f + g;
		int difference = f -g;
		int division = f /g ;
		int remainder = f % g;
		int product = f * g;
		System.out.println("sum : " +" "+ sum  +" ,"+ "difference : " +" ,"+ difference+", " +"Product : " + " ,"+product +" ," + "division : " + division +" ," + "Remainder :" + remainder);
		
		//Swapping two numbers without using the third variable
		int h = 5;
		int i = 10;
		int k = h + i;
		int l = h - i;
	    k = h -i;
	    System.out.println(h + " " + i);
		int j = h + i * h / i - h;
		System.out.println("Value of j is : " + j);
		
		int finalResult = 10 / 2 * 3;
		System.out.println("Value of final Result would be : " + finalResult);
		
		double u = 5 / 2.0;
		System.out.println("Value of a is :" + u);	
	}
}
