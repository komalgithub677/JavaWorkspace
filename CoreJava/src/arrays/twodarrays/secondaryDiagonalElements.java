package arrays.twodarrays;

public class secondaryDiagonalElements {
             public void secondaryDiagonal(int arr[][]) {
            	 int n = arr.length;
            	 
            	 if(n!=arr[0].length) {
            		 System.out.println("Secondary digonal elements Exists only for the square matrix : ");
            		 return;
            	 }
            	 
            	 System.out.println("Secondary diagonal Elements :");
            	 for(int i=0; i<n; i++) {
            		 int j = n-1-i;
            		 System.out.println(arr[i][j] + " ");
            	 }
            	 
             }
             
             public static void main(String[] args) {
            	 secondaryDiagonalElements s = new secondaryDiagonalElements();
            	 
            	 int arr[][] = {{10, 20}, {11, 23}};
            	 s.secondaryDiagonal(arr);
			}
}
