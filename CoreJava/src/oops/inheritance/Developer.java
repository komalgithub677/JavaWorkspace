package oops.inheritance;

public class Developer extends Company {
             public void sourceCode() {
            	 System.out.println("Have an access to the source code");
             }
             public void project() {
            	 System.out.println("Assign project modules");
             }
             public void developementToolsServers() {
            	 System.out.println("Have access to the developemt tools and servers");
             }
             public void bugList() {
            	 System.out.println("Bug list read only");
             }
             public static void main(String[] args) {
				Developer d = new Developer();
				d.empId();
				d.empSalary();
				d.sourceCode();
				d.project();
				d.developementToolsServers();
				d.bugList();
			}
}
