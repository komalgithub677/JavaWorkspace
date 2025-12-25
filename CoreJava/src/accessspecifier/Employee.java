package accessspecifier;

public class Employee {
             public int emp_id;
             
             public static void main(String[] args) {
				Employee e = new Employee();
				int emp_id = e.emp_id = 23;
				System.out.println("Employee id : " + emp_id);
			}
}
