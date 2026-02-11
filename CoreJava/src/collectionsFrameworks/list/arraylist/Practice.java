package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Practice {
             public static void main(String[] args) {
	         ArrayList <Integer> list = new ArrayList<>();
	         list.add(10);
	         list.add(11);
	         list.add(12);
	         list.add(13);
	         list.add(14);
	         list.add(15);
	         list.add(16);
	         list.add(17);
	         list.add(18);
	         
	         System.out.println(list);
	         
	         //iterating the arraylist
	         System.out.println("ArrayList");
	         
	         for(int i=0; i<list.size(); i++) {
	        	 System.out.println(list.get(i));
	         }
	         
	         System.out.println("For each loop");
	         //for-each Loop
	         for(int nums :list) {
	        	 System.out.println(nums);
	         }
	         
	         
	         System.out.println("iterating throught the Iterator");
	         //iterator
	         Iterator<Integer> it = list.iterator();
	         while(it.hasNext()) {
	        	 Integer num = it.next();
	        	 System.out.println(num);
	         }
	         
	         list.add(100);
	         
	         //safe removal using the iterator
	         Iterator<Integer> it = list.iterator();
	         
	         while(it.hasNext()) {
	        	 if(it.next()==20) {
	        		 it.remove();//Safe
	        	 }
	         }
	         
	         //ListIterator
	         ListIterator<Integer> li = list.listIterator();
	         
	         while(li.hasNext()) {
	        	 System.out.println(li.next());
	         }
	         //move forward or backward
	         //can add,remove , set elements safely
	         //has index Access methods
	         
	         //Reverse traversal
	         
	         while(li.hasPrevious()) {
	        	 System.out.println(li.previous());
	         }
	         
	         //Using Streams(Functional and Advanced)
	         list.stream()
	         .forEach(System.out::println);
	         
	         
	         
	         
	         Vector<Integer> vector = new Vector<>();
	         vector.add(14);
	         vector.add(15);
	         vector.add(16);
	         vector.add(17);
	         vector.add(18);
	         vector.add(19);
	         vector.add(19);
	         vector.add(13);
	         vector.add(10);
	         
	         System.out.println(vector);
	         
	         LinkedList<Integer> link = new LinkedList<>();
	         
	         link.add(34);
	         link.add(35);
	         link.add(38);
	         link.add(39);
	         link.add(33);
	         link.add(36);
	         link.add(38);
	         link.add(35);
	         link.add(36);
	         link.add(38);
	         
	         System.out.println(link);
	         
	         
	         
	         
	         
	         
}
}
