package oops.inheritance;

public class HR extends Company {
             public void employeeDetails() {
            	 System.out.println("Has access to employee details ");
             }
             public void payrollSystem() {
            	 System.out.println("Has access to payroll system");
             }
             public void leaveManagement() {
            	 System.out.println("Has access to leave Management system");
             }
             public void recruitement() {
            	 System.out.println("Has access to the recruitment database");
             }
             public static void main(String[] args) {
				HR h = new HR();
				h.empId();
				h.employeeDetails();
				h.payrollSystem();
				h.recruitement();
				h.leaveManagement();
			}
}
