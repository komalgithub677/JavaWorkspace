package java8features;

import java.util.Arrays;
import java.util.List;

public class Map {
             public static void main(String[] args) {
				List<Integer> list = Arrays.asList(1,2,3);
				
				list.stream()
				    .map(n->n*n)
				    .forEach(System.out::println);
			}
}
