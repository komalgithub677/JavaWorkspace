package service;

import dao.FaceBookDao;

public class FacebookService {

	public void insertData() throws Exception {
		FaceBookDao sd = new FaceBookDao();
		sd.insertData();
	}

	public void updateData() throws Exception {
		FaceBookDao sd = new FaceBookDao();
		sd.updateData();
	}

	public void deleteData() throws Exception {
		FaceBookDao sd = new FaceBookDao();
		sd.deleteData();
	}

	public void fetchAllData() throws Exception {
		FaceBookDao sd = new FaceBookDao();
		sd.fetchAllRecord();
	}

}