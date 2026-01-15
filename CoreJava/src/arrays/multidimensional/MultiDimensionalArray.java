package arrays.multidimensional;

public class MultiDimensionalArray {
             public static void main(String[] args) {
            	//3D array
    	         int arr[][][] = {{{12,13,4},{3,6,7},{2,9,8}}};
//    	         System.out.println(arr[0][1][0]);
//    	         System.out.println(arr.length);
    	         int sum =0;
    	         for(int i=0; i<arr.length; i++) {
    	        	 for(int j=0; j<arr[i].length; j++) {
    	        		 for(int k=0; k<arr[i][j].length; k++) {
    	        			 if(arr[i][j][k]%2==0) {
    	        				 sum +=arr[i][j][k];
    	        			 }
    	        		 }
    	        		 System.out.println();
    	        	 }	 
    	         }
    	         System.out.println("Sum of Even Elements : " + sum);
			}
}
