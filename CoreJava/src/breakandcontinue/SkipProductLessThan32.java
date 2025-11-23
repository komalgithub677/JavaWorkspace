package breakandcontinue;

public class SkipProductLessThan32 {
             public static void main(String[] args) {
				for(int i=1; i<=10; i++) {
					int product =i*8;
					if(product<32) {
						continue;
					}
					System.out.println(i);
				}
				
			}
}
