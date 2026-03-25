package oops.inheritance;

public class Doctor extends HospitalSystem {
             public void patientRecord() {
            	 System.out.println("Diagnoses patient illnesses");
             }
             public void prescriptions() {
            	 System.out.println("Writes Prescription");
             }
             public void labTest() {
            	 System.out.println("Order Lab tests");
             }
             public void patientTreatment() {
            	 System.out.println("Monitors Patient Tretment");
             }
             public static void main(String[] args) {
				Doctor d = new Doctor();
				d.nameAge();
				d.hospitalId();
				d.labTest();
				d.patientRecord();
				d.patientTreatment();
				d.prescriptions();
			}
             
}
