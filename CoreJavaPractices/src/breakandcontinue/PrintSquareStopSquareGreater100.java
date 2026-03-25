package breakandcontinue;

public class PrintSquareStopSquareGreater100 {
             public static void main(String[] args) {
				//Print squares of numbers (1², 2²...) but stop when square becomes 200.
            	 for(int i=1; i<=100; i++) {
            		 int square = i*i;
            		 if(square>200) {
            			 break;
            		 }
            		 System.out.println(square);
            	 }
			}
}
