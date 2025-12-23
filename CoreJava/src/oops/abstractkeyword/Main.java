package oops.abstractkeyword;

public class Main {
             public static void main (String [] args) {
            	 Bank b;
            	 b = new SBI();
            	 b.pay();
            	 
            	 b = new Hdfc();
            	 b.pay();
            	 
             }
}
