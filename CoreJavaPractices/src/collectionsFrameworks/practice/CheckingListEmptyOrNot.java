package collectionsFrameworks.practice;

import java.util.ArrayList;

public class CheckingListEmptyOrNot {
             public static void main(String[] args) {
				ArrayList <Integer> list = new ArrayList<>();
				
				list.add(10);
				list.add(20);
				list.add(21);
				list.add(22);
				list.add(24);
				list.add(35);
				
				System.out.println(list);
				
				//Checking list empty or not
				System.out.println("List empty or not :"+list.isEmpty());
				
				//Remove all elements from the list
				list.removeAll(list);
				
				System.out.println(list);
				
				//Again check the list is empty or not
				System.out.println(list.isEmpty());
			}
}
