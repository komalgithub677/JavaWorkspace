package oops;

import java.util.Scanner;

import accessspecifier.Parent;

public class PreminumSavingsAccount extends SavingsAccount{
	
	String additionalBenefits;
	int higherLimits;
	
	
	
	
	public PreminumSavingsAccount(int accountNumber, int balance, double interestRate, String additionalBenefits,
			int higherLimits) {
		super(accountNumber, balance, interestRate);
		this.additionalBenefits = additionalBenefits;
		this.higherLimits = higherLimits;
	}




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you account number :");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter the amount you want to withdraw");
		int amount = sc.nextInt();
		
		
		
		PreminumSavingsAccount p = new PreminumSavingsAccount(accountNumber , amount ,);
		
	}

	
	

	
             
}
