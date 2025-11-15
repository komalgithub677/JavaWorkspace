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

		//8.Check if mobile battery is low, medium, or high.

		//9.Check if water purifier needs service based on usage & days.

		//10.Check if student gets attendance bonus (attendance ≥ 75 & marks ≥ 60).
	}
}
