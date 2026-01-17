package arrays.twodarrays;

public class IdentityMatrix {
             public void identityMatrix(int arr[][]) {
            	 int rows = arr.length;
            	 int cols = arr[0].length;
            	 
            	 if(rows!=cols) {
            		 System.out.println("Diagonal elements exists for the square matrix ");
            	 }
            	 
            	 for(int i=0; i<rows; i++) {
            		 if(arr[i][i]==1) {
            			 System.out.print("Identity matrix : ");
            		 }
            		 else {
            			 System.out.println("Maxtrix is not the identity matrix");
            		 }
            		 
            		 System.out.println(arr[i][i] + " ");
            	 }
             }
             
             public static void main(String[] args) {
            	 IdentityMatrix i = new IdentityMatrix();
            	 
            	 int arr[][] = {{1, 20}, {11, 1}};
            	 
            	 i.identityMatrix(arr);
			}
}
