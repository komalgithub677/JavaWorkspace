package oops.statickeyword;

public class Demo {
	
	         static String name="rahul";
	         int age;
	         String city;
	         
	         
	         //constructor
		        Demo(){
		        	System.out.println("Demo constructor");
		        }
	         
	         static {
	        	 System.out.println("This is static block");
	         }
	         
	         {
	        	 System.out.println("Non-static");
	         }
	        public static void display() {
	        	 System.out.println("This is Static Method");
	         }
	        
	       
             public static void main(String[] args) {
            	 Demo d = new Demo();
				    Demo.display();
				    
				    
				    
			}
}
