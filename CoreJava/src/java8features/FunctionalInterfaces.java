package java8features;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class FunctionalInterfaces {
        public static void main(String[] args) {
        	//predicate filter even number
        	List<Integer> list =Arrays.asList(1,2,3,4,5);
            list.stream()
                .filter(n -> n % 2 ==0)
                .forEach(System.out::println);
            
            //Function (String Length)
            Function<String ,Integer> f = s-> s.length();
            System.out.println(f.apply("Komal"));
            
            //Consumer
            Consumer<String> c = name -> System.out.println(name);
            c.accept("Komal");
            
            //Supplier
            Supplier<Integer> otp = () -> new Random().nextInt(1000);
            System.out.println(otp.get());
            
            //Bipredicate
            BiPredicate<String ,String> bp = (a,b) ->a.equals(b);
            System.out.println(bp.test("Hi" , "Hi"));
            
           
		}
            
   }
