package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerialization {

    public static void main(String[] args) throws Exception {

        Student s = new Student(101, "Komal", 95, "secret123");

        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);

        oos.close();
        fos.close();

        System.out.println("Student object serialized successfully!");
    }
}