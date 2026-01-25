package string;

public class LongestWord {
             public static void main(String[] args) {
				String s = "I Love Java Programming";
				
				String words[] = s.split("\\s+");
				
				String longestWord ="";
				
				for(String word : words) {
					if(word.length()> longestWord.length()) {
						longestWord = word;
					}
				}
				
				System.out.println("Longest Word is :" + longestWord);
				System.out.println("Longest word length is : " + longestWord.length());
			}
}
