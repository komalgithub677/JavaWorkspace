package oops.Polymorphism.overload;

public class Student {
	
             Student(int id){
            	 System.out.println("Id of the student would be : " + id );
             }
             
             Student(int id , String name){
            	 System.out.println("Id of the student would be : " + id);
            	 System.out.println("Name of the student would be : " + name);
             }
             
             public static void main(String[] args) {
				Student s = new Student(12);
				
				Student s1 = new Student(12 , "Komal Narawade");
			}
}
