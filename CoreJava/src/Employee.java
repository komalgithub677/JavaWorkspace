
public abstract class Employee {
	      protected double salary;
	      
	      public Employee(double salary) {
	    	  this.salary = salary;
	      }
	     
          public abstract double calculatedSalary();
          
          public void display() {
        	  System.out.println("Salary : " + calculatedSalary());
          }
         
}
