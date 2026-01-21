package collectionsFrameworks.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ListDemoMap {
            public static void main(String[] args) {
            	//Key value pair
//				HashMap<Integer , String>map = new HashMap();
//				map.put(1, "Komal");
//				map.put(2, null);
//				map.put(null, "Rahul");
//				map.put(null, "Rahul");
//				map.put(2, null);
//				map.put(5, null);
//				
//				System.out.println(map);
            	
            	//Null not allowed in key ,sort the value
//            	TreeMap<Integer ,String> map = new TreeMap<Integer,String>();
//            	map.put(3, "om");
//            	map.put(4, "123");
//            	map.put(1, "Pune");
//            	map.put(2, "knarawade4@gmail.com");
//            	map.put(5,"Komal");
//            	
//            	System.out.println(map);
            	
//            	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer ,String>();
//            	map.put(1, "Java");
//            	map.put(2, "Python");
//            	map.put(5, "C++");
//            	map.put(3, "php");
//            	map.put(null, "GoLang");
//            	map.put(null, "R");
//            	
//            	System.out.println(map);
            	
            	Hashtable<String , String> map = new Hashtable<String ,String>();
            	
            	map.put("name", "rahul");
            	map.put("City", "Pune");
            	map.put("email", "knarawade4@gmail.com");
//            	map.put("age",null);
//            	map.put(null, "1234");
            	
            	System.out.println(map);
//            	map.remove("name");
//            	System.out.println(map);
//            	System.out.println(map.containsKey("name"));
//            	System.out.println(map.containsValue("rahul"));
//            	
//            	map.clear();
//            	
//            	System.out.println(map.isEmpty());
//            	System.out.println(map.size());
//            	System.out.println(map.containsKey("name"));
//            	System.out.println(map.containsValue("Rahul"));
            	
            	for(Map.Entry<String, String> s : map.entrySet()) {
            		System.out.println(s.getKey() +  " " + s.getValue());
            	}
            	
            	
            
            
            	
				
			}
}
