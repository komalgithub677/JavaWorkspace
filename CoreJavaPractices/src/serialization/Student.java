package serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;
    int marks;
    transient String password;

    public Student(int rollNo, String name, int marks, String password) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.password = password;
    }
}