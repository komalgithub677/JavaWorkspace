package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entities.Student;
import com.tka.studentDao.StudentDao;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;
       
	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}
}
