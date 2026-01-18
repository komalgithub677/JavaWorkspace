package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;

public class ReverseArrayList {
             public static void main(String[] args) {
		     ArrayList <Integer> list = new ArrayList();
		     
		        list.add(10);
				list.add(11);
				list.add(12);
				list.add(13);
				list.add(14);
		    System.out.println("Original ArrayList : ");
			System.out.println(list);
			
			System.out.println("Reverse ArrayList");
			int start =0;
			int last = list.size()-1;
			
			
				while(start<=last) {
					int temp = list.get(start);
					list.set(start, list.get(last));
			        list.set(last, temp);
			        start++;
			        last--;
				}
		
			
			System.out.println(list);
				
				
			}
}
