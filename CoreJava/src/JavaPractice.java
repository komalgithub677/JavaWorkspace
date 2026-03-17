
public class JavaPractice {
	//which are declared inside a class and the outside the methods
       int id;
       String name;
       String city;
       
       //which are declared inside the class but 
       //this are the class level if we have to access this variable or call this variable we can call 
       //that only with the class name
       static String college = "Alard";
       
       
       void display() {
    	   //local variables which are delclared inside the method 
    	   //we cannot declared this variables without a value 
    	   //we have to initialized the some value to the variables 
    	   int a =10;
    	   System.out.println(a);
       }
       
       public static void main(String[] args) {
		JavaPractice p = new JavaPractice();
		System.out.println(p.id);
		System.out.println(p.city);
		System.out.println(p.name);
		String c = JavaPractice.college;
		System.out.println(c);
		p.display();
}
}
