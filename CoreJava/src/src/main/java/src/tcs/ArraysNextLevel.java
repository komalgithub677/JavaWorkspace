import java.util.Scanner;
public class ArraysNextLevel {
//	Find Sum of All Elements
	public void sum(int arr[]) {
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("Sum of elements : " + sum);
	}
	
	
//	Count Positive, Negative, Zero
	public void pnz(int arr[]) {
		int zcount=0;
		int pcount=0;
		int ncount=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				zcount++;
			}
			if(arr[i]>0) {
				pcount++;
			}
			if(arr[i]<0) {
				ncount++;
			}
			
		}
		
		System.out.println("Zero count : " + zcount);
		System.out.println("Positive count : " + pcount);
		System.out.println("negative count : " + ncount);
	}
//	Reverse Array WITHOUT using extra array
	
	public void reverse(int arr[]) {
		
			int start =0;
			int end = arr.length-1;
			
			while(start<end) {
				int temp = arr[start];
				arr[start] =arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		
		
		System.out.println("Reverse array : ");
		for(int num : arr) {
			System.out.println(num);
		}
	}
	
//	Left Rotate Array by 1
	public void leftRotateby1(int arr[]) {
		int first = arr[0];
	
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = first;
		
		System.out.println("Array elements after rotating by 1 position : ");
		for(int num : arr) {
			System.out.println( num);
		}
	}
//	Leaders in Array
	
//	Maximum Difference
//	Stock Buy & Sell
//	Subarray with Given Sum
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 ArraysNextLevel a = new  ArraysNextLevel();
		 System.out.println("Enter your array : ");
		 int arr[] = new int[5];
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i]= sc.nextInt();
		 }
		 //sum
		 a.sum(arr);
		 
		 //pnz
		 a.pnz(arr);
		 
		 //reverse array
		 a.reverse(arr);
		 
		 //leftrotate
		 a.leftRotateby1(arr);
		 
	}
}
