package breakandcontinue;

public class SkipNumber90to120 {
             public static void main(String[] args) {
				//Print numbers 50–150 but skip numbers between 90 and 110.
            	 for(int i=50; i<=150; i++) {
            		 if(i>=90 && i<=110) {
            			 continue;
            		 }
            		 System.out.println(i);
            	 }
			}
}
