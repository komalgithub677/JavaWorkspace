package practice;

import java.util.Scanner;

public class A {
          public void add(int a , int b) {
        	  int sum = a +b;
        	  System.out.println("sum : " + sum);
          }
          
          public void add(int a ,int b , int c) {
        	  int sum = a + b + c;
        	  System.out.println("sum : " + sum);
          }
          
          public static void main(String[] args) {
			A a1 = new A();
			Scanner sc =new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
		    a1.add(a, b);
		    a1.add(a, b, c);
		}
}
