package breakandcontinue;

public class SkipNumberDividedBy7 {
             public static void main(String[] args) {
            	 //Print numbers from 1 to 50 but skip numbers divisible by 7.
				for(int i=1; i<=50; i++) {
					if(i%7==0) {
						continue;
					}
					System.out.println(i);
				}
			}
}
