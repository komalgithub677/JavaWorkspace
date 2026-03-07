package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class MainClass {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Laptop.class);
        cfg.addAnnotatedClass(Student.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        // Create Student and Laptop
        Student s = new Student();
        s.setName("Komal");
        s.setCity("Pune");

        Laptop l = new Laptop();
        l.setName("HP Pavilion");

        s.setLaptop(l); // Cascade will save Laptop automatically

        ss.persist(s);  // Persist Student (Laptop saved automatically)

        tr.commit();
        ss.close();

        System.out.println("Laptop and Student data inserted successfully!");
    }
}