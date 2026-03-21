package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.UserDao;
import com.tka.entities.User;

@Service
public class UserService {
	@Autowired
	UserDao dao;
       
	public String insertData(User u) {
		String msg = dao.insertData(u);
		return msg;
	}
	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}
	public String updateData(User u ,int id) {
		String msg = dao.updateData(u ,id);
		return msg;
	}
	public List<User> getAllData() {
		List<User> msg = dao.getAllData();
		return msg;
	}
	
	public User getSingleRecord(int id) {
		User u1 = dao.getSingleRecord(id);
		return u1;
	}
}
