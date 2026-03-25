package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchForElement {
             public static void main(String[] args) {
//				ArrayList  list = new ArrayList();
//				list.add("Komal");
//				list.add(1234);
//				list.add(11.23);
//				list.add("Komal");
//				list.add(19.2333);
//				list.add(12657586968594l);
//				
//				System.out.println(list);
//				
//				list.size();
//				
//				System.out.println(list.size());
//				System.out.println();
            	 
            	 ArrayList list = new ArrayList();
            	 Iterable list1 = new ArrayList();
            	 Collection list2 = new ArrayList();
            	 
            	 //iterable methoad access only
            	 Iterable<Integer> list3 = new ArrayList<Integer>();
            	 
            	 //Access the iterable as well as collection methods
            	 Collection<Integer> list4 = new ArrayList<Integer>();
            	 
            	 //Access the list , collection , iterable methods
            	 List <Integer> list5 = new ArrayList<Integer>();
            	 
            	 //Access the arralist ,list,collection as well as iterable methods
            	 ArrayList<Integer> list6 = new ArrayList<Integer>();
            	 
            	 ArrayList <Integer> lis = new ArrayList();
 				lis.add(10);
 				lis.add(12);
 				lis.add(11);
 				lis.add(19);
 				lis.add(14);
            
            	 System.out.println(lis);
            	 
            	 Collections.sort(lis);
            	 System.out.println(lis);
            	 
            	 Collections.reverse(lis);
            	 System.out.println(lis);
            	 
            	 
            	 
            	 
            	 
            	 
            	 
			}
}
