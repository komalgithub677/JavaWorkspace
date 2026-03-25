package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseSortList {
             public static void main(String[] args) {
				ArrayList <Integer> list = new ArrayList();
				
				list.add(10);
				list.add(12);
				list.add(11);
				list.add(19);
				list.add(14);
				
				Collections.sort(list);
				
				int start = 0;
				int end = list.size()-1;
				
				while(start<end) {
					int temp = list.get(start);
					list.set(end, list.get(start));
					list.set(end, temp);
				}
				
				System.out.println(list);
				
			}
}
