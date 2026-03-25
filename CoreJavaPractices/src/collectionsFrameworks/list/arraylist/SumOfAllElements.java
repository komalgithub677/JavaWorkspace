package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;

public class SumOfAllElements {
               public static void main(String[] args) {
				ArrayList <Integer> list = new ArrayList();
				list.add(10);
				list.add(11);
				list.add(12);
				list.add(13);
				list.add(14);
				 
				int sum = 0;
				for(int i=0; i<list.size(); i++) {
					sum +=list.get(i);
				}
				System.out.println("Sum of elements : " + sum);
			}
}
