package collectionsFrameworks.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Vectors {
public static void main(String[] args) {
	Vector <String> v = new Vector<String>();
	v.add("Java");
	v.add("Python");
	v.add("C++");
	v.add("C");
	v.add("Javascript");
	
	System.out.println(v);
	
	List<Integer> list = new Vector<Integer>();
	
	list.add(10);
	list.add(15);
	list.add(17);
	list.add(10);
	list.add(18);
	list.add(19);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Iterator<Integer> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	ListIterator<Integer> itra = list.listIterator();
	while(itra.hasNext()) {
		System.out.println(itra.next());
	}
	
	//enumeration
	Enumeration <Integer> e = ((Vector<Integer>) list).elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	//for esch loop
	for(Integer i : list) {
		System.out.println(i);
	}
	
	
}
}
