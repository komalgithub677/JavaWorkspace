package oops.contructor;

public class Student1Info {
             public static void main(String[] args) {
				Student1 s1 = new Student1();
				s1.setStudent_id(13);
                System.out.println("Student id of the student would be :" + s1.getStudent_id());
                s1.setStudentName("Komal");
                System.out.println("Student name of the student :" + s1.getStudentName());
			}
}
