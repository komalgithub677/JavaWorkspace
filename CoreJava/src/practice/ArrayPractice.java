package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
//	Find the sum of all elements in an array
	public void arraySume(int arr[]) {
		int sum =0; 
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("Sum of array elements : " + sum);
	}
//	Find the maximum element in an array
	public void maxElement(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0 ;i<arr.length; i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println("Maximum array elements : " + max);
	}
//	Find the minimum element in an array
	public void minElement(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0 ;i<arr.length; i++) {
			if(arr[i]<min) {
				min =arr[i];
			}
		}
		System.out.println("Maximum array elements : " + min);
	}
//	Count the number of even and odd elements
	
	public void evenOddElements(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("Even element " + arr[i]);
			}
			else {
				System.out.println("Odd elements : " + arr[i]);
			}
		}
	}
//	Reverse an array
	public void reverse(int arr[]) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
//	Print array elements in reverse order
	public void reverseArrayElements(int arr[]) {
		int start = 0;
		int end = arr.length -1;
		
		
			while(start<end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				
				start ++;
				end --;
			}
			System.out.println("Array after reversing the elements : " + Arrays.toString(arr));
		
		
		
		
	}
//	Find the average of elements
	
	public void average(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		int average = sum /arr.length;
		System.out.println("Average : " + average);
	}
//	Search an element using linear search
	public void linearSearch(int arr[] ,int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.println("Element found at index : " + i);
				return;
			}
		}
		
		System.out.println("Element not found ");
		
		
	}
//	Count how many times a number appears (frequency)
	public void count(int arr[] , int key) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		
		System.out.println("Count of elements : " + count);
	}
//	Copy elements of one array into another
	public void copyElements(int arr[]) {
		int arr1[] = new int[arr.length];
		System.out.println("Elements before copying : ");
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("Elements after copying : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr1[i]);
		}
	}
	
	   
//	   🟡 Level 2: Basic Logic Building
//	   Find the second largest element
	   public void secondLargest(int arr) {
		   
	   }
	   
//	   Find the second smallest element
//	   Check if array is sorted or not
//	   Remove duplicate elements
//	   Move all zeros to the end
//	   Count positive, negative, and zero elements
//	   Find the sum of even index elements
//	   Find the sum of odd index elements
//	   Find largest difference between two elements
//	   Merge two arrays
//	   🔵 Level 3: Important for TCS
//	   Rotate array left by 1 position
//	   Rotate array right by 1 position
//	   Find missing number in array (1 to N)
//	   Find duplicate number in array
//	   Find intersection of two arrays
//	   Find union of two arrays
//	   Find common elements in two arrays
//	   Find pair with given sum
//	   Check if two arrays are equal
//	   Find subarray with given sum
//	   🔴 Level 4: Slightly Tricky (But Important)
//	   Find maximum subarray sum (Kadane’s basic idea)
//	   Rearrange array: positive on one side, negative on other
//	   Find leaders in array (element greater than right side elements)
//	   Find majority element (> n/2 times)
//	   Sort array of 0s, 1s, and 2s
//	   Find equilibrium index
//	   Find prefix sum array
//	   Find product of array except self
//	   Find first repeating element
//	   Find longest consecutive sequence
	   
	   

	
             public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
            	 ArrayPractice a = new ArrayPractice();
				int arr[] = new int[5];
				
				for(int i=0; i<arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				//sum of array elements
				a.arraySume(arr);
				
				//maximum array elements
				a.maxElement(arr);
				
				//minimum array elements
				a.minElement(arr);
				
				//evenodd
			   a.evenOddElements(arr);
			   
			   //reverse
			   a.reverse(arr);
			   
			   //reversing array elements
			   a.reverseArrayElements(arr);
				
			   //average
			   a.average(arr);
			   
			   //linear search
			   int key =  sc.nextInt();
			   a.linearSearch(arr, key);
			   
			   //count of elements
			   a.count(arr, key);
			   
			   //copy array elements
			   a.copyElements(arr);
	   
				
			}
}
