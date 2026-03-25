package collectionsFrameworks.linkedlist;

import java.util.LinkedList;

public class LinkedDistDemo {
             public static void main(String[] args) {
				LinkedList<Integer> list = new LinkedList<>();
				//Adding the elements to the linked list
				list.add(10);
				list.add(11);
				list.add(13);
				list.add(14);
				list.add(15);
				
				System.out.println(list);
				
				//used to remove elements 
				list.remove();
				
				//used to add the element at first
				list.addFirst(10);
				
				//used to add the elements
				list.add(22);
				list.add(23);
				list.add(24);
				list.add(25);
				
				list.addLast(10);
				System.out.println(list);
				
			}
}
