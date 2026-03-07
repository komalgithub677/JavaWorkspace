package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class GetSingleRecord {

public static void main(String[] args) {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tr = ss.beginTransaction();
//select * from employee where id =3;
//	String hqlQuery = "From Employee where id = : id";
//	Query<Employee> query = ss.createQuery(hqlQuery , Employee.class);
//	query.setParameter("id" ,3);
//	
//	
//    Employee e =query.getSingleResult();
//	String hqlQuery = "From Employee where id = : id";
//	org.hibernate.query.Query<Employee> query = ss.createQuery(hqlQuery , Employee.class);
//    query.setParameter("id", 3);
//    
//   
//	Employee e =query.uniqueResult();
	
	String hqlQuery = "from Employee";
	Query query1 = ss.createQuery(hqlQuery , Employee.class);
	query1.setParameter("id" ,3);
	Employee e1 = (Employee) query1.getSingleResult();
	System.out.println(e1);
	tr.commit();
	ss.close();
}
		


}
