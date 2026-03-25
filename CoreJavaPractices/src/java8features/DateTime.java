package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTime {
             public static void main(String[] args) {
				LocalDate date = LocalDate.now();
				LocalTime time = LocalTime.now();
				LocalDateTime dt = LocalDateTime.now();
				
				System.out.println(date);
				System.out.println(time);
				System.out.println(dt);
				
				Period age = Period.between(LocalDate.of(2000, 1, 1), date);
				System.out.println(age.getYears());
			}
}
