package arrays.twodarrays;

public class minimumElement {
             public void min(int arr[][]) {
            	 int min = arr[0][0];
            	 for(int i=0; i<arr.length; i++) {
            		 for(int j=0; j<arr[i].length; j++) {
            			 if(min<arr[i][j]) {
            				 min = arr[i][j];
            			 }
            		 }
            	 }
            	 System.out.println("Min Element : " + min);
             }
             
             public static void main(String[] args) {
				minimumElement m = new minimumElement();
				int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
				m.min(arr);
			}
}
