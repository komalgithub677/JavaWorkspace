package service;

import dao.StudentDao;

public class StudentService {
       public void insertData() {
    	   StudentDao sd = new StudentDao();
    	   sd.insertData();
       }
}
