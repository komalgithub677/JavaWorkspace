package scanner;

import java.util.Scanner;

public class SimpleInterest {
	//Take principal, rate, time and calculate Simple Interest (SI = PRT/100)
             public void simpleInterest(int principal , int rate , int time ) {
            	         int si = (principal * rate * time) /100;
            	         System.out.println("Simple Interest Would be :" + si);
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the principal amount : ");
				int principal = sc.nextInt();
				
				System.out.println("Enter the rate : ");
				int rate = sc.nextInt();
				
				System.out.println("Enter the time in year :");
				int time = sc.nextInt();
				
				SimpleInterest si = new SimpleInterest();
				si.simpleInterest(principal, rate, time);
			}
}
