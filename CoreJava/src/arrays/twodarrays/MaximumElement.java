package arrays.twodarrays;

public class MaximumElement {
             public void max(int arr[][]) {
            	 int max =arr[0][0];
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 if(max>arr[i][j]) {
            				 max = arr[i][j];
            			 }
            		 }
            	 }
            	 
            	 System.out.println("Max Element : " + max);
             }
             
             public static void main(String[] args) {
				MaximumElement m = new MaximumElement();
				int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
				m.max(arr);
			}
}
