package scanner;

import java.util.Scanner;

public class TotalPercentage {
             public void percentageTotal(double sub1 , double sub2 ,double sub3 , double sub4 , double sub5) {
            	// Take marks of 5 subjects and print total & percentage. 
            	 double total = sub1 + sub2 + sub3 + sub4 + sub5;
            	 System.out.println("Total Subjects are : " + total);
            	 
            	 double percentage = (total/500.00)*100;
            	 System.out.println("Percentage of your all Subjects : " + percentage);
            	 
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter first Subhject marks : ");
				double sub1 = sc.nextDouble();
				
				System.out.println("Enter the Second subject marks");
				double sub2 = sc.nextDouble();
				
				System.out.println("Enter the Third subject marks : ");
				double sub3 = sc.nextDouble();
				
			    System.out.println("Enter the Fourth subject marks : ");
			    double sub4 = sc.nextDouble();
			    
				System.out.println("Enter Fifth subject marks : " );
				double sub5 = sc.nextDouble();
				
				TotalPercentage tp = new TotalPercentage();
				tp.percentageTotal(sub1, sub2, sub3, sub4, sub5);
				
				
				
				
				
				
			}
             
}
