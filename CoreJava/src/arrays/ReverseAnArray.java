package arrays;

import java.util.Scanner;

public class ReverseAnArray {
             public void reverse(int arr[] ,int start , int end) {
            	 
            	 if(start<0 || end>=arr.length || start>=end) {
            		 return;
            	 }
            	 
            	 while(start<end) {
            		 int temp = arr[start];
            		 arr[start] = arr[end];
            		 arr[end] = temp;
            		 
            		 start ++;
            		 end--;
            	 }
            	 
            	
             }
             
//             🟢 Level 1: Basic Warm-up (Logic + Indexing)
//
//             Find the largest and smallest element in an array.
//             Example: [4, 2, 9, 1] → max = 9, min = 1
//
//             Reverse an array without using another array.
//
//             Check if an array is sorted in ascending order.
             
             public static boolean isSorted(int arr[]) {
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 if(arr[i]>arr[i+1]){
            			 return false;
            		 }
            	 }
            	 return true;
            	
             }
//
//             Find the sum and average of all elements in an array.
//
//             Count even and odd numbers in the array.
//
//             🟡 Level 2: Medium (Interview Favorite)
//
//             Find the second largest element in an array (without sorting).
//
//             Remove duplicate elements from a sorted array.
//
//             Move all zeroes to the end of the array while maintaining order.
//             Example: [0,1,0,3,12] → [1,3,12,0,0]
//
//             Left rotate an array by k positions.
//             Example: rotate [1,2,3,4,5] by 2 → [3,4,5,1,2]
//
//             Find missing number from array of size n containing numbers 1 to n.
//
//             🔵 Level 3: Real Interview / Problem-Solving
//
//             Find duplicate elements in an array without using extra space.
//
//             Find the element that appears only once, all others appear twice.
//
//             Kadane’s Algorithm – Find the maximum subarray sum.
//
//             Two Sum Problem
//             Find two numbers whose sum equals a given target.
//
//             Majority Element
//             Find the element that appears more than n/2 times.
//
//             🔴 Level 4: Advanced / Company-Level
//
//             Merge two sorted arrays without using extra space.
//
//             Rearrange array alternatively
//             (max, min, second max, second min…)
//
//             Find the longest consecutive sequence in an unsorted array.
//
//             Trapping Rain Water Problem
//
//             Product of array except self (without division).
//
//             💡 How to Practice (Important!)
//
//             For each problem, try to:
//
//             Write brute force approach
//
//             Then optimized approach
//
//             Analyze Time & Space Complexity
             
             public static void main(String[] args) {
            	 ReverseAnArray r  = new ReverseAnArray();
            	 Scanner sc = new Scanner(System.in);
            	 int arr[] = {3,4,5,6,7,8};
            	 //Array before reversing
            	 for(int nums :arr) {
            		 System.out.println(" nums" + nums);
            	 }
            	 
            	 //arrya after reverseing
            	 r.reverse(arr, 2, 5);
            	
            	 if(isSorted(arr)) {
            		 System.out.println("Array is sorted in ascending order");
            	 }
            	 else {
            		 System.out.println("Array is sorted in descending order");
            	 }
			}
}
