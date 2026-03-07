package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class EmployeeDao {

	// INSERT DATA
	public void insertData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setName("Dham");
		e.setCity("Pune");
		e.setEmail("dham@gmail.com");
		e.setSalary(120000);

		ss.save(e);

		tr.commit();
		ss.close();

		System.out.println("Data Inserted Successfully");
	}

	
	// DELETE DATA
	public void deleteData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;

		Employee e = ss.get(Employee.class, id);

		if (e != null) {
			ss.remove(e);
			System.out.println("Data Deleted Successfully");
		} else {
			System.out.println("Employee Not Found");
		}

		tr.commit();
		ss.close();
	}

	
	// UPDATE DATA
	public void updateData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 1;

		Employee e = ss.get(Employee.class, id);

		if (e != null) {

			e.setName("Om");
			e.setCity("Mumbai");
			e.setEmail("om@gmail.com");
			e.setSalary(50000);

			ss.merge(e);

			System.out.println("Data Updated Successfully");

		} else {
			System.out.println("Employee Not Found");
		}

		tr.commit();
		ss.close();
	}

	
	// GET SINGLE RECORD
	public void getSingleRecordData() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		int id = 1;

		Employee e = ss.get(Employee.class, id);

		if (e != null) {
			System.out.println("Employee Details:");
			System.out.println(e);
		} else {
			System.out.println("Employee Not Found");
		}

		ss.close();
	}

	
	// GET ALL RECORDS
	public void getAllRecords() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Query<Employee> query = ss.createQuery("from Employee", Employee.class);

		List<Employee> list = query.list();

		System.out.println("All Employee Records:");

		for (Employee e : list) {
			System.out.println(e);
		}

		ss.close();
	}

}