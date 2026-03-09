package com.main;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;


public class MainClass {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);
        cfg.addAnnotatedClass(Department.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        // Create Student and Laptop
        Department d =new Department();
        d.setDeptName("Java Developer");
        
        Employee e1 = new Employee();
        e1.setEmpId(111);
        e1.setEmpName("Komal");
        e1.setCity("Pune");
        

       List<Employee> list = new ArrayList<Employee>();

       // Cascade will save Laptop automatically

        ss.persist(d); 
        ss.persist(e1);
        d.setEmp(list);// Persist Student (Laptop saved automatically)

        tr.commit();
        ss.close();

        System.out.println("Employee and Department data inserted successfully!");
    }
}