package accessspecifier;

public class Child extends Parent{
                   public void salary() {
                	   System.out.println("Salary : " + salary);
                   }
                   
                   public static void main(String[] args) {
					Child c = new Child();
					double salary = c.salary = 30000;
					System.out.println("Salary : "+ salary);
				}
}
