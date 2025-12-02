package Method;

public class PersonalInfo {
             String name;
             int rollNo;
             String email;
             long mobNo;
             String city;
             String collegeName;
             char gender;
             
             public void personalDetails(String name , int rollNo ,String email , long mobNo , String city , String collegeName , char gender) {
            	 this.name = name;
            	 this.collegeName = collegeName;
            	 this.rollNo=rollNo;
            	 this.mobNo = mobNo;
            	 this.email =email;
            	 this.city =city;
            	 this.gender =gender;
            	 
            	 System.out.println("Personal Details :" );
            	 System.out.println("Name :" + name);
            	 System.out.println("College Name :" + collegeName);
            	 System.out.println("roll number :" + rollNo);
            	 System.out.println("mobile number :" + mobNo);
                 System.out.println("Email :" +email);            	 
            	 System.out.println("City :" +city);
            	 System.out.println("Gender :" +gender);
             }

		
}
