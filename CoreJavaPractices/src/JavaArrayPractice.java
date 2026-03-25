
public class JavaArrayPractice {
//	Reverse an array.
	public void reverse(int arr[]) {
		    int start = 0;
		    int end = arr.length-1;
		    
		    while(start<end) {
		    	int temp =arr[start];
		    	arr[start] = arr[end];
		    	arr[end] =temp;
		    	start ++;
		    	end --;
		    }
		    
		    for(int num : arr) {
		    	System.out.println(num);
		    }
	}
//
//	Find the sum of all elements in an array.
//
//	Find the largest element in an array.
//
//	Find the smallest element in an array.
//
//	Count even and odd numbers in an array.
//
//	Print elements at even indices.
//
//	Copy elements of one array into another.
//
//	Find the average of array elements.
//
//	Check whether an array is sorted or not.
//
//	Find the first and last element of an array.

	public static void main(String[] args) {
		JavaArrayPractice j = new JavaArrayPractice();
		
	}
}
