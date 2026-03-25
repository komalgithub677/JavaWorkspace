package practice;

public class Test {
             public static void main(String[] args) {
            	double age = 32.45;
				try {
					if(age<18 || age%1!=0 ) {
						throw new InvalidAgeException("age > 18 && age should be a whole number " );
					}
					System.out.println("age :" + age);
				}
				catch(InvalidAgeException e ) {
					System.out.println(e.getMessage());
				}
			}
}
