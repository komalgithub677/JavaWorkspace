package arrays;

import java.util.Scanner;

public class DuplicateArray {
             public void duplicate(int arr[]) {
            	 int duplicate[] = new int[arr.length];
            	 
            	 System.out.println("Duplicate Array : ");
            	 for(int i=0; i<arr.length; i++) {
            		 duplicate[i] =arr[i];
            	 }
            	 
            	
             }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				DuplicateArray d = new DuplicateArray();
				int arr[] = new int[5];
				
				System.out.println("Enter your array : ");
				for(int i=0; i<arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				d.duplicate(arr);
			}
}
