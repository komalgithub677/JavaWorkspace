package arrays;

import java.util.Scanner;

public class CopyArrayElements {
             public void copy(int arr[]) {
            	 
            	 int arr1[] = new int[arr.length];
            	 for(int i=0; i<arr.length; i++) {
            		 arr1[i] = arr[i];
            	 }
            	 for(int i=0; i<arr1.length; i++) {
            		 System.out.println(arr1[i]);
            	 }
                             	 
            	 
             }
             
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				CopyArrayElements c = new CopyArrayElements();
				
				int arr[] = new int[5];
				System.out.println("Enter the original Array : ");
				for(int i=0; i<arr.length; i++) {
				     arr[i] = sc.nextInt();
				}
				
				System.out.println("Copied array : ");
				c.copy(arr);
			}
}
