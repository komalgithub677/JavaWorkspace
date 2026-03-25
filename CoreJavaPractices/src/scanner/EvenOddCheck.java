package scanner;

import java.util.Scanner;

public class EvenOddCheck {
             public void evenOdd(int a) {
            	 if(a%2==0) {
            		 System.out.println("Number is even");
            	 }
            	 else {
            		 System.out.println("Number is odd");
            	 }
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the number : ");
				int a = sc.nextInt();
				
				EvenOddCheck e = new EvenOddCheck();
				e.evenOdd(a);
			}
}
