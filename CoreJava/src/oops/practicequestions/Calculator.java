package oops.practicequestions;

import java.util.Scanner;

public class Calculator {
	        
	
             public void add(int a , int b) {
            	 int sum = a + b;
            	 System.out.println("Addition of Two :" + sum);
             }
             
             public void add(int a ,int b , int c) {
            	 int sum = a + b + c;
            	 System.out.println("Addition of three : " + sum);
             }
             
             public void add(double d , double e) {
            	 double sum = d + e;
            	 System.out.println("Addition of two double values : " + sum);
             }
             
             

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the a : ");
				int a = sc.nextInt();
				
				
				System.out.println("Enter the b : ");
				int b = sc.nextInt();
				
				System.out.println("Enter the c :");
				int c = sc.nextInt();
				
				System.out.println("Enter the d : ");
				double d = sc.nextDouble();
				
				System.out.println("Enter the e : ");
				double e = sc.nextDouble();
				
				Calculator calculator = new Calculator();
				calculator.add(d, e);
				calculator.add(a, b);
				calculator.add(a, b, c);
					
			}
}
