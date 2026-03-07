package com.service;

import com.dao.StudentDao;

public class StudentService {

    public void insertStudent(){
        StudentDao dao = new StudentDao();
        dao.insertStudent();
    }

    public void getAllStudents(){
        StudentDao dao = new StudentDao();
        dao.getAllStudents();
    }
}