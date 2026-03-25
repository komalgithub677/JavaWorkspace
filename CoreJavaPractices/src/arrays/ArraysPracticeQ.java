package arrays;

import java.util.Scanner;

public class ArraysPracticeQ {
//	Find the largest element in an array.
	public void largest(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum Element : " + max);
	}
//
//	Find the smallest element in an array.
	
	public void smallest(int arr[]) {
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum element : " + min);
	}
//
//	Count how many even and odd numbers are in the array.
	public void countEvenOdd(int arr[]) {
		int countEven = 0;
		int countOdd = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 ==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		
		System.out.println("Count of even : " + countEven);
		System.out.println("Count of odd : " + countOdd);
	}
//
//	Calculate the sum of all elements in an array.
	
	public void sum(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		
		System.out.println("Sum of elements : " + sum);
	}
//
//	Print the array in reverse order.
	public void reverse(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		for(int i=0; i<arr.length; i++) {
			while(start<=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start ++;
				end --;
			}
		}
	}
//
//	Check whether a given element exists in the array (linear search).
	public void linearSearch(int arr[] , int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Element found at index : "+ i);
			}
		}
	}
//
//	Count the frequency of each element.
	public void frequencyCount(int arr[] ,int target) {
		   int count =0;
		   
		   for(int i=0; i<arr.length; i++) {
			   if(arr[i]==target) {
				   count++;
			   }
		   }
		   
		   System.out.println("Count of element : " + count);
	}
//
//	Copy elements from one array to another.
	
	public void copy(int arr[]) {
		
		int arr1[] = new int [arr.length];
		
		System.out.println("Original array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("Copied array Elements : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println( arr1[i]);
		}
		
	}
//
//	Find the second largest element in the array.
	
	public void secondLargestElement(int arr[]) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i]>max2 && arr[i] !=0) {
				max2 =arr[i];
			}
		}
		
		System.out.println("First max : " + max1);
		System.out.println("Second max : " + max2);
	}
//
//	Replace all negative numbers with 0.
	public void replaceNegativeWithZero(int arr[]) {
		        
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArraysPracticeQ  a = new ArraysPracticeQ ();
		int arr[] = new int [5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		a.largest(arr);
		
		a.smallest(arr);
		
		a.countEvenOdd(arr);
		
		a.sum(arr);
		
		a.reverse(arr);
		
		for(int i : arr) {
			System.out.println(i + " ");
		}
		
		
		a.linearSearch(arr, 12);
		
		a.frequencyCount(arr, 2);
		
		a.copy(arr);
		
		a.secondLargestElement(arr);
	}
}
