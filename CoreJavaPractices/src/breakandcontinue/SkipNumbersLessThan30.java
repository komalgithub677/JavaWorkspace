package breakandcontinue;

public class SkipNumbersLessThan30 {
             public static void main(String[] args) {
            	 //Print numbers 1–100 but skip numbers less than 30.
				for(int i=1; i<=100; i++) {
					if(i<30) {
						continue;
					}
					System.out.println(i);
				}
			}
}
