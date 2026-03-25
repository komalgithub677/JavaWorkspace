package arrays;

import java.util.Scanner;

public class SecondLargest {
             public void secondLargest(int arr[]) {
            	         int max1 =arr[0];
            	         int max2 =arr[0];
            	         
            	         for(int i=0; i<arr.length; i++) {
            	        	 if(arr[i]>max1) {
            	        		 max2 = max1;
            	        		 max1 =arr[i];
            	        	 }
            	         }
            	         System.out.println("First max : " + max1);
            	         System.out.println("Second Max : " + max2);
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				SecondLargest s = new SecondLargest();
				int arr[] = new int[5];
				
				System.out.println("Enter your array : ");
				for(int i=0; i<arr.length; i++) {
					arr[i] =sc.nextInt();
				}
				
				System.out.println("First largest and the second largest Element : ");
				s.secondLargest(arr);
			}
}
