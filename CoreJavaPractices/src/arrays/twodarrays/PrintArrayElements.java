package arrays.twodarrays;

public class PrintArrayElements {
//	Write a program to print all elements of a 2D array.
	public void printArray(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PrintArrayElements p = new PrintArrayElements();
		int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
		
		p.printArray(arr);
	}
}
