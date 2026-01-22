package collectionsFrameworks.practice;

import java.util.HashMap;

public class DisplayelementUsingEntrySet {
             public static void main(String[] args) {
            	 HashMap<Integer, String > map = new HashMap<Integer, String >();
 				
 				map.put(1 ,"Komal");
 				map.put(null,"Disha");
 				map.put(3,"Snehal");
 				map.put(4 ,null);
 				//only one null key take hashmap
 				map.put(null,"Snehal");
 				
 				System.out.println(map);
 				
 				//Disply the elements using the entryset
 				System.out.println(map.entrySet());
 				
			}
}
