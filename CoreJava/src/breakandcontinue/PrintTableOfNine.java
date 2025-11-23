package breakandcontinue;

public class PrintTableOfNine {
             public static void main(String[] args) {
				for(int i=1; i<=50; i++) {
					int product = i*9;
					if(product>50) {
						break;
					}
					System.out.println(product);
				}
			}
}
