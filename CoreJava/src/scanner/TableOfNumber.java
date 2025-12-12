package scanner;

import java.util.Scanner;

public class TableOfNumber {
             public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter your number");
				
				int num = sc.nextInt();
				for(int i=1; i<=10; i++) {
					System.out.println(i*num);
				}
				
				
				//Eligibility for vote
				System.out.println("Ur are eligible for vote or not");
				boolean isEligible = sc.nextBoolean();
				System.out.println("----------------");
				System.out.println(isEligible);
				
				System.out.println("Enter you full name");
				String name = sc.nextLine();
				System.out.println(name);
				
			}
}
