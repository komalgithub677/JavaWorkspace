package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentRepository;
import com.tka.entities.Student;

@Service
public class StudentService {
	@Autowired
       StudentRepository repo;
	
	public String insertData(Student s) {
		repo.save(s);
		return "Data is inserted";
	}

	public List<Student> getAllData() {
		return repo.findAll();
		
	}
//	public Optional<Student> getSingleData(int id) {
//		return repo.findById(id);
//		
//	}

	public Optional<Student> getSingleData(int studId) {
		return repo.findById(studId);
		
	}
	public String deleteData(int id) {
		repo.deleteById(id);;
		return "Data is deleted";
	}
	public String updateData(Student s, int id) {
		Student s1 = repo.getById(id);
		s1.setName(s.getName());
		return "Data is updated";
	}
}




