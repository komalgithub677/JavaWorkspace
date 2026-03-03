package service;

import dao.LibraryDao;

public class LibraryService {

	public void insertData() throws Exception {
		LibraryDao sd = new LibraryDao();
		sd.insertData();
	}

	public void updateData() throws Exception {
		LibraryDao sd = new LibraryDao();
		sd.updateData();
	}

	public void deleteData() throws Exception {
		LibraryDao sd = new LibraryDao();
		sd.deleteData();
	}

	public void fetchAllData() throws Exception {
		LibraryDao sd = new LibraryDao();
		sd.fetchAllRecord();
	}

}