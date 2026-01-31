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
//
//	Count how many even and odd numbers are in the array.
//
//	Calculate the sum of all elements in an array.
//
//	Print the array in reverse order.
//
//	Check whether a given element exists in the array (linear search).
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
	}
}
