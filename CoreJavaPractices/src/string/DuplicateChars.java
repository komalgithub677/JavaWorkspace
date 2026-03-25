package string;

public class DuplicateChars {
             public void duplicates (String s) {
            	 char[] ch = s.toCharArray();
            	 
            	 for(int i=0; i<s.length()-1; i++) {
            		 
            		 for(int j=i+1; i<s.length()-1; j++) {
            			 if(ch[i]==ch[j]) {
            				 System.out.println("Duplicate characters");
            			 }
            			 else {
            				 System.out.println("Not duplicate characters ");
            			 }
            		 }
            	 }
             }
             public static void main(String[] args) {
				DuplicateChars  d = new DuplicateChars();
				String s = "AAA";
				d.duplicates(s);
			}
}
