package com.controller;

import com.service.StudentService;

public class StudentController {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.insertStudent();
        service.getAllStudents();
    }
}