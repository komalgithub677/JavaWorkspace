package collectionsFrameworks.linkedlist;

import java.util.*;

public class SinglyLinkedList extends Node {

	
	
	SinglyLinkedList(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	Node head;
	
	//Insert at end
	void insert1(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next !=null) {
			temp =temp.next;
		}
		temp.next = newNode;
	}
	
	//Display
	void display1() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data + "->");
			temp =temp.next;
		}
		System.out.println("null");
	}
	
	//Delete first
	
	void deleteFirst1() {
		if(head!=null) {
			head = head.next;
		}
	}
	
	

	    // Insert at end
	    void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    // Display
	    void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    // Delete first
	    void deleteFirst() {
	        if (head != null) {
	            head = head.next;
	        }
	    }

	    // Search
	    boolean search(int key) {
	        Node temp = head;
	        while (temp != null) {
	            if (temp.data == key)
	                return true;
	            temp = temp.next;
	        }
	        return false;
	    }
	}


