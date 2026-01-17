package arrays.twodarrays;

public class RowSum {
             public void rowSum(int arr[][]) {
            	 for(int i=0; i<arr.length; i++) {
            		 int sum =0;
            		 for(int j=0; j<arr[i].length; j++) {
            			 sum +=arr[i][j];
            		 }
            		 System.out.println("Sum : " +(i+1) + " " + sum);
            	 }
             }
             public static void main(String[] args) {
            	 RowSum r = new RowSum();
            	 int arr[][] = {{10,20,40,56,76},{11,23,34,35,45}};
            	 r.rowSum(arr);
			}
}
