package arrays;

import java.util.Scanner;

public class ArrayIsSorted {
//	Calculate electricity bill based on units
	public void electricityBill(int bill , int units) {
		if(units<=100) {
			bill = units * 1;
		}
		else if(units <=200) {
			bill= (100*1) + (units-100) *2;
		}
		else if(units<=300) {
			bill= (100*2) + (units-100)*2 + (units-200)*3;
		}
		else {
			 bill = (100 * 1) + (100 * 2) + (100 * 3) + (units - 300) * 5;
		}
		System.out.println("Electricity bill" + bill);
	}
	
//	Find grade from marks
//	Check leap year
//	Ticket pricing based on age
//	Salary bonus calculation
//	Bank interest calculation
//	Even/Odd number
//	Largest of 3 numbers
//	Temperature category (Hot/Cold)
//	Voting eligibility
//	Profit or loss
//	Insurance premium
//	Mobile recharge plan selection
//	Cab fare calculation
//	Movie ticket discount
//	Parking fine (variation)
//	Gym membership (variation)
//	Student pass/fail
//	Discount slab (advanced)
//	Tax calculation
//	Speed fine system
//	Exam eligibility (attendance %)
//	Loan eligibility
//	Age category (child/adult/senior)
//	Time-based greeting
	
	pulic static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayIsSorted a = new ArrayIsSorted();
		int bill = sc.nextInt();
		a.
		
		int units = sc.nextInt();
		
		
	}
}
