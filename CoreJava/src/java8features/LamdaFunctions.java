package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamdaFunctions {
             public static void main(String[] args) {
				Runnable r = ()->System.out.println("Thread Running....");
				new Thread(r).start();
				
				//Lambda expression with parameter
				Consumer<String> greet = name->
				System.out.println("Hello" + name);
				
				greet.accept("Komal");
				
				//Lamda with two parameters(BiFunction)
				BiFunction<Integer , Integer , Integer> add=(a,b) ->(a+b);
				System.out.println("Sum : " + add.apply(10, 20));
				
				//Lamda with comparator
				List<String> names = Arrays.asList("Komal" ,"Amit","Zara");
				names.sort((a,b) -> a.compareTo(b));
				System.out.println(names);
				
				//Lambda with Stream API
				List<Integer> numbers = Arrays.asList(10,15,20,25,30);
				
				numbers.stream()
				       .filter(n->n%2==0)
				       .forEach(n->System.out.println(n));
				
				//print list using lambda function
				List<Integer>list = Arrays.asList(1,2,3);
				list.forEach(n->System.out.println(n));
				
				//Check even Odd number
				Predicate<Integer> p = n->n%2==0;
				System.out.println(p.test(10));
					
			}
             
             
}
