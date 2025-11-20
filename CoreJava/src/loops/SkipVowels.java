package loops;

public class SkipVowels {
             public static void main(String[] args) {
				for(char ch='A'; ch<='Z' ; ch++) {
					if(ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E') {
						continue;
					}
					System.out.println(ch);
				}
			}
}
