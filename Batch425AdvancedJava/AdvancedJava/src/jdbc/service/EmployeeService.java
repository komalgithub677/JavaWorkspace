package jdbc.service;

import jdbc.dao.EmployeeDao;

public class EmployeeService {
             
	         public void insertData() throws Exception{
	        	 EmployeeDao sd = new EmployeeDao();
	        	 sd.insertData();
	         }
	         
	         public void deleteData() throws Exception{
	        	 EmployeeDao sd =new EmployeeDao();
	        	 sd.deleteData();
	         }
	         
	         public void updateData() throws Exception{
	        	 EmployeeDao sd = new EmployeeDao();
	        	 sd.fetchAllRecord();
	         }
}
