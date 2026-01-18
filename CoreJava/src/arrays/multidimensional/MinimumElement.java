package arrays.multidimensional;

public class MinimumElement {
             public void min(int arr[][][]) {
            	 int min = Integer.MAX_VALUE;
            	 
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 for(int k=0; k<arr[i][j].length; k++) {
            				 if(arr[i][j][k]<min) {
            					 min =arr[i][j][k];
            				 }
            			 }
            		 }
            	 }
            	 System.out.println("Minimum Elements From 3D Matrix : " + min);
             }
             
             public static void main(String[] args) {
            	 MinimumElement m = new MinimumElement();
            	 
            	 int arr[][][] = {{{10,20,40,56,76},{11,23,34,35,45},{12,23,24,25,26}}};
            	 
            	 m.min(arr);
			}
}
