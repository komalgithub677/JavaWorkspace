package collectionsFrameworks.list.arraylist;

import java.util.ArrayList;

public class ArrayListPractice {
              public static void main(String[] args) {
//            	  Write a program to create an ArrayList and add 5 integers.
            	  ArrayList<Integer> list = new ArrayList<>();
            	  
            	  list.add(10);
            	  list.add(12);
            	  list.add(14);
            	  list.add(15);
            	  list.add(20);
            	  list.add(21);
            	  
            	  System.out.println(list);
            	  
            	  for(int i=0; i<list.size(); i++) {
            		  System.out.println(list.get(i));
            	  }
            	  
            	  for(int nums : list) {
            		  System.out.println(nums);
            	  }
            	  
//            	  find size
            	  System.out.println("Size of the list : ");
            	  System.out.println(list.size());
            	  
//            	  maximum element from the list
            	  int max =list.get(0);
            	  
            	  for(int i=0; i<list.size(); i++) {
            		  if(list.get(i)>max) {
            			  max = list.get(i);
            		  }
            	  }
            	  
            	  System.out.println("Maximum elemnts : " + max);
            	  
//            	  Task 5: Find Minimum Element
//
//            	  👉 Task:
//
//            	  Find and print the minimum value in the ArrayList
            	  
            	  int min = list.get(0);
            	  
            	  for(int i=0; i<list.size(); i++) {
            		  if(list.get(i)<min) {
            			  min = list.get(i);
            		  }
            	  }
            	  
            	  System.out.println("Minimum elements : " + min);
            	  
//            	  Print only even numbers from the ArrayList
            	  
            	  for(int i=0; i<list.size(); i++) {
            		  if(list.get(i)%2==0) {
            			  System.out.println(list.get(i));
            		  }
            	  }
            	  
//            	  Task 7: Find Sum of All Elements
            	  int sum =0;
            	  for(int i=0; i<list.size(); i++) {
            		  sum +=list.get(i);
            	  }
            	  System.out.println("Sum of Elements : " + sum);
            	  
//            	  Task 8: Find Second Largest Element
            	  int max1 = Integer.MIN_VALUE;
            	  int max2 = Integer.MIN_VALUE;
            	  
            	  for(int i=0; i<list.size(); i++) {
            		  if(list.get(i)>max1) {
            			  max2 = max1;
            			  max1 = list.get(i);
            		  }
            		  else if(list.get(i)>max2 && max2<max1) {
            			  max2 = list.get(i);
            		  }
            	  }
            	  
            	  System.out.println("First maximum : " + max1);
            	  System.out.println("Second maximum : " + max2);
            	  
//            	  Task 9: Check Element Exists
            	  int search =15;
            	  if(list.contains(search)){
            		  System.out.println("Elements found in the list");
            	  }
            	  else {
            		  System.out.println("Element does not found in list");
            	  }
            	  
            	  list.remove(3);
            	  System.out.println("List after removing elements : ");
            	  System.out.println(list);
            	  
//            	  🔹 Task 11: Replace an Element
            	  list.replaceAll(null);
            	  System.out.println(list);
            	
            	  

            	
//
//            	  Write a program to print all elements of an ArrayList using:
//
//            	  for loop
//
//            	  enhanced for loop
//
//            	  iterator
//
//            	  Write a program to find the size of an ArrayList.
//
//            	  Write a program to get an element at a specific index.
//
//            	  Write a program to remove an element by:
//
//            	  index
//
//            	  value
//
//            	  Write a program to check whether an element exists in an ArrayList.
//
//            	  Write a program to clear all elements from an ArrayList.
			}
}
