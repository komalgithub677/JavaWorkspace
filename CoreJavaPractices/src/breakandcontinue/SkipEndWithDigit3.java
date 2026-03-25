package breakandcontinue;

public class SkipEndWithDigit3 {
             public static void main(String[] args) {
            	 //Print numbers 10–100 but skip those ending with digit 3.
				for(int i=10; i<=100; i++) {
					int digit = i%10;
					if(digit==3) {
						continue;
					}
					System.out.println(i);
				}
			}
}
