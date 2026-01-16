package arrays.twodarrays;

public class CountNumberOfElements {
              public void count(int arr[][]) {
            	  int count =0;
            	  for(int i=0; i<arr.length; i++) {
            		  for(int j=0; j<arr[i].length; j++) {
            			  count++;
            		  }
            	  }
            	  System.out.println(count);
              }
              
              public static void main(String[] args) {
				CountNumberOfElements c = new CountNumberOfElements();
				int arr[][] = {{10,20,30,40},{ 30,40,50,60}};
				
				c.count(arr);
			}
}
