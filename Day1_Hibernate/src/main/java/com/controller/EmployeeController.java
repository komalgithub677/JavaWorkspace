package com.controller;

import com.service.EmployeeService;

public class EmployeeController {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

//        service.insertData();
//        service.updateData();
//        service.getSingleRecord();
//        service.getAllRecords();
        service.deleteData();
    }
}