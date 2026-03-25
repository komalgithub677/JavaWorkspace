package oops.inheritance;

public class Tester extends Company {
        public void testing() {
        	System.out.println("Testing Environment");
        }
        public void tracking() {
        	System.out.println("Bug tracking System");
        }
        public void testCase() {
        	System.out.println("Test cases and test plans");
        }
        public static void main(String[] args) {
			 Tester t = new Tester();
			 t.empId();
			 t.empSalary();
			 t.tracking();
			 t.testing();
			 t.testCase();
		}
}
