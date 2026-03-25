package arrays;

import java.util.Scanner;

public class CountEvenOdd {
//	Write a program to count even and odd elements in an array.
	public void evenOdd(int arr[]) {
		int evenCount =0;
		int oddCount =0;
		
		for(int i=0; i<arr.length; i++) {
		    if(arr[i]%2==0) {
		    	evenCount++;
		    }
		    else {
		    	oddCount++;
		    }
		}
		
		System.out.println("Even Count : " + evenCount);
		System.out.println("Odd Count : " + oddCount);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		CountEvenOdd c = new CountEvenOdd();
		int arr[] = new int[5];
		
		System.out.println("Enter the array : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even Odd Count : ");
	    c.evenOdd(arr);
	}
}
