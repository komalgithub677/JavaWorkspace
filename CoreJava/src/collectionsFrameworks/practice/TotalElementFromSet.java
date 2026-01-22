package collectionsFrameworks.practice;

import java.util.HashSet;

public class TotalElementFromSet {
              public static void main(String[] args) {
				//Find total number of elements in a Set.
            	HashSet<Integer> set = new HashSet<Integer>();
     				
   				set.add(12);
   				set.add(13);
   				set.add(25);
   				set.add(45);
   				set.add(46);
   				
   				System.out.println(set);
   				
   				//Total elements from set
   				System.out.println(set.size());
			}
}
