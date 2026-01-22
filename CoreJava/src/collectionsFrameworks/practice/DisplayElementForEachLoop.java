package collectionsFrameworks.practice;

import java.util.ArrayList;

public class DisplayElementForEachLoop {
//	Write a program to display all elements of a List using for-each loop
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(23);
		list.add(24);
		list.add(35);
		list.add(46);
		
		for(Integer nums : list) {
			System.out.println(nums);
		}
	}
}
