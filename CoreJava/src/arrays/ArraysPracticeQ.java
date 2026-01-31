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
	
//
//	Copy elements from one array to another.
//
//	Find the second largest element in the array.
//
//	Replace all negative numbers with 0.
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
	}
}
