package conroller;

import service.LibraryService;

public class LibraryController {

	public static void main(String[] args) throws Exception {

		LibraryService ss = new LibraryService();
//		ss.insertData();
//		ss.updateData();
//		ss.deleteData();
		ss.fetchAllData();
	}

}