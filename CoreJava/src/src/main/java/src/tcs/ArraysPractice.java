package src.tcs;

import java.util.Scanner;

public class ArraysPractice {
//	Reverse an array
	public void reverse(int arr[]) {
		int rev = 0;
		for(int i=arr.length-1; i>=0; i--) {
		    System.out.println(arr[i]);
		}
	}
//	Find maximum & minimum element
	public void minMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max " + max);
		System.out.println("Min " + min);
	}
//	Sum of all elements
	public void sum(int arr[]) {
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		
		System.out.println("Sum of array elements : " + sum );
	}
//	Count even & odd numbers
	public void evenOdd(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			else {
				System.err.println(arr[i]);
			}
		}
	}
//	Linear search (find element)
	public void linearSearch(int arr[] , int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.println(i);
				break;
			}
			else {
				System.err.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		ArraysPractice a = new ArraysPractice();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//reversing elements
		a.reverse(arr);
		
		//minMax
		a.minMax(arr);
		
		//sum
		a.sum(arr);
		
		//evenOdd
		a.evenOdd(arr);
		
		int key = sc.nextInt();
		
		//linearSearch
		a.linearSearch(arr, key);
		
		
	}
}
