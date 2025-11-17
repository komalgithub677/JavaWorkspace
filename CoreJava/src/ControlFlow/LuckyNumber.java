<<<<<<< HEAD
package ControlFlow;

public class LuckyNumber {
       public static void main(String[] args) {
		int n =4444;
		
		int d1 = n/1000;
		int d2 =(n/100)%10;
		int d3 = (n/10)%10;
		int d4 = n%10;
		
		int sumOfFirstTwo =d1 + d2;
		int sumOfLastTwo = d3 + d4;
		
		if(sumOfFirstTwo == sumOfLastTwo) {
			System.out.println("Number is a lucky number");
		}
		else {
			System.out.println("Number is not a lucky number");
		}
	}
}
=======
package ControlFlow;

public class LuckyNumber {
       public static void main(String[] args) {
		int n =4444;
		
		int d1 = n/1000;
		int d2 =(n/100)%10;
		int d3 = (n/10)%10;
		int d4 = n%10;
		
		int sumOfFirstTwo =d1 + d2;
		int sumOfLastTwo = d3 + d4;
		
		if(sumOfFirstTwo == sumOfLastTwo) {
			System.out.println("Number is a lucky number");
		}
		else {
			System.out.println("Number is not a lucky number");
		}
	}
}
>>>>>>> 4df4624 (Added new switch case package)
