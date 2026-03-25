package breakandcontinue;

public class PrintAtoZstopAtM {
             public static void main(String[] args) {
				for(char ch='A'; ch<='Z'; ch++) {
					if(ch=='M') {
						break;
					}
					System.out.println(ch);
				}
			}
}
