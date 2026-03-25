package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;

public class MaxAndMin {
             public static void main(String[] args) {
				ArrayList <Integer> list = new ArrayList();
				
				list.add(10);
				list.add(11);
				list.add(12);
				list.add(13);
				list.add(14);
				
				
				
				int min =list.get(0);
				
				for(int i=0; i<list.size(); i++) {
					if(list.get(i)<min) {
						min = list.get(i);
					}
				}
				
				System.out.println("Min elements : " + min);
				
				int max =list.get(0);
				
				for(int j=0; j<list.size(); j++) {
					if(list.get(j)>max) {
						max = list.get(j);
					}
				}
				
				System.out.println("Max elements : " + max);
			}
}
