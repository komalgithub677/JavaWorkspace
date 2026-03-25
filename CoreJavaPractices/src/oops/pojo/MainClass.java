package oops.pojo;

public class MainClass {
       public static void main(String[] args) {
    	College c = new College(1 , "Alard"  );
		Student s = new Student(123 ,"Komal" , "Pune" ,c);
		System.out.println(s);
	}
}
