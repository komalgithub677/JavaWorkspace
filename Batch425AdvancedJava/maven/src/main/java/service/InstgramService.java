package service;

import dao.InstagramDao;

public class InstgramService {
             public void insertData () throws Exception{
            	 InstagramDao sd = new InstagramDao();
            	 sd.insertData();
             }
             
             public void updateData () throws Exception{
            	 InstagramDao sd = new InstagramDao();
            		sd.updateData();
             }
             
             public void deleteData () throws Exception{
            	 InstagramDao sd = new InstagramDao();
            	 sd.deleteData();

             }
             
             public void fetchAllData () throws Exception{
            	 InstagramDao sd = new InstagramDao();
            	 sd.fetchAllRecord();
             }
}
