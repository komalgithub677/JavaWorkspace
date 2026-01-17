package arrays.twodarrays;

public class SquareMatrix {
             public void square(int arr[][]) {
            	 //No of rows should be equals to  the no of columns
            	 int rows = arr.length;
            	 int cols = arr[0].length;
            	 
            	 if(rows==cols) {
            		 System.out.println("Matrix is square");
            	 }
            	 else {
            		 System.out.println("Not a square");
            	 }
             }
             
             public static void main(String[] args) {
            	 SquareMatrix s = new SquareMatrix();
            	 
            	 int arr[][] = {{10, 20}, {11, 23}};
            	 s.square(arr);
			}
}
