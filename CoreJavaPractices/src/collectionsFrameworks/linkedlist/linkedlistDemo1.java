package collectionsFrameworks.linkedlist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class linkedlistDemo1 {
             public static void main(String[] args) {
            	 
            	     LinkedList<Integer>list = new LinkedList();

            		Iterator<Integer> itr = list.iterator();
            		while(itr.hasNext()) {
            			System.out.println(itr.next());
            		}
            		
            		ListIterator<Integer> itra = list.listIterator();
            		while(itra.hasNext()) {
            			System.out.println(itra.next());
            		}
            		
//            		//enumeration
//            		Integer e = list.element();
//            		while(e.hasMoreElements) {
//            			System.out.println(e.nextElement());
//            		}
            		
            		//for each loop
            		for(Integer i : list) {
            			System.out.println(i);
            		}
            		
			}
}
