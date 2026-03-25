package breakandcontinue;

public class SkipAtLastDigitEquals3 {
            public static void main(String[] args) {
				// Print numbers from 1 to 200 but skip numbers whose last digit is 3. (Use continue)
            	for(int i=1; i<=100; i++) {
            		int digit = i%10;
            		if(digit==3) {
            			continue;
            		}
            		System.out.println(i);
            	}
			}
}
