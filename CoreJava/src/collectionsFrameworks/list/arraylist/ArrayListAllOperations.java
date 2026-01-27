package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAllOperations {
             public static void main(String[] args) {
				ArrayList<Integer> list = new ArrayList<>(); 
				
				list.add(10);
				list.add(12);
				list.add(13);
				list.add(14);
				list.add(15);
				list.add(18);
				
				System.out.println(list);
				
				//add method
				list.add(30);
				System.out.println(list);
				
				//remove method
				list.remove(3);
				System.out.println(list);
				
				//size method
				System.out.println(list.size());
				
				//index of method
				System.out.println(list.indexOf(12));
				
				//is empty method
				System.out.println(list.isEmpty());
				
				//last index of list
				System.out.println(list.lastIndexOf(18));
				
				//get first element
				System.out.println(list.getFirst());
				
				//get last element
				System.out.println(list.getLast());
				
				//Sort the arrayList
				Collections.sort(list);
				System.out.println(list);
				
				//sort the list reverse order
				Collections.sort(list ,Collections.reverseOrder());
				System.out.println(list);
				
				//Lists to string conversion
				System.out.println(list.toString());
				
			}
}
