

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
	
	public void secondLargest(int arr[]) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i]>max2 && max2<max1) {
				max2 = arr[i];
			}
		}
		
		System.out.println("First max : " + max1);
		System.out.println("Second max : " + max2);
	}
	
	public void sorted(int arr[]) {
		boolean isSorted = true;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				isSorted =true;
				break;
			}
		}
		
		if(isSorted) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}
	
	public void misingNumber(int arr[]) {
		int n =arr.length;
		
		int total = n*(n+1)/2;
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		
		System.out.println("Missing number : " + (total-sum));
		
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
		
		//secondmax
		a.secondLargest(arr);
		
		//sorted array
		a.sorted(arr);
		
		//missing number
		a.misingNumber(arr);
	}
}
