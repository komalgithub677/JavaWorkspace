package collectionsFrameworks.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
             public static void main(String[] args) {
				LinkedList <Integer> l1 = new LinkedList<Integer>();
				
				l1.add(12);
				l1.add(13);
				l1.add(14);
				l1.add(15);
				l1.add(16);
				l1.add(17);
				
				System.out.println(l1.get(0));
				
				for(Integer w : l1) {
					System.out.println(w);
				}
				
//				Write code to add an element at the beginning of the LinkedList.
				l1.add(23);
				System.out.println(l1);
//
//				Write code to add an element at the end of the LinkedList.
				l1.add(24);
				System.out.println(l1);
//
//				How do you remove the first element?
				l1.remove(0);
				System.out.println(l1);
//
//				How do you remove the last element?
				l1.remove(l1.size()-1);
				System.out.println();
//
//				Write code to remove the element 15.
//
//				How do you check if 16 exists in the LinkedList?
//
//				How do you find the size of the LinkedList?
//
//				How do you clear all elements from the LinkedList?
//
//				What is the difference between remove() and removeFirst()?
//
//				What will peek() return?
				
			}
}
