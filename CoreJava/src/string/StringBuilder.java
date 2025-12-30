package string;

public class StringBuilder {
            public static void main(String[] args) {
				String s1 = "java";
				String s3 = "java";
				String s2 = new String("java");
				
				System.out.println(System.identityHashCode(s1));
				System.out.println(System.identityHashCode(s3));
				System.out.println(System.identityHashCode(s2));
				
				System.out.println(s1.hashCode() == s2.hashCode());
				
				
			}
}
