package oops.Polymorphism.MethodOverride;

public interface MethodOverride2 {
                 public void eat();
                 //abstract methods
                 //by default public or abstract
                 //default method-belongs to the interface only cannot be overriden
                 //use default keyword
                 
                 default void start() {
                	 System.out.println("Vehicle is starting");
                 }
                 
                 //static methods
                 //belong to the interface itself
                 //cannot be overriden
                 //callled using the interface name
                 
                 static void add(int a ,int b) {
                	 System.out.println(a + b);
                 }
}
