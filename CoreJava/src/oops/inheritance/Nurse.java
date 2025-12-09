package oops.inheritance;

public class Nurse extends HospitalSystem {
             public void patientVitals() {
            	 System.out.println("Have accesss to patients BP< temperature ,Oxygen");
             }
             public void treatmentCharts() {
            	 System.out.println("Aminister medicine");
             }
             public void medicationSchedules() {
            	 System.out.println("Assists doctors during treatment");
             }
             public static void main(String[] args) {
				Nurse n = new Nurse();
				n.nameAge();
				n.hospitalId();
				n.medicationSchedules();
				n.patientVitals();
				n.treatmentCharts();
			}
}
