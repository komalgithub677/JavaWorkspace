package arrays;

import java.util.Scanner;

public class SecondLargestEkementWithoutSort {
//	Find the second largest element without sorting.
	         public void  secondLargest(int arr[]) {
	        	 int max1 = Integer.MIN_VALUE;
	        	 int max2 =Integer.MIN_VALUE;
	        	 
	        	 if(arr.length<2) {
	        		 System.out.println("Array length must be greater than two : ");
	        		 return;
	        	 }
	        	 
	        	for(int i=0; i<arr.length; i++) {
	        		if(arr[i]>max1) {
	        			max2 =max1;
	        			max1 =arr[i];
	        		}
	        	}
	        	
	        	System.out.println("Largest element : " + max1);
	        	System.out.println("Second Largest : " + max2);
	         }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				//object creation
				SecondLargestEkementWithoutSort s = new SecondLargestEkementWithoutSort();
				int arr[] = new int[5];
				
				for(int i=0; i<arr.length; i++) {
					arr[i] =sc.nextInt();
				}
				
				s.secondLargest(arr);
				
			}
}
