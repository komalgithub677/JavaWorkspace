package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
             int empId;
             String name;
             int age;
             double salary;
             String city;
             
             
             public Employee(int empId , String name ,int age , double salary ,String city) {
            	 this.empId = empId;
            	 this.name = name;
            	 this.age = age;
            	 this.salary = salary;
            	 this.city = city;
             }
}
