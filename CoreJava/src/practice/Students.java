package practice;

public class Students {
             int id;
             String name;
             
             public Students() {
            	 this(1 , "Komal");
            	 System.out.println("default construtor");
            	 
             }
             
             public Students(int id , String name) {
            	 this.id =id;
            	 this.name =name;
            	 System.out.println("Parameterized constructor");
             }
             
             public static void main(String[] args) {
				Students s = new Students();
				
			}
}
