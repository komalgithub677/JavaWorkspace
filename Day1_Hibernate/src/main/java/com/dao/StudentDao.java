package com.dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class StudentDao {

    public void insertStudent(){

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Student s = new Student();
        s.setName("Komal");
        s.setCourse("Java");
        s.setMarks(90);

        ss.save(s);

        tr.commit();
        ss.close();

        System.out.println("Student Inserted");
    }

    public void getAllStudents(){

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();

        Query<Student> q = ss.createQuery("from Student",Student.class);

        List<Student> list = q.list();

        for(Student s:list){
            System.out.println(s);
        }

        ss.close();
    }
}