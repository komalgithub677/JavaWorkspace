
package ControlFlow;

public class CheckingInternetSpeedCategory {
       public static void main(String[] args) {
		int speed = 10;
		if(speed>=0) {
			if(speed<=5) {
				System.out.println("Very slow internet speed");
			}
			else if(speed<=25) {
				System.out.println("Average internet speed basic browsing");
			}
			else if( speed<=50) {
				System.out.println("Good internet speed");
			}
			else if(speed<=100) {
				System.out.println("Fast internet speed");
			}
			else if( speed<=500) {
				System.out.println("Very-fast internet speed");
			}
			else if( speed<=1000) {
				System.out.println("Ultra fast Internet");
			}
			else {
				System.out.println("Extreme speed");
			}
		}
		else {
			System.out.println("Invalid speed");
		}
	}
}