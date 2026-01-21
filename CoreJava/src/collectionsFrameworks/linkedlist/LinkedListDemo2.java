package collectionsFrameworks.linkedlist;

public class LinkedListDemo2 {
             public static void main(String[] args) {
				SinglyLinkedList list = new SinglyLinkedList(20);
				
				list.insert(10);
				list.insert(20);
				list.insert(30);
				
				list.display();
				list.deleteFirst();
				list.display();
				System.out.println(list.search(30));
			}
}
