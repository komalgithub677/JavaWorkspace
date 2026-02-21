package controller;

import Service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {

		StudentService ss = new StudentService();
//		ss.insertData();
//		ss.updateData();
//		ss.deleteData();
//		ss.fetchAllData();
		ss.dropData();
	}

}