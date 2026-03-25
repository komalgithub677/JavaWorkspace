package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CreationOfList {
      public static void main(String[] args) {
//    	  Write a program to create a List and add elements to it.
    	  ArrayList<Integer> list = new ArrayList<Integer>();
    	  
    	  list.add(10);
    	  list.add(12);
    	  list.add(14);
    	  list.add(45);
    	  list.add(23);
    	  
    	  System.out.println("Your arrayList : ");
    	  System.out.println(list);
    	  
//    	  Write a program to add, remove, and update elements in ArrayList.
    	  list.add(20);
    	  System.out.println(list);
    	  
    	  System.out.println("List after printing elements : ");
    	  list.remove(3);
    	  System.out.println(list);
    	  
    	  System.out.println("List after updating elements : ");
    	  list.add(2, 67);
    	  System.out.println(list);
    	  
//    	  Write a program to remove an element from List by:
//
//    		  index
    	  System.out.println("Removing elements by index");
    	  list.remove(1);
    	  System.out.println(list);
    	  
    	  System.out.println("Removing elements by index :");
    	  list.remove(1);
    	  System.out.println(list);
    	  
//    	  Write a program to check whether an element exists in a List.
    	  list.contains(23);
    	  System.out.println(list.contains(23));
    	  
//    	  Write a program to find the size of a List.
    	  System.out.println(list.size());
    	  
//    	  Write a program to clear all elements from a List.
    	  System.out.println(list.size());
    	  
//    	  Write a program to find maximum and minimum elements in a List.
    	 int max = list.get(0);
    	 int min = list.get(0);
    	  for(int i=0; i<list.size(); i++) {
    		 if(list.get(i)>max) {
    			 max = list.get(i);
    		 }
    		 
    		 if(list.get(i)<min) {
    			 min = list.get(i);
    		 }
    		 
    	  }
    	  
    	  System.out.println(min);
    	  System.out.println(max);
    	  
//    	  Write a program to sort an ArrayList.
    	  Collections.sort(list);
    	  System.out.println(list);
    	  
//    	  Write a program to reverse a List.
    	 
    	  System.out.println( list.reversed());
//
//    	  Write a program to find second largest element in a List.
    	  int max1 = Integer.MIN_VALUE;
    	  int max2 = Integer.MIN_VALUE;
    	  
    	  for(int i=0; i<list.size(); i++) {
    		  int current = list.get(i);
    		  
    		  if(current>max1) {
    			  max2 = max1;
    			  max1 = current;
    		  }
    		  else if(current>max2 && (max1>max2)) {
    			  max2 = current;
    		  }
    		  
    		  System.out.println(max1);
    		  System.out.println(max2);
    	  }
//
//    	  Write a program to remove duplicate elements from a List.
//
//    	  Write a program to convert a List into a Set.
//
//    	  Write a program to convert a List into an Array.
//
//    	  Write a program to iterate List in reverse order using ListIterator.
//
//    	  Write a program to create an immutable List.
    	  
//
//    		  value
	}
}
