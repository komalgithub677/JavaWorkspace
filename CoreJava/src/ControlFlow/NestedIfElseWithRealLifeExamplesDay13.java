package ControlFlow;

public class NestedIfElseWithRealLifeExamplesDay13 {
              
	public static void main(String[] args) {
		//✅ NESTED IF QUESTIONS WITH REAL-LIFE LOGIC

		//1.Check if a student qualifies for admission based on percentage & entrance exam.
		boolean entrancePassed = true;
		float percentage = 90f;
		
		if( percentage>=60) {
		         if(entrancePassed == true) {
		        	   System.out.println("Student qualifies for the admission");	
		         }
		         else {
		        	 System.out.println("Student does not qualifies the entrance exam");
		         }
		}
		else {
			System.out.println("Student does not qualified the percentage criteria");
		}

		//2.Check if loan can be approved based on income and credit score.
		int creditScore = 650;
		int monthlyincome = 40000;
		//1.Personal loan
		if(monthlyincome>30000) {
			if(creditScore>=650 && creditScore<=1000) {
				System.out.println("Best approval chances");
			}
			else if(creditScore>=600 && creditScore<650 ) {
				System.out.println("Very low chances");
			}
			else if(creditScore<600) {
				System.out.println("Most bank rejects");
			}
			else {
				System.out.println("Loan does not get passed");
			}
		}
		else {
			System.out.println("Monthly income is not satisfied for the loan");
		}

		//3.Check if a car can enter based on number plate ending digit (odd-even rule).
		int numberPlate = 1235;
		int date = 17;
		
		int lastDigit = numberPlate % 10;
		
		if(lastDigit%2==0) {
			if(date%2==0) {
				System.out.println("Car can enter(Even number , Even date)");
			}
			else {
				System.out.println("Car cannot enter (Even number , Even date");
			}
		}
		else {
			if(date%2!=0) {
				System.out.println("Car can enter(Odd number , Odd date");
			}
			else {
				System.out.println("Car cannot enter (Odd number , even date)");
			}
		}

		//4.Check if a user can access premium features.
		boolean isActive = true;
		boolean paymentSuccess = true;
		boolean ageAbove18 =true;
		boolean hasSubscription = true;
		
		if(hasSubscription) {
			if(isActive) {
				if(paymentSuccess) {
					if(ageAbove18) {
						System.out.println("User can access premium feature");
					}
					else {
						System.out.println("User cannot access premium features below 18");
					}
				}
				else {
					System.out.println("Access denied : Payment not done");
				}
			}
			else {
				System.out.println("Users account is not active");
			}
		}
		else {
			System.out.println("Users does not have a subscription");
		}

		//5.Check if delivery is free based on cart amount and user membership.
		boolean membership = true;
		int cartAmount = 300;
		if(membership) {//condition 1
			if(cartAmount<1000) {
				System.out.println("User get free delivery");
			}
			else {
				System.out.println("User does not get free deliery");
			}
		}
		else {
			System.out.println("Users does not have a membership");
		}

		//6.Check if ATM withdrawal is valid (balance and withdrawal limit).
		int withdrawal = 30000;
		int limit = 50000;
		
		if(withdrawal <=50000 &&  limit == 50000) {
			System.out.println("ATM withdrawal is valid");
		}
		else {
			System.out.println("ATM withdrawal is not valid");
		}

		//7.Check if discount applies based on quantity & coupon.
		int quantity = 30;
		boolean couponAvailable = true;
		
		if(couponAvailable) {
			if(quantity >100) {
			   System.out.println("User get discount");
			}
			else {
				System.out.println("User does not get discount"); 
			}
		}
		else {
			System.out.println("Not get discount and coupon is not available");
		}

		//8.Check if mobile battery is low, medium, or high.
		int battery = 40;
		
		if(battery>90) {
			System.out.println("Battery availability is high");
		}
		else if(battery>=20 && battery<=89) {
			System.out.println("Battery available at medium range");
		}
		else {
			System.out.println("Battery is low");
		}

		//9.Check if water purifier needs service based on usage & days.
		int usageHours = 9;
		int  days = 30;
		
		if(usageHours>10) {
			if(days>100) {
				System.out.println("Purifies Needs service");
			}
			else {
				System.out.println("Purifier does not needs a service");
			}
		}
		else {
			System.out.println("Purifier does not need of service and usage is low");
		}

		//10.Check if student gets attendance bonus (attendance ≥ 75 & marks ≥ 60).
		int mark = 65;
		int attendance = 75;
		if(attendance>=75 && mark>=60) {
			System.out.println("Student get attendance bonus");
		}
		else {
			System.out.println("Student does not get attendance bonus");
		}
	}
}
