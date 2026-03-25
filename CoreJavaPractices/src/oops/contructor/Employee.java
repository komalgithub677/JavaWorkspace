package oops.contructor;

public class Employee {
              int empId;
              String name;
              String salary;
              String city;
              
//           void m1(int empId ,String name ,String salary , String city){
//            	  this.empId =empId;
//            	  this.name=name;
//            	  this.salary=salary;
//            	  this.city=city;
//            }
              
          void view() {
        	  System.out.println("This is a method view");
          }
              
           Employee(){
        	   System.out.println("This is a non-parameterised constructor");
           }
           
           Employee(int a){
        	   
           }
           
           //When we give the return type to the constructor then that become method
           void  Employee(){
        	   System.out.println();
           }
           
           //Initialisation of objects would be done throught the constructor
           Employee(int empId ,String name ,String salary , String city){
         	  this.empId =empId;
         	  this.name=name;
         	  this.salary=salary;
         	  this.city=city;
         	  display();
         }
           
          //Print the logic entity
           void display() {
        	   System.out.println(empId);
        	   System.out.println(name);
        	   System.out.println(salary);
        	   System.out.println(city);
           }
}
