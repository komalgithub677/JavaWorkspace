package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;




public class DeserialisationProcess {
        public static void main(String[] args) throws Exception{
            FileInputStream f = new FileInputStream("C:\\Users\\Shree\\Desktop\\KomalNarawade\\JavaMaterial\\employee.txt");
            ObjectInputStream ois = new ObjectInputStream(f);
            
            Employee e = (Employee) ois.readObject();
            
            System.out.println(e.empId + " " + e.name + " " + e.city);
            
            ois.close();
            f.close();
            
//            Employee e = (Employee) oos.
		}
}
