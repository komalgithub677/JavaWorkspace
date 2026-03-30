package src.tcs;

import java.util.Scanner;

public class Arrays2ndLevel {
//	1. Move all zeros to end
	public void moveZeroes(int arr[]) {
		int j =0;
		
		int end = arr.length-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void twoSum(int arr[] , int target) {
		
		
		
		for(int i=0 ;i<arr.length; i++) {
		   for(int j=i+1; j<arr.length; j++) {
			   if(target == arr[i] + arr[j]) {
				   System.out.println("Index : " + i + " " + j);
			   }
		   }
		    
		}
	
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Arrays2ndLevel a = new Arrays2ndLevel();
		System.out.println("Enter your array : ");
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		
		//move zeroes to end
		a.moveZeroes(arr);
		
		System.out.println("Enter your target elements :");
		int target = sc.nextInt();
		
		//two sum
		a.twoSum(arr, target);
		
	}
}
