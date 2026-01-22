package collectionsFrameworks.practice;

import java.util.ArrayList;

public class AddElementAtSpecific {
             public static void main(String[] args) {
//            	 Add an element at a specific index in an ArrayList.
				ArrayList list = new ArrayList<>();
				
				list.add("Komal");
				list.add(123);
				list.add("Sonali");
				list.add(23);
				
				System.out.println(list);
				
				list.add(3, "Monika");
				
				System.out.println(list);
			}
}
