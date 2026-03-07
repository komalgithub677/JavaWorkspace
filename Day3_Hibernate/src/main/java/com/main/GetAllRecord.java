package com.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Employee;

public class GetAllRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlQuery = "From Employee";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
        query.setParameter("id" , 3);
        query.executeUpdate();
        
       System.out.println("Data is deleted");
		
//		String hqlQuery = "from Employee";
//		Query query = ss.createQuery(hqlQuery , Employee.class);
//		query.get
		tr.commit();
		ss.close();
	}	
}