package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;

public class CountOddAndEven {
//	Count even and odd numbers in an ArrayList.
             public static void main(String[] args) {
				ArrayList <Integer> list = new ArrayList();
				list.add(10);
				list.add(11);
				list.add(12);
				list.add(13);
				list.add(14);
				
				int evenCount = 0;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i)%2==0) {
						evenCount++;
					}
				}
				System.out.println("EvenCount :" + evenCount);
				
				int oddCount =0;
				
				for(int j=0; j<list.size(); j++) {
					if(list.get(j)%2!=0) {
						oddCount++;
					}
				}
				
				System.out.println("OddCount : " + oddCount);
				
			}
}
