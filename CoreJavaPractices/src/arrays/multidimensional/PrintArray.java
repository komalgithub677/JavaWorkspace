package arrays.multidimensional;

public class PrintArray {
             public void printArray(int arr[][]) {
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 System.out.print(arr[i][j] + " ");
            		 }
            		 System.out.println();
            	 }
             }
             
             public static void main(String[] args) {
            	 PrintArray p = new PrintArray();
            	 int arr[][] = {{10,20,40,56,76},{11,23,34,35,45}};
            	 p.printArray(arr);
			}
}















