package src.Infosys;

import java.util.Scanner;

public class Day1 {
             public void printSubarray(int numbers[]) {
            	 for(int i=0; i<numbers.length; i++ ) {
            		 int start = i;
            		 for(int j=i; j<numbers.length; j++) {
            			 int end = j;
            			 for(int k=start; k<=end; k++) {
            				 System.out.print(numbers[k] + " ");
            			 }
            			 System.out.println();
            		 }
            		 System.out.println();
            		 }
            	 }
             
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 Day1 d = new Day1();
            	 System.out.println("Enter the size of the array");
            	 int n = sc.nextInt();
            	 
            	 int numbers[] = new int[5];
            	 System.out.println("Enter your array : ");
            	
            	 for(int i=0; i<n; i++) {
            		 numbers[i] = sc.nextInt();
            	 }
            	 d.printSubarray(numbers);
			}
}
