package string;

public class A {
         
           
           public static void main(String[] args) {
        	   //Type through the String literal
        	   String s1 = "java";
               String s2 = "java";
               
//               System.out.println(s1.hashCode()==s2.hashCode());
               System.out.println(s1==s2); //references
               System.out.println(s1.equals(s2));//Check value scp goes value once
		}
}
