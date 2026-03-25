package encapsulation;

public class ManageInfo {
             public static void main(String[] args) {
			 Student s = new Student();
			 s.setRollNo(12);
			 System.out.println("Roll No :" + s.getRollNo());
			 s.setName("Komal Narawade");
			 System.out.println("Name:" + s.getName());
			 s.setAge(24);
			 System.out.println( "Age" +  s.getAge());
			}
}
