package arrays;

import java.util.Scanner;

public class SecondLargestElement {
             public void secondLargest(int arr[]) {
            	 int max1 = Integer.MIN_VALUE;
            	 int max2 = Integer.MIN_VALUE;
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 if(arr[i]>max1) {
            			 max2 = max1;
            			 max1 =arr[i];
            		 }
            		 else if((arr[i]>max2) &&  (max2<max1)) {
            			 max2 =arr[i];
            		 }
            	 }
            	 
            	 System.out.println("First maximum : " + max1);
            	 System.out.println("Second maximum : " + max2);
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 SecondLargestElement  s = new SecondLargestElement ();
            	 
            	 System.out.println("Enter your array");
            	 int []arr = new int[5];
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 arr[i] =sc.nextInt();
            	 }
            	 
            	 s.secondLargest(arr);
			}
}
