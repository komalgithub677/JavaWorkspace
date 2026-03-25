package arrays;

import java.util.Scanner;

public class AverageOfArrayElements {
             public void average(int arr[]) {
            	 int sum =0;
            	
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 sum +=arr[i];
            		 
            	 }
            	 double average = (double)  sum/arr.length;
            	 System.out.println("Average of array Elements : " + average);
            	 
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				AverageOfArrayElements a = new AverageOfArrayElements();
				
				int arr[] = new int[5];
				
				System.out.println("Enter your array : ");
				for(int i=0; i<arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				a.average(arr);
			}
}
