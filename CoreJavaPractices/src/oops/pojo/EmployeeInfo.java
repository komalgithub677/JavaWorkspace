package oops.pojo;

public class EmployeeInfo {
            public static void main(String[] args) {
				Employee e = new Employee();
				e.setEmpId(123);
				e.setEmpName("Komal");
				e.setEmpSalary(3000.00);
				e.setCity("Pune");
			    System.out.println(e);
//			    e.toString();
			}
}
