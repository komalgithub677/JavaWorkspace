package OOPS;

public class Student {
	//global variables
	int age;  //0
	String name;   //null
	String city;   
	float marks;   //0.0
	boolean isPassed;  //false
	char grade; //empty space = 32
	
	 public static void main(String[] args) {
//		 //object creation
//		 //ClassName objName = new ClassName();
		 Student stud = new Student();
////		 System.out.println(stud);
//		 int myAge = stud.age =24;
//		 String myCity = stud.city = "pune";
//		 char myGrade = stud.grade='A';
//		 boolean studentPassed = stud.isPassed =true;
//		 String name = stud.name="Komal";
//		 float studentMarks =  stud.marks=90.23f;
//		 long
//		 byte short
		 System.err.println("Student Details");
		 System.out.println("Student name : " + stud.name);
		 System.out.println("Student age = " + stud.age);
		 System.out.println("Student City = " + stud.city);
		 System.out.println("Student grade = " + stud.grade);
		 System.out.println("Student passed = " + stud.isPassed);
		 System.out.println("studentMarks = " + stud.marks);	 
	}
}
