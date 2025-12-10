package oops.inheritance;

public class Developers extends Employee {
          public void writeCode() {
        	  System.out.println("Write code");
          }
          public void myTeam() {
        	  System.out.println("React Dev");
        	  System.out.println("Java developer");
        	  System.out.println("C++ developer");
          }
          public static void main(String[] args) {
			Developer d = new Developer();
			d.empId();
			d.empSalary();
		}       
}
