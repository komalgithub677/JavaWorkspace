import java.util.ArrayList;

public class StringToUppercaseAndLowercase {
            public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        
	        list.add("Komal");
	        list.add("Sonali");
	        list.add("Divya");
	        list.add("Shreya");
	        list.add("Pooja");
	        
	        System.out.println(list);
	        
	        String s = list.toString();
	       
	        System.out.println( s.toLowerCase());
	        System.out.println( s.toUpperCase());       	        
}
}
