package arrays;

import java.util.Scanner;

public class CopyElementsInReverse {
             public void reverse(int arr[]) {
            	    int arr1[] = new int[arr.length];
            	    
            	    for(int i=0; i<arr.length; i++) {
            	    	arr1[i] =arr[i];
            	    }
            	    
            	    for(int i=arr1.length-1; i>=0; i--) {
            	    	System.out.println(arr1[i]);
            	    }
             }
             
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 CopyElementsInReverse c  = new CopyElementsInReverse();
            	 int arr[] = new int[5];
            	 
            	 System.out.println("Original Array : ");
            	 for(int i=0; i<arr.length; i++) {
            		 arr[i] = sc.nextInt();
            	 }
            	 
            	 System.out.println("Copied Reverse array : ");
            	 c.reverse(arr);
			}
}
