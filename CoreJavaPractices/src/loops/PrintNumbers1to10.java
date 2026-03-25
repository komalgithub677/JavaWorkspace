package loops;

public class PrintNumbers1to10 {
             public static void main(String[] args) {
//				1. Print all numbers from 1 to 100, but only print those numbers that are divisible by 5.
            	 
            	 for(int i=1; i<=10; i++) {
            		 System.out.println(i);
            		 if(i%5==0) {
            			 System.out.println("i%5 = " + i);
            		 }
            	 }
			}
}
