package breakandcontinue;

public class SkipMultipleOf9StopNumberExceeds80 {
             public static void main(String[] args) {
				//Print odd numbers from 1–100, skip multiples of 9, stop when number exceeds 80.
            	 for(int i=1; i<=100; i++) {
            		 if(i%9==0) {
            			 continue;
            		 }
            		 if(i>80) {
            			 break;
            		 }
            		 System.out.println(i);
            	 }
			}
}
