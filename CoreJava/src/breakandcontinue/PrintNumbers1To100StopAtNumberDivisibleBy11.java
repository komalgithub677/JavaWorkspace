package breakandcontinue;

public class PrintNumbers1To100StopAtNumberDivisibleBy11 {
             public static void main(String[] args) {
				for(int i=1; i<=100; i++) {
					if(i%11==0) {
						break;
					}
					System.out.println(i);
				}
			}
}
