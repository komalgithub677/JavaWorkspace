package collectionsFrameworks.practice;

import java.util.HashSet;

public class RemoveElementFromSet {
              public static void main(String[] args) {
//            	  Remove an element from a Set.
            	  HashSet<Integer> set = new HashSet<Integer>();
   				
   				set.add(12);
   				set.add(13);
   				set.add(25);
   				set.add(45);
   				set.add(46);
   				
   				System.out.println("Set after removing :" + set);
   				//Removing the lements from set
   				set.remove(12);
   				
   				System.out.println("Set after Removing :"+set);
			}
}
