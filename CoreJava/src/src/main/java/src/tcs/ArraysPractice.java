

import java.util.Scanner;

public class ArraysPractice {
//	Reverse an array
    
    
	public void reverse(int arr[]) {
		int start =0;
		int end = arr.length-1;
		
		System.out.println("Reverse array : ");
		while(start<=end) {
			int temp =arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int num : arr) {
			System.out.println(num);
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
			if(arr[i]<min) {
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
		int even =0 , odd =0;
		
		System.out.println("Even odd elements : ");
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("Even : " + even);
		System.out.println("Odd : " + odd);
	}
//	Linear search (find element)
	public void linearSearch(int arr[] , int key) {
		System.out.println("Searching elements in array : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.println("Element found at index : " + i);
				return;
			}
		}
		System.out.println("Element not found");
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
		
		System.out.println("Enter your key : ");
		int key = sc.nextInt();
		
		//linearSearch
		a.linearSearch(arr, key);
		
	}
}
