package oops.contructor;

public class Student {
             int age;
             String name;
             String city;
             int rollNo;
             String gender;
             String dob;
             String address;
             
             Student(int age,
             String name,
             String city,
             int rollNo,
             String gender,
             String dob,
             String address){
            	 this.name=name;
            	 this.age=age;
            	 this.city=city;
            	 this.dob=dob;
            	 this.gender=gender;
            	 this.rollNo=rollNo;
                 this.address=address;
                 student();
             }
             
             void student() {
            	 System.out.println("Student name" +name);
            	 System.out.println("Student age"+age);
            	 System.out.println("Student city" + city);
            	 System.out.println("Student Date Of Birth" + dob);
            	 System.out.println("Student gender :" + gender);
            	 System.out.println("Student rollNo :" + rollNo);
            	 System.out.println("Student address :" + address);
             }
             
	
}
