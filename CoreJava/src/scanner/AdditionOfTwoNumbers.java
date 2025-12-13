package scanner;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
	//Take two numbers from user and print their addition.
		public void Addition(int a , int b) {
			int Addition = a + b;
			System.out.println("Addition of Two Number is : " + Addition);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the First Number :");
			int a = sc.nextInt();
			
			System.out.println("Enter the Second Number :");
			int b = sc.nextInt();
			
			AdditionOfTwoNumbers  a2 = new AdditionOfTwoNumbers();
			a2.Addition(a, b);
		}
}
