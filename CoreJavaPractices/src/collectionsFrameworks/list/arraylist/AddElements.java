package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;

public class AddElements {
            public static void main(String[] args) {
				ArrayList <Integer> list = new ArrayList();
				
				
				//add 5 numbers to list
				list.add(4);
				list.add(2);
				list.add(3);
				list.add(5);
				list.add(6);
				list.add(7);
				
				System.out.println(list);
				
//				How do you find the size of an ArrayList?
				System.out.println(list.size());
//
//						Write a program to print all elements of an ArrayList.
				System.out.println(list);
//
//						Add an element at a specific index in an ArrayList.
				System.out.println(list.set(2, 23));
				System.out.println(list);
//
//						Remove an element by index from an ArrayList.
				System.out.println(list.remove(1));
				System.out.println(list);
//
//						Remove an element by value from an ArrayList.
				System.out.println(list.remove(Integer.valueOf(7)));
				System.out.println(list);
//
//						Check whether an ArrayList is empty or not.
				System.out.println(list.isEmpty());
//
//						Write a program to get an element at a given index.
				System.out.println(list.get(3));
//
//						Replace an element in an ArrayList using set().
				System.out.println(list.set(2, 34));
				System.out.println(list);
//
//						Clear all elements from an ArrayList.
				System.out.println(list.removeAll(list));
				System.out.println(list);
			}
}
