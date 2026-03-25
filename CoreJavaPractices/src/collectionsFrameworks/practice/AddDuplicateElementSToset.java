package collectionsFrameworks.practice;

import java.util.HashSet;

public class AddDuplicateElementSToset {
             public static void main(String[] args) {
//            	 Try to add duplicate elements in a Set and observe the output.
				HashSet set = new HashSet<>();
				
				set.add("Komal");
				set.add("Komal");
				set.add("Sonali");
				set.add("Disha");
				set.add("Sakshi");
				set.add("Priya");
				
				//When we add the duplicate values it does not take the duplicate values
				//Return only the unique values
				System.out.println(set);
				
				
			}
}
