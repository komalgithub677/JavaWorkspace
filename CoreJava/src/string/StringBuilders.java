package string;

public class StringBuilders {
            public static void main(String[] args) {
				String s1 = "java";
				String s3 = "java";
				String s2 = new String("java");
				
				System.out.println(System.identityHashCode(s1));
				System.out.println(System.identityHashCode(s3));
				System.out.println(System.identityHashCode(s2));
				
				System.out.println(s1.hashCode() == s2.hashCode());	
				
				String s = "Hello";
//				s = s + "world";
				//inbuilt methods
				s =s.concat("World");
				String s4 = "Hello";
				
				System.out.println(s);
				
				System.out.println(s.hashCode());
				System.out.println(s4.hashCode());
				
				StringBuilder sb = new StringBuilder("hello");
				sb.append("world");
				System.out.println(sb);
			}
}
