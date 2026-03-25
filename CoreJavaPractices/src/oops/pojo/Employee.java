package oops.pojo;
//POJO
public class Employee {
             int empId;   //POJO class members/fields/Variables/attributes
             String empName;
             double empSalary;
             String city;
             
             public Employee() {  //No args constructor
            	 
             }
             
             public Employee(int empId , String empName , double empSalary , String city) {
            	//Args Constructor
            	 this.empId = empId;
            	 this.empName = empName;
            	 this.empSalary = empSalary;
            	 this.city = city;
            	 this.toString();
             }

			public int getEmpId() {//Generates public getters and setters
				return empId;
			}

			public void setEmpId(int empId) {
				this.empId = empId;
			}

			public String getEmpName() {
				return empName;
			}

			public void setEmpName(String empName) {
				this.empName = empName;
			}

			public double getEmpSalary() {
				return empSalary;
			}

			public void setEmpSalary(double empSalary) {
				this.empSalary = empSalary;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}
			
           //toString Using fields
			@Override
			public String toString() {
				return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", city="
						+ city + "]";
			}
			
			
			
			
			
}
