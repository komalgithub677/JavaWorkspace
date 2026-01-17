package arrays.multidimensional;

public class PrintOnlyElements {
               public void even(int arr[][][]) {
            	   for(int i=0; i<arr.length; i++) {
            		   for(int j=0; j<arr[i].length; j++) {
            			   for(int k=0; k<arr[i][j].length; k++) {
            				   if(arr[i][j][k]%2==0) {
            					   System.out.print(arr[i][j][k] + " ");
            				   }
            			   }
            			   System.out.println();
            		   }
            	   }
               }
               
               public static void main(String[] args) {
            	   PrintOnlyElements  p = new PrintOnlyElements ();
            	   
            	   int arr[][][] = {{{10,20,40,56,76},{11,23,34,35,45},{12,23,24,25,26}}};
            	   
            	   p.even(arr);
			}
}
