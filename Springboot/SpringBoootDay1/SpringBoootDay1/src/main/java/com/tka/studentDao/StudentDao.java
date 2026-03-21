package com.tka.studentDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entities.Student;

@Repository
public class StudentDao {
         @Autowired
         SessionFactory factory;
         
         public String insertData(Student s) {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 session.persist(s);
        	 session.close();
        	 tr.commit();
        	 
        	 return "Data is inserted";
        	 
         }
         public String deleteData(Student s) {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 session.persist(s);
        	 session.close();
        	 tr.commit();
        	 
        	 return "Data is deleted";
        	 
         }
         public String updateData(Student s) {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 session.persist(s);
        	 session.close();
        	 tr.commit();
        	 
        	 return "Data is updated";
        	 
         }
}
