package practice;

public class AggregationHasATest {
            public static void main(String[] args) {
            	 Address a = new Address("Pune" , "Maharashtra");
                 
                 Student s = new Student(1 , "Komal" , a);
                 s.show();
			}
}
