package breakandcontinue;

public class NaturalNumbersStopSumExceeds100 {
             public static void main(String[] args) {
            	 int sum =0;
				for(int i=1; i<=100; i++) {
					sum +=i;
					if(sum>100) {
						break;
					}
					System.out.println(sum);
				}
			}
}
