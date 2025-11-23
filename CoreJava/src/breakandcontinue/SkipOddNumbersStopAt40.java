package breakandcontinue;

public class SkipOddNumbersStopAt40 {
             public static void main(String[] args) {
				//Print countdown 100–1, skip odd numbers, stop at 40.
            	 for(int i=100; i>=1; i--) {
            		 if(i%2==1) {
            			 continue;
            		 }
            		 
            		 if(i==40) {
            			 break;
            		 }
            		 System.out.println(i);
            	 }
			}
}
