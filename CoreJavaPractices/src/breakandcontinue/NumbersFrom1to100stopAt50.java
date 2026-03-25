package breakandcontinue;

public class NumbersFrom1to100stopAt50 {
             public static void main(String[] args) {
				for(int i=100; i>=1; i--) {
					if(i==50) {
						break;
					}
					System.out.println(i);
				}
			}
}
