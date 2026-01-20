package collectionsFrameworks.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
             public static void main(String[] args) {
				HashSet set = new HashSet();
				set.add(123);
				set.add("Komal");
				set.add('S');
				set.add(12.34);
				set.add("rahul");
				set.add(true);
				set.add(true);
				
				set.add(null);
				set.add(null);
				
				System.out.println(set);
				
				Iterator<Integer> itr = set.iterator();
				while(itr.has) {
					System.out.println(e.nextElement());
				}
				
				
			}
}
