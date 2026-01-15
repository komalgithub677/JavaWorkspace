package arrays;

import java.util.Scanner;

public class DuplicateElements {
	
	          public void duplicate(int arr[]) {
	        	     int count =0;
	        	     for(int i=0; i<arr.length-1; i++) {
	        	    	for(int j=i+1; j<arr.length-1; j++) {
	        	    		if(arr[i] ==arr[i+1]) {
		        	    		count++;
		        	    		System.out.println("Duplicate Element : " + arr[i]);
		        	    		break;
		        	    	}
	        	    	}
	        	     }
	        	     System.out.println("Count of Duplicate array element : " + count );
	          }
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				DuplicateElements d = new DuplicateElements();
			    int arr[] = new int[5];
			    
			    System.out.println("Enter your array Elements : ");
			    for(int i=0; i<arr.length; i++) {
			    	arr[i] = sc.nextInt();
			    }
			    
			    d.duplicate(arr);
            	 
			}
}
