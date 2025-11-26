package loops;

public class PimeNumber {
             public static void main(String[] args) {
				int num = 2;
				if(num==1) {
					System.out.println("prime number");
				}
				if(num>1 && num%2!=0 && num%num==0) {
					System.out.println("Number is prime");
				}
				else {
					System.out.println("Number is not prime");
				}
			}
}
