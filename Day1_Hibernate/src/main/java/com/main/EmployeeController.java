package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class EmployeeController {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");//db connection information include in this file
	cfg.addAnnotatedClass(Employee.class);//Entity class added
	
	//code would be dependent from the nextLine
	SessionFactory sf =  cfg.buildSessionFactory();//Database connnecion started from this method
	Session ss = sf.openSession();//open session is the method of the session factory
	//session is an interface which is present in the org.hibernate package
	//which provides the built in methods
	Transaction tr = ss.beginTransaction();//return transaction
	
	Employee e = new Employee();
	e.setEmpID(115);
	e.setName("dham");
	e.setCity("Pune");
	e.setSalary(120000.20);
	
	System.out.println(e);
	
	//crud operation insert-save/persist
	//update :update/merge
	//delete :delete/remove
	//fetch : load/get
	
	//ss.save(e);
	ss.persist(e);
		
	tr.commit();
	ss.close();
	
	System.out.println("Data is inserted....!");
    }
}
