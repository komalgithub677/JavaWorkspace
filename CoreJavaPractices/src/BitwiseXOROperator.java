
public class BitwiseXOROperator {
    public static void main(String[] args) {
    	//exor
		System.out.println(2^4);
		System.out.println(5^3);
		System.out.println(10^10);
		System.out.println(0^5);
		System.out.println(1^1);
		System.out.println(4^7);
		
		//What is the binary representation of XOR operation between 6 and 3?
		System.out.println(Integer.toBinaryString(6^3));
		
		//Evaluate 12 ^ 5.
		System.out.println(12^5);
		
		//What is the result of System.out.println(10 ^ 7 ^ 10);?
		System.out.println(10^7^10);
		
		//What will be the output of System.out.println(9 ^ 12);?
		System.out.println(9^12);
		
		//Predict the output:
		int a = 5;
		int b = a ^ 2;
		System.out.println(b);
		
		//What is the result of System.out.println((5 ^ 3) ^ 3);?
		System.out.println((5^3)^3);
		
		//What will be the output of the following code?
		int x = 15;
		int y = 27;
		System.out.println(x^y);
		
		//What will be the output of:
		int a1 = 6, b1 = 9;
		a1 = a1 ^ b1;
		b1 = a1 ^ b1;
		a1 = a1 ^ b1;
		System.out.println(a1 + " " + b1);
		
	
		
	}
}
