package breakandcontinue;

public class SkipMultipleof4And6 {
             public static void main(String[] args) {
				//Print numbers 1–200 but skip multiples of 4 or 6.
            	 for(int i=1; i<=200; i++) {
            		 if(i%4==0 && i%6==0) {
            			 continue;
            		 }
            		 System.out.println(i);
            	 }
			}
}
