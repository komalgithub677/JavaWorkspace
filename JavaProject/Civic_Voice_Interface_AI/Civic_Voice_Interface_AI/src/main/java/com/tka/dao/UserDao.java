package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.tka.entities.User;

import jakarta.persistence.Query;

@Repository
public class UserDao {
         @Autowired
         SessionFactory factory;
         
         public String insertData(User u) {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 session.persist(u);
        	 session.close();
        	 tr.commit();
        	 
        	 return "Data is inserted";
        	 
         }
         public String deleteData(int id) {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 User u =session.get(User.class, id);
        	 session.remove(u);
        	 session.close();
        	 tr.commit();
        	 
        	 return "Data is deleted";
        	 
         }
         public String updateData(User s ,int id) {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 User usr =session.get(User.class, id);
        	 usr.setFullName(usr.getFullName());
        	 usr.setEmail(usr.getEmail());
        	 usr.setPassword(usr.getPassword());
        	 usr.setPhoneNumber(usr.getPhoneNumber());
        	 usr.setAddress(usr.getAddress());
        	 usr.setCity(usr.getCity());
        	 usr.setState(usr.getState());
        	 usr.setPincode(usr.getPincode());
        	 usr.setRole(usr.getRole());
        	 usr.setActive(usr.isActive());
        	 usr.setCreatedAt(usr.getCreatedAt());
        	 session.merge(usr);
        	 session.close();
        	 tr.commit();
        	 
        	 return "Data is updated";
        	 
         }
         
         public List<User> getAllData() {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 String hqlQuery = "From User";
        	 Query query = session.createQuery(hqlQuery);
        	 List<User> list = query.getResultList();
        	 session.close();
        	 tr.commit();
        	 
			 return list;	 
         }
         
         public User getSingleRecord(int id) {
        	 Session session = factory.openSession();
        	 Transaction tr = session.beginTransaction();
        	 
        	 String hqlQuery = "From User where id =: id";
        	 Query query = session.createQuery(hqlQuery);
        	 query.setParameter("id" , id);
        	 User s1 = (User) query.getSingleResult();
        	
        	 session.close();
        	 tr.commit();
        	 return s1;
        		 
         }
}
