package oops.pojo;

import java.util.Scanner;

public class HospiTalMain {
            

			public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);

			        // -------- Doctor Input --------
			        System.out.println("Enter Doctor ID:");
			        int doctorId = sc.nextInt();
			        sc.nextLine(); // consume newline

			        System.out.println("Enter Doctor Name:");
			        String doctorName = sc.nextLine();

			        System.out.println("Enter Doctor Specialization:");
			        String specialization = sc.nextLine();

			        Doctor doctor = new Doctor(doctorId, doctorName, specialization);

			        // -------- Room Input --------
			        System.out.println("Enter Room Number:");
			        int roomNo = sc.nextInt();
			        sc.nextLine();

			        System.out.println("Enter Room Type:");
			        String roomType = sc.nextLine();

			        Room room = new Room(roomNo, roomType);

			        // -------- Patient Input --------
			        System.out.println("Enter Patient ID:");
			        int patientId = sc.nextInt();
			        sc.nextLine();

			        System.out.println("Enter Patient Name:");
			        String patientName = sc.nextLine();

			        Patient patient = new Patient(patientId, patientName, doctor, room);

			        // -------- Hospital Input --------
			        System.out.println("Enter Hospital ID:");
			        int hospitalId = sc.nextInt();
			        sc.nextLine();

			        System.out.println("Enter Hospital Name:");
			        String hospitalName = sc.nextLine();

			        Hospital hospital = new Hospital(hospitalId, hospitalName, doctor, room);

			        // -------- Output --------
			        System.out.println("\n--- Patient Details ---");
			        System.out.println(patient);

			        System.out.println("\n--- Hospital Details ---");
			        System.out.println(hospital);

			}
}
