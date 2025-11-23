package breakandcontinue;

public class StopAt25 {
             public static void main(String[] args) {
				//Print numbers 1–50 but print “STOP” when number equals 25.
            	 for(int i=1; i<=50; i++) {
            		 if(i==25) {
            			 System.out.println("Stop");
            		 }
            		 System.out.println(i);
            	 }
			}
}
