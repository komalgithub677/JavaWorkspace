package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeserialization {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println("Roll No: " + s.rollNo);
        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);
        System.out.println("Password: " + s.password); // Will print null

        ois.close();
        fis.close();
    }
}