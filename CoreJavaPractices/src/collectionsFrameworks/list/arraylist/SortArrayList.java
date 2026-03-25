package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
             public static void main(String[] args) {
				ArrayList <Integer> list = new ArrayList();
				list.add(10);
				list.add(12);
				list.add(11);
				list.add(19);
				list.add(14);
				
				System.out.println("List before sorting : ");
				System.out.println(list);
				
				Collections.sort(list);
				
				System.out.println("List after sorting : ");
				System.out.println(list);
			}
}
