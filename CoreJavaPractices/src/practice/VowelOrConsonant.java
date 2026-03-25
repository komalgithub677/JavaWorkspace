package practice;

public class VowelOrConsonant {
             public void VowelorConsonant(char ch) {
            	 if(ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E' || ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e') {
            		 System.out.println("Character is vowel");
            	 }
            	 else{
            		 System.out.println("Character is consonant");
            	 }
             }
             
             public static void main(String[] args) {
				VowelOrConsonant v = new VowelOrConsonant();
				v.VowelorConsonant('a');
			}
}
