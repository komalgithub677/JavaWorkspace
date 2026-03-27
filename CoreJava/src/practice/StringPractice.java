package practice;

public class StringPractice {
             public static void main(String[] args) {
				String s = "Komal";
				String s1 = "Komal";
				
				System.out.println(s.length());
				System.out.println(s.charAt(0));
				System.out.println(s.toLowerCase());
				System.out.println(s.toUpperCase());
				System.out.println(s.toCharArray());
				System.out.println(s.substring(0 ,2));
				System.out.println(s.startsWith("k"));
				System.out.println(s.endsWith("l"));
				System.out.println(s.equals(s1));
				System.out.println(s==s1);
				
				//String builder is used to modify the strings without creating the new objects
				StringBuilder sb = new StringBuilder("Hello");
				sb.append("world");
				
				System.out.println(sb);
				sb.insert(1, "Java");
				System.out.println(sb);
				
				System.out.println(sb.capacity());
				
				System.out.println(sb.replace(0, 5, "Hi"));
				
				System.out.println(sb.replace(0, 5, "Hi"));
				
			    System.out.println(	sb.length());
				
				
				
			}
}
