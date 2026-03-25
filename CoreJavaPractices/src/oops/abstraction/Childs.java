package oops.abstraction;

public class Childs implements Father , Mother{
             public void values() {
            	 System.out.println("Father Teaches Honesty ,Dicipline , respect , Hard Work");
             }
             
             public void  cooking() {
            	 System.out.println("Mother teaches to cook Food");
             }
             
             public static void main(String[] args) {
				Childs c = new Childs();
				c.cooking();
				c.values();
			 }
}






