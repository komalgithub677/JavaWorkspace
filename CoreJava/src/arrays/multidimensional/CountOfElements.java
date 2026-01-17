package arrays.multidimensional;

public class CountOfElements {
             public void count(int arr[][][]) {
            	 int count =0;
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 for(int k=0; k<arr[i][j].length; k++) {
            				 count++;
            			 }
            		 }
            	 }
            	 
            	 System.out.println("Count Of elements : " + count);
             }
             public static void main(String[] args) {
            	 CountOfElements c = new CountOfElements();
            	 
            	 int arr[][][] = {{{10,20,40,56,76},{11,23,34,35,45},{12,23,24,25,26}}};
            	 
            	 c.count(arr);
			}
}

