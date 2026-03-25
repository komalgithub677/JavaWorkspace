package oops.Polymorphism.MethodOverride;

public class Manager extends Employee {
                     public void work() {
                    	 System.out.println("Manager Assign the work to the Employee");
                     }
                     
                     public static void main(String[] args) {
						Manager m = new Manager();
						m.work();
						
						Employee e = new Employee();
						e.work();
					}
}
