package conroller;

import service.FacebookService;

public class FacebookController {

	public static void main(String[] args) throws Exception {

		FacebookService ss = new FacebookService();
//		ss.insertData();
//		ss.updateData();
//		ss.deleteData();
		ss.fetchAllData();
	}

}