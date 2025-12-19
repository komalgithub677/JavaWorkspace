package oops.abstraction;

public class Person implements Bank {
	          
	          @Override
              public void checkBalance() {
            	  System.out.println("Enter ur pin....");
            	  System.out.println("23346");
            	  System.out.println("Exit");
              }
	          
	          public static void main(String[] args) {
				Person p = new Person();
				p.checkBalance();
				
			}
}
