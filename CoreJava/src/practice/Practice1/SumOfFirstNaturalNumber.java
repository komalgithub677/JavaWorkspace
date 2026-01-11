package practice.Practice1;

import java.util.Scanner;

public class SumOfFirstNaturalNumber {
             public void sumOfNaturalNumber(int n) {
            	 int sum =0;
            	 for(int i=1; i<=n; i++) {
            		 sum = sum + i;
            	 }
            	 System.out.println(sum);
             }
             
             public static void main(String[] args) {
				SumOfFirstNaturalNumber s = new SumOfFirstNaturalNumber();
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the number : ");
				int n = sc.nextInt();
				s.sumOfNaturalNumber(n);
			}
}
