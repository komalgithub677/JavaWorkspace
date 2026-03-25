package breakandcontinue;

public class SkipVowelsAtopAtT {
            public static void main(String[] args) {
			 //Print characters 'A' to 'Z', skip vowels, stop at 'T'.
            	for(char ch='A'; ch<='Z'; ch++) {
            		if(ch=='A' || ch=='I' || ch=='U' || ch=='E') {
            			continue;
            		}
            		if(ch=='T') {
            			break;
            		}
            		System.out.println(ch);
            	}
			}
}
