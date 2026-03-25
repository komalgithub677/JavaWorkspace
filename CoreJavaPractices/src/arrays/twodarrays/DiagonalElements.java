package arrays.twodarrays;

public class DiagonalElements {
             public void diagonal(int arr[][]) {
            	 int rows = arr.length;
            	 int cols = arr[0].length;
            	
            	 if(rows!= cols) {
            		 System.out.println("Diagonal elements exist only for th square matrix");
            		 return;
            	}
            	for(int i=0; i<rows; i++) {
            		System.out.println(arr[i][i] + " ");
            	}
            	 
            	 }
             public static void main(String[] args) {
            	 DiagonalElements d = new DiagonalElements();
            	 
            	 int arr[][] = {{10, 20, 40, 56, 76}, {11, 23, 34, 35, 45}};
            	 d.diagonal(arr);
			}
}
