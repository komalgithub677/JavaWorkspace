package main;

import oops.Hospital;
public class HospitalInfo {
       public static void main(String[] args) {
    	//First object creation from the hospital
    	   
		Hospital h1 = new Hospital();
		
		String name1 = h1.name ="City Care Hospital";
		String type1 =h1.type ="Multi-Speciality";
		int doctor1 =h1.numberOfDoctors=60;
		int bed1 =h1.numberOfbeds =180;
		String specialisation1 = h1.specialisation = "Heart Treatment & Brain Disorders";
		long contact1 =h1.contactNumber = 9876586780l;
				
		System.err.println("Haspital 1 info");
		System.out.println("Hospital Name : " + name1);
		System.out.println("Hospital Type : " + type1);
		System.out.println("No of Doctors : " + doctor1);
		System.out.println("No fo Beds : "  + bed1);
		System.out.println("Specialisation In : "+ specialisation1);
		System.out.println("Contact No : " + contact1);
		
		 //Second object creation from the Hospital class  
	    Hospital h2 = new Hospital();
				
	    String name2 = h2.name ="Lifeline Hospital";
		String type2 =h2.type ="General Hospital";
		int doctor2 =h2.numberOfDoctors=45;
		int bed2 =h2.numberOfbeds =120;
		String specialisation2 = h2.specialisation = "Emergency and trauma care";
		long contact2 =h2.contactNumber = 9876586880l;
						
		System.err.println("Haspital 2 info");
		System.out.println("Hospital Name : " + name2);
		System.out.println("Hospital Type : " + type2);
		System.out.println("No of Doctors : " + doctor2);
		System.out.println("No fo Beds : "  + bed2);
		System.out.println("Specialisation In : "+ specialisation2);
		System.out.println("Contact No : " + contact2);		
		
		
		
	}
}
