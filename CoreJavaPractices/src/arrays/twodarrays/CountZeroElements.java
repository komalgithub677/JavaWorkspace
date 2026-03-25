package arrays.twodarrays;

public class CountZeroElements {
             public void countZero(int arr[][]) {
            	         int count =0;
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[0].length; j++) {
            			 if(arr[i][j]==0) {
            				 count++;
            			 }
            		 }
            		 
            	 }
            	 System.out.println("Count of zero elements : " + count);
             }
             
             public static void main(String[] args) {
            	 CountZeroElements c = new CountZeroElements();
            	 
            	 int arr[][] = {{10, 20, 0, 56, 76}, {11, 23, 34, 35, 45}};
            	 c.countZero(arr);
			}
}
