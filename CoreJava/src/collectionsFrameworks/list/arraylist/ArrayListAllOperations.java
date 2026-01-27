package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;

public class ArrayListAllOperations {
             public static void main(String[] args) {
				ArrayList<Integer> list = new ArrayList<>(); 
				
				list.add(10);
				list.add(12);
				list.add(13);
				list.add(14);
				list.add(15);
				list.add(18);
				
				System.out.println(list);
				
				//add method
				list.add(30);
				System.out.println(list);
			}
}
