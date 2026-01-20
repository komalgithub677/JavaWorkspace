package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List2 {
             public static void main(String[] args) {
				List <Integer> list1 = new ArrayList<Integer>();
				
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				
				System.out.println(list1);
				
				//Iterator
				Iterator<Integer>itr = list1.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				
				//ListIterator
				ListIterator<Integer>litr = list1.listIterator();
				
				while(litr.hasNext()) {
					System.out.println(litr.next());
				}
				
				//hasPrevious
				while(litr.hasPrevious()) {
					System.out.println(litr.hasPrevious());
				}
 				
				//for each
				for(Integer  integer : list1 ) {
					System.out.println(integer);
				}
				
				List <Integer> list2 = new ArrayList<Integer>();
				
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				list1.add(10);
				
			    list2.addAll(list1);
			    System.out.println(list2);
				
				
			}
}
