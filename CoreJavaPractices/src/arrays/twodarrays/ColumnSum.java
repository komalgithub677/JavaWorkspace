package arrays.twodarrays;

public class ColumnSum {
//	Find the sum of each column in a 2D array.
	public void columnSum(int arr[][]) {
		        int cols = arr[0].length;
		        int rows = arr.length;
		
		        for(int i=0; i<cols; i++) {//colms
		        	 int sum =0;
		        	for(int j=0; j<rows; j++) {//rows
		        	  sum +=arr[i][j]; 
		        	}
		        	System.out.println("Sum : " + (i+1) +  sum);
		        }
	}
              public static void main(String[] args) {
				ColumnSum c = new ColumnSum();
				 int arr[][] = {{10,20,40,56,76},{11,23,34,35,45}};
				 c.columnSum(arr);
			}
}
