package arrays.twodarrays;

public class SumOfDiagonalElements {
             public void sumOfDiagonal(int arr[][]) {
            	         int row = arr.length; 
            	         int cols = arr[0].length;
            	         
            	         if(row != cols) {
            	        	 System.out.println("Diagonal elements only exist for the square matrix : ");
            	         }
            	         
            	         int sum =0;
            	         
            	         for(int i=0; i<row; i++) {
            	        	 System.out.println(arr[i][i] + " ");
            	        	 sum +=arr[i][i];
            	         }
            	         System.out.println("Sum : " + sum);
             }
             
             public static void main(String[] args) {
            	 SumOfDiagonalElements s = new SumOfDiagonalElements();
            	 int arr[][] = {{10, 20}, {11, 23}};
            	 s.sumOfDiagonal(arr);
            	 
			}
}
