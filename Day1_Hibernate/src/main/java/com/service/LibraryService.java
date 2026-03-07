package com.service;

import com.dao.LibraryDao;

public class LibraryService {

    public void insertBook(){
        LibraryDao dao = new LibraryDao();
        dao.insertBook();
    }

    public void getAllBooks(){
        LibraryDao dao = new LibraryDao();
        dao.getAllBooks();
    }
}