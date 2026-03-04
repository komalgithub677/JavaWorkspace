package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
             public static void main(String[] args) {
            	//Even Numbers
				List<Integer> list = Arrays.asList(10,15,20,25);
				list.stream()
				    .filter(n-> n % 2 == 0)
				    .forEach(System.out::println);
				
				//odd numbers
				list.stream()
			    .filter(n-> n % 2 != 0)
			    .forEach(System.out::println);
				
				//Sum using reduce()
				List <Integer> list1 = Arrays.asList(1,2,3,4);
				int sum = list1.stream().reduce(0, Integer::sum);
				System.out.println(sum);
				
				//Max & Min
				List<Integer> list2  = Arrays.asList(5,10,2,8);
				int max = list.stream().max(Integer::compare).get();
				int min = list.stream().min(Integer::compare).get();
				System.out.println("Max : " + max + "  Min : " + min);
				
				//remove duplicates
				List<Integer>list3 = Arrays.asList(1,2,2,3,3,4);
				list3.stream().distinct().forEach(System.out::println);
				
				//Sort in asecending or descending order
				List<Integer> list4 = Arrays.asList(5,1,3,2);
				list4.stream().sorted().forEach(System.out::println);
				list4.stream().sorted((a,b) -> b-a).forEach(System.out::println);
				
				//Second Highest Element
				List<Integer> list5 = Arrays.asList(10,20,30,40);
				int second = list.stream()
						.sorted((a,b) -> b-a)
						.skip(1)
						.findFirst()
						.get();
				System.out.println(second);
				
				//Character frequency
				String str = "java";
				Map<Character , Long> map =
						str.chars()
						   .mapToObj(c-> (char)c)
						   .collect(Collectors.groupingBy(c-> c , Collectors.counting()));
				System.out.println(map);
				
				
				
				
			}
}
