package breakandcontinue;

public class SkipDivisble4AndStopNumbers73 {
              public static void main(String[] args) {
            	  //Print numbers 1–100, skip numbers divisible by 4, but stop when number becomes 73.
				for(int i=1; i<=100; i++){
					if(i%4==0) {
						continue;
					}
					if(i==73) {
						break;
					}
					System.out.println(i);
				}
			}
}
