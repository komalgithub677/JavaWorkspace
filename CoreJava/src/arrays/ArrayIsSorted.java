package arrays;

import java.util.Scanner;

public class ArrayIsSorted {
             public void sorted(int arr[]) {
            	 
            	 boolean isSorted = true;
            	 
            	 for(int i=0; i<arr.length-1; i++) {
            		 if(arr[i]>arr[i+1]) {
            			isSorted = false;
            			break;
            		 }
            
            	 }
            	 if(isSorted) {
            		 System.out.println("Array is sorted");
            	 }
            	 else {
            		 System.out.println("Array is not sorted");
            	 }
            	
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				ArrayIsSorted  a = new ArrayIsSorted ();
				
				int arr[] = new int[5];
				
				System.out.println("Enter your array : ");
				for(int i=0; i<arr.length-1; i++) {
					arr[i] =sc.nextInt();
				}
				
				System.out.println("Sorted array : ");
				a.sorted(arr);
				
			}
}
