package OOPS;

public class Employees {
             //Create a class CompanyEmployee with name, salary, department. Create 6 objects & print:

//employee with highest salary
//
//total salary of all employees
//
//employees working in same department
	         String name;
	         double salary;
	         String department;
	         
	         public static void main(String[] args) {
				
	        	 //First object creation from the class Employees
	        	 Employees e1 = new Employees();
	        	 
	        	 String name1 =e1.name =" Komal";
	        	 String department1 = e1.department ="Development";
	        	 double salary1 = e1.salary = 100000.00;
	        	 
	        	 System.err.println("Employee 1 Details : ");
	        	 System.out.println("Employee Name : " + name1);
	        	 System.out.println("Employee Department : " + department1);
	        	 System.out.println("Employee Salary : " + salary1);
	        	 
	        	 //Second Object Creation from the class Employees
	        	 
	        	 Employees e2 = new Employees();
	        	 
	        	 String name2 =e2.name ="Prachi";
	        	 String department2 = e2.department ="HR";
	        	 double salary2 = e2.salary = 150000.00;
	        	 
	        	 System.err.println("Employee 2 Details : ");
	        	 System.out.println("Employee Name : " + name2);
	        	 System.out.println("Employee Department : " + department2);
	        	 System.out.println("Employee Salary : " + salary2);
	        	 
                //Third Object Creation from the class Employees
	        	 
	        	 Employees e3 = new Employees();
	        	 
	        	 String name3 =e3.name ="Deepali";
	        	 String department3 = e3.department ="Finance";
	        	 double salary3 = e3.salary = 90000.00;
	        	 
	        	 System.err.println("Employee 3 Details : ");
	        	 System.out.println("Employee Name : " + name3);
	        	 System.out.println("Employee Department : " + department3);
	        	 System.out.println("Employee Salary : " + salary3);
	        	 
                //Fourth Object Creation from the class Employees
	        	 
	        	 Employees e4 = new Employees();
	        	 
	        	 String name4 =e4.name ="Akash";
	        	 String department4 = e4.department ="Finance";
	        	 double salary4 = e4.salary = 60000.00;
	        	 
	        	 System.err.println("Employee 4 Details : ");
	        	 System.out.println("Employee Name : " + name4);
	        	 System.out.println("Employee Department : " + department4);
	        	 System.out.println("Employee Salary : " + salary4);
	        	 
               //Fifth Object Creation from the class Employees
	        	 
	        	 Employees e5 = new Employees();
	        	 
	        	 String name5 =e5.name ="Priya";
	        	 String department5 = e5.department ="HR";
	        	 double salary5 = e5.salary = 150000.00;
	        	 
	        	 System.err.println("Employee 5 Details : ");
	        	 System.out.println("Employee Name : " + name5);
	        	 System.out.println("Employee Department : " + department5);
	        	 System.out.println("Employee Salary : " + salary5);
	        	 
                 //Sixth Object Creation from the class Employees
	        	 
	        	 Employees e6 = new Employees();
	        	 
	        	 String name6 =e6.name ="Prapti";
	        	 String department6 = e6.department ="HR";
	        	 double salary6 = e6.salary = 150000.00;
	        	 
	        	 System.err.println("Employee 6 Details : ");
	        	 System.out.println("Employee Name : " + name6);
	        	 System.out.println("Employee Department : " + department6);
	        	 System.out.println("Employee Salary : " + salary6);
	        	 
	        	 Employees emp[] = {e1 ,e2 ,e3 ,e4 ,e5 ,e6};
	        	//employee with highest salary
	        	 Employees highest = emp[0];
	        	 for(Employees e : emp) {
	        		 if(e.salary >highest.salary) {
	        			 highest =e;
	        		 }
	        	 }
	        	 //
	        	 //total salary of all employees
	        	 double totalSalary = 0;
	        	 for(Employees e : emp) {
	        		 totalSalary += e.salary;
	        	 }
	        	 
	        	 //
	        	 //employees working in same department
	        	 System.out.println("Employees Group by Department");
	        	 for(int i=0; i<emp.length; i++) {
	        		 for(int j=i+1; j<emp.length; j++) {
	        			 if(emp[i].department.equals(emp[j])) {
	        				 System.out.println(emp[i].name + "name" + emp[j].name + "Work in" + emp[i].department);
	        			 }
	        		 }
	        	 }
	        	 
	        	 System.out.println("Highest Salary :" + highest.name + "(" + highest.salary + ")");
	        	 System.out.println("Total Salary of Employees : " + totalSalary);	 
	        	 
			}
}
