package loops;

public class CountDigitsInNumber {
             public static void main(String[] args) {
            	 int num = 1234;
				int countDigit = 0;
				int evenCount = 0;
				int oddCount = 0;
				
				for(int i=num; i>0; i=i/10) {
					int digit = i%2;
					countDigit++;
					if(digit%2==0) {
					evenCount++;
					}
					else {
						oddCount++;
					}
				}
				System.out.println("Count of Digit : " + countDigit);
				System.out.println("Even Count would be : " + evenCount);
				System.out.println("Odd count would be : " + oddCount);
			}
}
