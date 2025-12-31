package string;

public class StringBuilderPractice {
             public static void main(String[] args) {
//            		on the Basis of StringBuilder & StringBuffer : 
            	 //
//            	 		Create a StringBuilder with text "Hello" and append " Java".
            	 	    StringBuilder sb = new StringBuilder("Hello");
            	 	    sb.append("Java");
            	 	    System.out.println("Updated String : " + sb);
            	 	    
//            	 		Create a StringBuilder and insert the word "Java" in the middle of a sentence.
            	 	   StringBuilder sb1 = new StringBuilder("Hello Programming");
            	 	   System.out.println("Before insertion : " + sb1);
            	 	   sb1.insert(6, "Java  ");
            	 	   System.out.println("After insertion : "+sb1);
            	 	   
//            	 		Reverse a string using StringBuilder.
            	 	   StringBuilder sb2 = new StringBuilder("Komal");
            	 	   System.out.println("Before Reverse : " + sb2);
            	 	   sb2.reverse();
            	 	   System.out.println("After Reverse : " + sb2);
            	 	   
//            	 		Replace the word "Java" with "Python" using StringBuilder.
            	 	  StringBuilder sb3 = new StringBuilder("Java");
            	 	  sb3.replace(0, 4, "Python");
            	 	  System.out.println("String after Replace :  " + sb3);
            	 	  
//            	 		Delete characters from index 2 to 5 using StringBuilder.
            	 	 StringBuilder sb4 = new StringBuilder("HelloWorld");
            	 	 System.out.println("String before Deletion : " + sb4);
            	 	 sb4.delete(0, 6);
            	 	 System.out.println("String after deletion : " + sb4);
            	 	 
//            	 		Convert String to StringBuilder and modify it.
            	 	 String s = "Hello";
            	 	StringBuilder sb5 = new StringBuilder(s);
            	 	sb5.append('k');
            	 	System.out.println("String aftert modify : " + sb5);
            	 	 
//            	 		Count the number of characters using StringBuilder (without length()).
            	 	StringBuilder sb6 = new StringBuilder("Hello");
            	 	int count = 0;
            	 	for(int i=0; i<sb6.length(); i++) {
            	 		System.out.println(sb6.charAt(i));
            	 		count++;
            	 	}
            	 	System.out.println("Count of characters : " + count);
            	 	
//            	 		Check whether the string is palindrome using StringBuilder reverse().
			}
}
