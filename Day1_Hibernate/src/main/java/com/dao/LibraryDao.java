package com.dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Library;

public class LibraryDao {

    public void insertBook(){

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Library.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();

        Library b = new Library();
        b.setBookName("Java Programming");
        b.setAuthor("James Gosling");
        b.setPrice(500);

        ss.save(b);

        tr.commit();
        ss.close();

        System.out.println("Book Inserted");
    }

    public void getAllBooks(){

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Library.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();

        Query<Library> q = ss.createQuery("from Library",Library.class);

        List<Library> list = q.list();

        for(Library b:list){
            System.out.println(b);
        }

        ss.close();
    }
}