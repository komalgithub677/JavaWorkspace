package string;

public class StringReverseWithBuiltInMethods {
             public static void main(String[] args) {
				String s = "Komal";
				
				StringBuilder sb = new StringBuilder(s);
				sb.reverse();
				sb.toString();
				 
				System.out.println(sb);
				
			}
}
