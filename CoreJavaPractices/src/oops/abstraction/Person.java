package oops.abstraction;

public  class Person implements Bank {
	          
	          public int checkBalance() {
	        	  return 12345;
	          }
	          
	          
	          
	          public static void main(String[] args) {
				Person p = new Person();
				p.checkBalance();	
			}



			@Override
			public void checkBalance(String pin) {
				// TODO Auto-generated method stub
				
			}
}
