package breakandcontinue;

public class SkipEveryThirdCharacter {
             public static void main(String[] args) {
				//Print characters 'A' to 'Z' but skip every 3rd character.
            	 int count =0;
            	 for(char ch='A'; ch<='Z'; ch++) {
            		 count++;
            		 if(count%3==0) {
            			 continue;
            		 }
            		 System.out.println(ch);
            		 }
            	 }
}
