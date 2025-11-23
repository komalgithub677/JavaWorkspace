package breakandcontinue;

public class Skip9 {
             public static void main(String[] args) {
			   //Print numbers 1–100 but skip those divisible by 9.
            	 for(int i=1; i<=100; i++) {
            		 if(i%9==0) {
            			 continue;
            		 }
            		 System.out.println(i);
            	 }
			}
}
