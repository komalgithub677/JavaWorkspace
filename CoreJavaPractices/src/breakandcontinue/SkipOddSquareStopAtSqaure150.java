package breakandcontinue;

public class SkipOddSquareStopAtSqaure150 {
             public static void main(String[] args) {
				//Print squares of numbers, skip odd squares, stop when square > 150.
            	 for(int i=1; i<=100; i++) {
            		 int square = i*i;
            		 if(square%2==1) {
            			 continue;
            		 }
            		 if(square>150) {
            			 break;
            		 }
            		 System.out.println(square);
            	 }
			}
}
