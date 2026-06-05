package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class P3 {
       public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//adding the elements in the arraylist 
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(11);
		
		//removing elements form the arraylist
		list.remove(3);
		list.remove(1);
		
	    //Accessing elements form the arraylist
		list.getFirst();
		list.getLast();
		
		list.get(2);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		System.out.println(list);
		
		HashSet<Integer> set  = new HashSet<>();
		set.add(11);
		set.add(11);
		set.add(12);
		set.add(12);
		set.add(13);
		set.add(13);
		
		System.out.println(set);
		
		HashMap<Integer , String> map = new HashMap<>();
		map.put(1, "Komal");
		map.put(2, "Disha");
		map.put(3, "Sakshi");
		map.put(4, "Shreya");
		
		System.out.println(map + " : " );
		
		
		
		
	}
}
