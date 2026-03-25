package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer> {

}
