package breakandcontinue;

public class OddForOdAsciiValueEvenForEven {
             public static void main(String[] args) {
            	 //Print alphabets but print "odd" for odd ASCII values, "even" for even.
				for(char ch='A'; ch<='Z'; ch++) {
					int AsciiValue = (int) ch;
					
					if(AsciiValue%2==1) {
						System.out.println("Odd");
					}
					if(AsciiValue%2==0) {
						System.out.println("Even");
					}
//					System.out.println(AsciiValue);
				}
			}
}
