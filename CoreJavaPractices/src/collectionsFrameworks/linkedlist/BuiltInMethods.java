package collectionsFrameworks.linkedlist;

import java.util.LinkedList;

public class BuiltInMethods {
              public static void main(String[] args) {
				LinkedList <Integer> list = new LinkedList<>();
				
				
				list.add(10);
				list.addFirst(5);
				list.addLast(20);
				
				list.removeFirst();
				list.removeLast();
				
				System.out.println(list);
			}
}
