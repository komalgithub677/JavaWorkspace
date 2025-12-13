package scanner;

import java.util.Scanner;

public class Temperature {
             public void temperature(double celcius) {
            	         double fahrenheit = celcius *(9/5) + 32;
            	         System.out.println("Temperature in fahrenheit is :" + fahrenheit);
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the temperature in Celcius : ");
				
				double fahreinheit = sc.nextDouble();
				System.out.println("Fahrenheit Temperature : " + fahreinheit);
	
			}
             
}
