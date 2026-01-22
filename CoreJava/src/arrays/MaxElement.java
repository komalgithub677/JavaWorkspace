package arrays;

import java.util.Scanner;

public class MaxElement {
             public void maxElement(int arr[]) {
            	 int max = Integer.MIN_VALUE;
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 if(arr[i]>max) {
            			 max = arr[i];
            		 }
            	 }
            	 
            	 System.out.println("Max Element : " + max);
             }
             
             public static void main(String[] args) {
				MaxElement m = new MaxElement();
				Scanner sc = new Scanner(System.in);
				int arr[] = new int[5];
				
				for(int i=0; i<arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				m.maxElement(arr);
			}
}
