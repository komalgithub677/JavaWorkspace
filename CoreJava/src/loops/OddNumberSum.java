package loops;

public class OddNumberSum {
             public static void main(String[] args) {
            	 //10. Print all odd numbers from 1 to N and also print their total sum.
            	 int totalSum =0;
            	 
            	 for(int i=1; i<=5; i++) {
            		 if(i%2==1){
            			 System.out.println("Odd No : " + i );
            			 totalSum +=i;
            		 }
            	 }
            	 System.out.println("TotalSum = " + totalSum);
			}
}
