package arrays;

import java.util.Scanner;

public class SwapFirstAndLast {
//	Write a program to swap first and last element of an array.
             public void swapFirstAndLast(int arr[]) {
            	         int start = 0;
            	         int last = arr.length-1;
            	         
            	         for(int i=0; i<arr.length; i++) {
            	        	 int temp = arr[start];
            	        	 arr[start] =arr[last];
            	        	 arr[last] = temp;
            	        	 System.out.println(arr[i]);
            	         }     
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
				SwapFirstAndLast s = new SwapFirstAndLast();
				
				int arr[] = new int[5];
				System.out.println("Enter your array Elements : ");
				
				for(int i=0; i<arr.length; i++) {
					arr[i] =sc.nextInt();
				}
				
				System.out.println("Array after swapping First and the last Element : ");
				
				s.swapFirstAndLast(arr);
				
				
			}
}
