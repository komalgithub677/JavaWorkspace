package scanner;

import java.util.Scanner;

public class PositiveNegativeZero {
             public void positiveNegativeZero(int num) {
            	    if(num==0) {
            	    	System.out.println("Number is zero");
            	    }
            	    else if(num>0) {
            	    	System.out.println("Number is positive");
            	    }
            	    else {
            	    	System.out.println("Number is negative");
            	    }
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the num");
				int num = sc.nextInt();
				
				PositiveNegativeZero p = new PositiveNegativeZero();
				p.positiveNegativeZero(num);
				
			}
}
