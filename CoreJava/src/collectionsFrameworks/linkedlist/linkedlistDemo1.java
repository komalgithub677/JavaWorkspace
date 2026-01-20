package collectionsFrameworks.linkedlist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class linkedlistDemo1 {
             public static void main(String[] args) {

            		Iterator<Integer> itr = list.iterator();
            		while(itr.hasNext()) {
            			System.out.println(itr.next());
            		}
            		
            		ListIterator<Integer> itra = list.listIterator();
            		while(itra.hasNext()) {
            			System.out.println(itra.next());
            		}
            		
            		//enumeration
            		Enumeration <Integer> e = ((Vector<Integer>) list).elements();
            		while(e.hasMoreElements()) {
            			System.out.println(e.nextElement());
            		}
            		
            		//for esch loop
            		for(Integer i : list) {
            			System.out.println(i);
            		}
            		
			}
}
