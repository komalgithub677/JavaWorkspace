package scanner;

import java.util.Scanner;

public class LargestOfThree {
             public void LargerNumber(int a ,int b ,int c) {
            	 if(a>b && a>c) {
            		 System.out.println("A is largest : " + a);
            	 }
            	 else if(b>a && b>c) {
            		 System.out.println("b is Largest : " +  b);
            	 }
            	 else {
            		 System.out.println("c is largest : " + c);
            	 }
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the first number");
				int a = sc.nextInt();
				
				System.out.println("Enter the Second number");
				int b = sc.nextInt();
				
				System.out.println("Enter the Third number");
				int c = sc.nextInt();
				
				LargestOfThree l = new LargestOfThree();
		        l.LargerNumber(a, b, c);
				
			}
}
