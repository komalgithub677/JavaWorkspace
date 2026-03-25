package arrays.multidimensional;

public class SumOf3DMatrix {
             public void threeDMatrix(int arr[][][]) {
            	 int sum =0;
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 for(int k=0; k<arr[i][j].length; k++) {
            				 sum +=arr[i][j][k];
            			 }
            		 }
            	 }
            	 
            	 System.out.println("Sum Of array Elements :  " + sum);
             }
             
             public static void main(String[] args) {
            	 SumOf3DMatrix s = new SumOf3DMatrix();
            	 int arr[][][] = {{{10,20,40,56,76},{11,23,34,35,45},{12,23,24,25,26}}};
            	 
            	 s.threeDMatrix(arr);
			}
}
