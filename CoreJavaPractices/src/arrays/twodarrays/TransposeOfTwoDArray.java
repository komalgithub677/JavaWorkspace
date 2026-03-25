package arrays.twodarrays;

public class TransposeOfTwoDArray {
             public void transpose(int arr[][]) {
            	 int rows = arr.length;
            	 int cols =arr[0].length;
            	 System.out.println("Original Matrix : ");
            	 for(int i=0; i<rows; i++) {
            		 for(int j=0; j<cols; j++) {
            			 System.out.print(arr[i][j] + " ");
            		 }
            		 System.out.println();
            	 }
            	 
            	 System.out.println("Transpose Matrix : ");
            	 for(int i=0; i<cols; i++ ) {
            		 for(int j=0; j<rows; j++) {
            			 System.out.print(arr[j][i] + " ");
            		 }
            		 System.out.println();
            	 }
             }
             
             public static void main(String[] args) {
            	 TransposeOfTwoDArray t = new TransposeOfTwoDArray();
            	 int arr[][] = {{10,20,40,56,76},{11,23,34,35,45}};
            	 
            	 t.transpose(arr);
            	 
			}
}
