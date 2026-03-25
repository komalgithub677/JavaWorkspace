package breakandcontinue;

public class SkipDivisibleBy4 {
            public static void main(String[] args) {
				// Print numbers from 1 to 50 but skip numbers divisible by 4. (Use continue)
            	for(int i=1; i<=50; i++) {
            		if(i%4==0) {
            			continue;
            		}
            		System.out.println(i);
            	}
			}
}
