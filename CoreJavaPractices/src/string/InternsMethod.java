package string;

public class InternsMethod {
        public static void main(String[] args) {
        	  String str1 = "Hello";
              String str2 = new String("Hii");
              
              String s = str1.intern();
              System.out.println(s);
              
              System.out.println(str1==str2);
              System.out.println(str1.equals(str2));
              
              String str = "  rahul   ";
              
              System.out.println(str.charAt(3));
              System.out.println(str.length());
              
              System.out.println(str.trim());
              System.out.println(str.length());
              
		}
          
         
}
