
public class JavaPractice {
       int id;
       String name;
       String city;
       
       static String college = "Alard";
       
       
       void display() {
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
