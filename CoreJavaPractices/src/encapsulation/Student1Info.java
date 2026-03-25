package encapsulation;

public class Student1Info {
             public static void main(String[] args) {
				Student1 s = new Student1();
				s.setName("Komal");
				System.out.println("Name : " + s.getName());
				s.setrollNo(34);
				System.out.println("Roll No : " + s.getrollNo());
			}
}
