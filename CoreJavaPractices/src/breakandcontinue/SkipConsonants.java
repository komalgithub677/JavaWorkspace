package breakandcontinue;

public class SkipConsonants {
        public static void main(String[] args) {
			//Print characters 'a' to 'z' but skip consonants.
        	for(char ch='A'; ch<='Z'; ch++) {
        		if(ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E') {
        			System.out.println(ch);
        		}
        		else {
        			continue;
        		}
        	}
		}
}
