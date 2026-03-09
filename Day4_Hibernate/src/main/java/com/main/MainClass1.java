package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student1;

public class MainClass1 {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student1.class);
        cfg.addAnnotatedClass(Course.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Student1 s1 = new Student1();
        s1.setName("Komal");

        Student1 s2 = new Student1();
        s2.setName("Pratik");

        Course c1 = new Course();
        c1.setCourseName("Java");

        Course c2 = new Course();
        c2.setCourseName("Hibernate");

        List<Course> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);

        s1.setCourses(list);
        s2.setCourses(list);

        ss.persist(s1);
        ss.persist(s2);

        tr.commit();
        ss.close();

        System.out.println("Data inserted successfully!");
    }
}