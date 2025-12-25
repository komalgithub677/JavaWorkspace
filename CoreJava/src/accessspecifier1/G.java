package accessspecifier1;

import accessspecifier.F;

public class G extends F {
             public static void main(String[] args) {
				G g = new G();
				int age = g.age = 20;
				System.out.println("Age of the person : " + age);
				String name = g.name = "Komal";
				System.out.println("Name of the Person : " + name);
	
				
			}
}
