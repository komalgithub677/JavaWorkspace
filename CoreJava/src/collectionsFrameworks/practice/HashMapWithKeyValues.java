package collectionsFrameworks.practice;

import java.util.HashMap;

public class HashMapWithKeyValues {
             public static void main(String[] args) {
//            	 Create a HashMap and store Roll No as key and Name as value.
				HashMap<Integer, String > map = new HashMap<Integer, String >();
				
				map.put(1 ,"Komal");
				map.put(2,"Disha");
				map.put(3,"Snehal");
				map.put(4 ,"Sakshi");
				map.put(5 ,"Snehal");
				
				System.out.println(map);	
			}
}
