package collectionsFrameworks.practice;

import java.util.HashSet;

public class DisplaySetElementsUsingForEach {
             public static void main(String[] args) {
//            	 Display all elements of a Set using for-each loop.
				HashSet<Integer> set = new HashSet<Integer>();
				
				set.add(12);
				set.add(13);
				set.add(25);
				set.add(45);
				set.add(46);
				
				for(Integer elements : set) {
					System.out.println(elements);
				}
			}
}
