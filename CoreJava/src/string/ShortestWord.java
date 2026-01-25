package string;

public class ShortestWord {
             public static void main(String[] args) {
				String s = "I Love Programming";
				
				String words[] = s.trim().split("\\s+");
				
				String smallestWord = words[0] ;
				for(String word : words) {
					if(word.length()< smallestWord.length()) {
						smallestWord = word;
					}
				}
				
				System.out.println("Smallest word would be : " + smallestWord);
			}
}
