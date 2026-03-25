package arrays.multidimensional;

public class MaximumArrayElement {
             public void maxElement(int arr[][][]) {
            	    int max = Integer.MIN_VALUE;
            	    
            	    for(int i=0; i<arr.length; i++) {
            	    	for(int j=0; j<arr[i].length; j++) {
            	    		for(int k=0; k<arr[i][j].length; k++) {
            	    			if(arr[i][j][k]>max) {
            	    				max = arr[i][j][k];
            	    			}
            	    		}
            	    	}
            	    }
            	    System.out.println("Max element : " + max);
             }
             
             public static void main(String[] args) {
            	 MaximumArrayElement m = new MaximumArrayElement();
            	 int arr[][][] = {{{10,20,40,56,76},{11,23,34,35,45},{12,23,24,25,26}}};
            	 
            	 m.maxElement(arr);
			}
}
