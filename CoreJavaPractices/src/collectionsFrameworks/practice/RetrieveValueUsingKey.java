package collectionsFrameworks.practice;

import java.util.HashMap;

public class RetrieveValueUsingKey {
             public static void main(String[] args) {
            	 // Retrieve a value using a key from Map.
            	 HashMap<Integer, String > map = new HashMap<Integer, String >();
  				
  				map.put(1 ,"Komal");
  				map.put(null,"Disha");
  				map.put(3,"Snehal");
  				map.put(4 ,null);
  				map.put(null,"Snehal");
  				
  				System.out.println(map);
  				
  				//get the value using key
  				System.out.println(map.get(3));
  				
  				 //Check whether a key exists in Map.
  				System.out.println(map.containsKey(5));
  				
  				// Check whether a value exists in Map.
  				System.out.println(map.containsValue("Komal"));
  				
  				//Remove an entry from Map using key.
  				System.out.println(map.remove(1));
  				System.out.println(map);
  				
  				// Find the size of a Map.
  				System.out.println(map.size());
			}
}
