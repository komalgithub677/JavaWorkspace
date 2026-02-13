package service;

import dao.StudentDao;

public class StudentService {

    private StudentDao sd = new StudentDao();

    public void insertData(int id, String name, String city) throws Exception {
        sd.insertData(id, name, city);
    }

    public void updateData(int id, String newName) throws Exception {
        sd.updateData(id, newName);
    }

    public void deleteData(int id) throws Exception {
        sd.deleteData(id);
    }

    public void fetchAllData() throws Exception {
        sd.fetchAllRecord();
    }
}