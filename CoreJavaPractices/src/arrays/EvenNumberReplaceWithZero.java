package arrays;

import java.util.Scanner;

public class EvenNumberReplaceWithZero {
              public void replace(int arr[]) {
            	  int arr1[] = new int[arr.length];
            	  
            	  for(int i=0; i<arr.length; i++) {
            		  arr1[i] = arr[i];
            		  if(arr[i]%2==0) {
            			  arr1[i] =0;
            		  }
            		  else {
            			  arr1[i] =arr[i];
            		  }
            	  }
            	  for(int i=0; i<arr1.length; i++) {
            		  System.out.println(arr1[i]);
            	  }
              }
              
              public static void main(String[] args) {
            	EvenNumberReplaceWithZero e = new EvenNumberReplaceWithZero();
				Scanner sc = new Scanner(System.in);
				
				int arr[] = new int[5];
				
				System.out.println("Enter your original array : ");
				for(int i=0; i<arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				
				System.out.println("Replace with the zero : ");
				e.replace(arr);
			}
}
