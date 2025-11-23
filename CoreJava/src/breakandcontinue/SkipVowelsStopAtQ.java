package breakandcontinue;

public class SkipVowelsStopAtQ {
             public static void main(String[] args) {
            	 // Print characters A–Z but skip vowels and stop when you reach 'Q'
				for(char ch='A'; ch<='Z'; ch++) {
					if(ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E') {
						continue;
					}
					if(ch=='Q') {
						break;
					}
					System.out.println(ch);
				}
			}
}
