package practice;

public class Dog1 extends Animal1{
	        @Override
            public void sound() {
            	System.out.println("Dogs bark");
            }
	        
	        static void show() {
	        	System.out.println("This is child class method");
	        }
	        public static void main(String[] args) {
				Dog1 d1 = new Dog1();
				d1.sound();
				d1.show();
				
			}
}
