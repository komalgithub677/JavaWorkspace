
public class DataTypesDay2 {
       public static void main(String[] args) {
    	// Data types size in bits
       	System.out.println(Byte.SIZE +"bits");
       	System.out.println(Short.SIZE +"bits");
       	System.out.println(Integer.SIZE +"bits");
       	System.out.println(Long.SIZE +"bits");
       	System.out.println(Float.SIZE +"bits");
       	System.out.println(Double.SIZE +"bits");
       	
       	//Data type in Byte
   		System.out.println(Byte.BYTES +"byte");
   		System.out.println(Short.BYTES +"byte");
   		System.out.println(Integer.BYTES +"byte");
   		System.out.println(Long.BYTES +"byte");
   		System.out.println(Float.BYTES +"byte");
   		System.out.println(Double.BYTES +"byte");
   		
   		System.out.println(Integer.BYTES);
		System.out.println("Short Range = "+Short.MIN_VALUE +" TO "+ Short.MAX_VALUE);
		System.out.println("Byte Range = "+Byte.MIN_VALUE +" TO "+ Byte.MAX_VALUE);
		System.out.println("Integer Range = "+Integer.MIN_VALUE +" TO "+ Integer.MAX_VALUE);
		System.out.println("Long Range = "+Long.MIN_VALUE +" TO "+ Long.MAX_VALUE);
		System.out.println("Float Range = "+Float.MIN_VALUE +" TO "+ Float.MAX_VALUE);
		System.out.println("Double Range = "+Double.MIN_VALUE +" TO "+ Double.MAX_VALUE);
		System.out.println("Character Range = "+(int)Character.MIN_VALUE +" TO "+(int) Character.MAX_VALUE);
		System.out.println("Boolean Range is not fixed...!");
		
		//employee_info
		 String employee_Name = "Komal Narawade";
   	  int employee_Id = 12;
   	  double employee_Salary = 100000;
   	  int age = 27;
   	  String email = "komal@gmail.com";
   	  String gender = "Female";
   	  String department = "IT";
   	  long contact_No = 9373937250L;
   	  String address = "Hinjewadi ,Pune";
   	  
		System.out.println(employee_Name);
		System.out.println(employee_Id);
		System.out.println(employee_Salary);
		System.out.println(age);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(department);
		System.out.println(contact_No);
		System.out.println(address);
		
		//InfoAbout me
		String name = "Komal Mahadev Narawade";
//    	int age = 22;
    	int roll_No =34;
    	String place = "Pune";
    	String education = "Bachelor of engineering";
//    	String department = "Computer";
    	double sgpa = 9.29;
    	String skills = "Java , Html ,Css , Sql , Javascript , Mongodb , Nodejs,Git and Github";
    	String achievements = "Developed an ai powered and project management platform";
    	System.out.println(name);
		System.out.println(age);
		System.out.println(place);
		System.out.println(education);
		System.out.println(department);
		System.out.println(sgpa);
		System.out.println(skills);
		System.out.println(achievements);
		System.out.println(roll_No);
		
		
		
	}
}
