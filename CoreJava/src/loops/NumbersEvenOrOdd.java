
package loops;

public class NumbersEvenOrOdd {
       public static void main(String[] args) {
    	   int evenCount = 0;
    	   int oddCount = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even Count = " + evenCount);
		System.out.println("Odd Count = " + oddCount);
	}
}