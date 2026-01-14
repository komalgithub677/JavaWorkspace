package arrays;

import java.util.Scanner;

public class CheckMinOrMax {
	         public void minMax(int arr1[]) {
	        	 int max = arr1[0] ,min = arr1[0];
	        	 
	        	 for(int i=0; i<arr1.length; i++) {
	        		 if(arr1[i]>max) {
	        			 max =arr1[i];
	        		 }
	        		 if(arr1[i]<min) {
	        			 min =arr1[i];
	        		 }
	        	 }
	        	 System.out.println("Max : " + max + " " + "Min : " + min); 
	         }
             public static void main(String[] args) {
            	 CheckMinOrMax c = new CheckMinOrMax();
            	 Scanner sc = new Scanner(System.in);
            	System.out.println("Enter the array : ");
				int arr1[]= new int[5];
				
				for(int i=0; i<arr1.length; i++) {
					arr1[i] =sc.nextInt();
				}
				
				for(int i=0; i<arr1.length; i++) {
					System.out.println(arr1[i]);
				}
				
				c.minMax(arr1);
				
			}
}
