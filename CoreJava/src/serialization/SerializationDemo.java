package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
             public static void main(String[] args) throws IOException {
				Employee e = new Employee(123 ,"Komal" ,22 , 100000, "pune");
				FileOutputStream f = new FileOutputStream("C:\\Users\\Shree\\Desktop\\KomalNarawade\\JavaMaterial\\employee.txt");
				ObjectOutputStream oos = new ObjectOutputStream(f);
				oos.writeObject(e);//create //insert operation done
				
				oos.close();
				f.close();
				
				System.out.println("Your file is created");
			}
}
