package collectionsFrameworks;

import java.util.ArrayList;

public class Demo {
             public static void main(String[] args) {
//				 ArrayList<>
            	 ArrayList list = new ArrayList();
            	 list.add("Komal");
            	 list.add(123);
            	 list.add(true);
            	 list.add(67.67);
            	 list.add("@");
            	 
//            	 list.clear();
            	 System.out.println(list.contains("@"));
            	 list.remove(1);
            	 System.out.println( list.get(0));
            	 System.out.println(list);
			}
}
