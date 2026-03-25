package string;

public class ReverseEachWordInSentence {
              public static void main(String[] args) {
				String s = "I Love Java Programming very much";
				
				String words[] = s.trim().split("\\s+");
				
				for(int i=s.length()-1; i>=0; i--) {
					System.out.println(words[i]);
				}	
			}
}
