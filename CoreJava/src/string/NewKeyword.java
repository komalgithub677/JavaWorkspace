package string;

public class NewKeyword {
      public static void main(String[] args) {
    	  //with new Keyword
    	  //Hello ,hello -->Case sensitive
		String str1 = new String("hello");
		
		String str2 = new String("hello");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1==str2); //references
		System.out.println(str1.equals(str2));//values
		
	}
}
