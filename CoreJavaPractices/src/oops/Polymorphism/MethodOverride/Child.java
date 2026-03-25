package oops.Polymorphism.MethodOverride;

public class Child extends Parent{
             public int display() {
//            	 System.out.println("This is child class");
            	 return 234;
             }
             
            public  Child (){
            	 System.out.println("this is a child class");
             }
             public static void main(String[] args) {
            	Parent p = new Parent();
            	p.display();
				Child c = new Child();
				c.display();
			}
}
