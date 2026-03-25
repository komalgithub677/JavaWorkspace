package arrays;

import java.util.Scanner;

public class CountOccurencesOfElements {
	           public void count(int arr[] , int key) {
	        	   int count=0;
	        	   for(int i=0; i<arr.length; i++) {
	        		   if(arr[i]==key) {
	        			   count++;
	        		   }
	        	   }
	        	   System.out.println("Count of Element Occurence : " + count);
	           }
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 CountOccurencesOfElements c = new CountOccurencesOfElements();
            	 int arr[] = new int[5];
            	 
            	 System.out.println("Enter your Array : ");
            	 for(int i=0; i<arr.length; i++) {
            		 arr[i] = sc.nextInt();
            	 }
            	 
            	 System.out.println("Enter your key : ");
            	 int key = sc.nextInt();            	 
            	
            	 c.count(arr, key);
			}
}
