package collectionsFrameworks.practice;

import java.util.HashSet;

public class CheckWhetherSpecificElementPresent {
             public static void main(String[] args) {
//            	 Check whether a specific element exists in a Set.
            	 HashSet<Integer> set = new HashSet<Integer>();
 				
 				set.add(12);
 				set.add(13);
 				set.add(25);
 				set.add(45);
 				set.add(46);
 				
 				System.out.println(set.contains(13));
 				
 				System.out.println(set.contains(35));
 				
			}
}
