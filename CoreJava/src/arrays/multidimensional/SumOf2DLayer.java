package arrays.multidimensional;

public class SumOf2DLayer {
             public void sumOfTwoDArray(int arr[][][]) {
            	 for(int i=0; i<arr.length; i++) {
            		 int sum =0;
            		 for(int j=0; j<arr[i].length; j++){
            			 for(int k=0; k<arr[i][j].length; k++) {
            				 sum +=arr[i][j][k];
            			 }
            		 }
            		 System.out.println("Sum : " + (i+1) + " " + sum);
            		 
            	 }
             }
             
             public static void main(String[] args) {
            	 SumOf2DLayer s = new SumOf2DLayer();
            	 int arr[][][] = {{{10,20,40,56,76},{11,23,34,35,45},{12,23,24,25,26}}};
            	 
            	 s.sumOfTwoDArray(arr);
			}
}
