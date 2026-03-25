package breakandcontinue;

public class SkipNumberDigitendwith5 {
        public static void main(String[] args) {
			for(int i=1; i<=100; i++) {
				int digit = i%10;
				if(digit==5) {
					continue;
				}
				System.out.println(i);
			}
		}
}
