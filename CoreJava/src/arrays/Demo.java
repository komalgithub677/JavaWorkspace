package arrays;

import java.util.Arrays;

public class Demo {
       public static void main(String[] args) {
		int arr[] = {10,70,30,40,50,60,20};
		int arr1[] = {10,30,50,60,70,80,90};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int index = Arrays.binarySearch(arr, 20);
		System.out.println(index);
		
		System.out.println(Arrays.equals(arr, arr1));
		
		System.out.println(Arrays.compare(arr1, arr));
		
//		System.out.println(Arrays.);
		
		int []a= new int[4];
		
		Arrays.fill(a, 40);
		
		System.out.println(Arrays.toString(a));
	}
}
