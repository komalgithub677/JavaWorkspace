package arrays;

import java.util.Arrays;

public class ArraysPractice {
	public static void main(String[] args) {
		//Practise Programs based Array : 
        int arr[] = {12,23,14,15,16};
        
		
		//Write a program to declare and initialize a 1D array of integers.
		//
        System.out.println(Arrays.toString(arr));
			
		//Write a program to print all elements of a 1D array.
		//
		//Write a program to find the length of a 1D array.
        System.out.println("Arrays Elements : ");
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
		//
		//Write a program to find the sum of all elements in a 1D array.
		//
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
        	sum +=arr[i];
        }
        System.out.println("Sum of arrays Elements : " + sum);
		//Write a program to find the average of elements in a 1D array.
		//
        int sum1=0;
        for(int i=0; i<arr.length; i++) {
        	sum1 += arr[i];
        }
        
        System.out.println("Sum of array Elements :  " + sum1);
        
		//Write a program to find the maximum element in a 1D array.
		//
		//Write a program to find the minimum element in a 1D array.
		//
		//Write a program to search an element in a 1D array.
		//
		//Write a program to count even and odd numbers in a 1D array.
		//
		//Write a program to copy elements from one array to another.
		//
		//Write a program to reverse a 1D array.
		//
		//Write a program to sort a 1D array in ascending order.
		//
		//Write a program to sort a 1D array in descending order.
		//
		//Write a program to find duplicate elements in a 1D array.
		//
		//Write a program to remove duplicate elements from a 1D array.
		//
		//Write a program to count frequency of each element in a 1D array.
		//
		//Write a program to find the second largest element in a 1D array.
		//
		//Write a program to find the second smallest element in a 1D array.
		//
		//Write a program to merge two 1D arrays.
		//
		//Write a program to check whether a 1D array is a palindrome.
	}
}
