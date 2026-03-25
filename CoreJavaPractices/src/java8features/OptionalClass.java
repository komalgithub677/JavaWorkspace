package java8features;

import java.util.Optional;

public class OptionalClass {
             public static void main(String[] args) {
				Optional<String> name = Optional.ofNullable(null);
				System.out.println(name.orElse("Default name"));
				
			}
}
