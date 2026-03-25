package string;

public class SmallestWord {
              public static void main(String[] args) {
//            	  Find the smallest word in a String array
            	  String words[] = {"Didi" ,"Developer" , "Java" ,"c++"};
            	  
            	  String smallest =words[0];
            	  for(int i=0; i<words.length; i++) {
            		  if(words[i].length()<smallest.length()) {
            			  smallest  =words[i];
            		  }
            	  }
            	  
            	  System.out.println("Smallest element : " + smallest);
			}
}
