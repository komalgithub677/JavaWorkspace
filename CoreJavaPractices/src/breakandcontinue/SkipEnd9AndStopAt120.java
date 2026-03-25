package breakandcontinue;

public class SkipEnd9AndStopAt120 {
             public static void main(String[] args) {
				//Print numbers 1–200, skip numbers ending in 9, stop when number becomes 120.
            	for(int i=1; i<=200; i++) {
            		int digit = i%10;
            		if(digit ==9) {
            			continue;
            		}
            		if(i==120) {
            			break;
            		}
            		System.out.println(i);
            	}
			}
}
