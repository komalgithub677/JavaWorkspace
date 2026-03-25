package collectionsFrameworks.practice;

import java.util.ArrayList;

public class RemoveElemtentAtSpecificIndex {
             public static void main(String[] args) {
				ArrayList list = new ArrayList<>();
				
				list.add("Komal");
				list.add(11);
				list.add("Divya");
				list.add("Monika");
				list.add("123");
				
			 System.out.println(list);
			 
			 //Remove the element at the specified index
			 list.remove(0);
			 
			 System.out.println(list);
			}
}
