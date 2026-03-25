package oops.pojo;

public class Patient {
            int patientId;
            String patientName;
            Doctor doctor;
            Room room;
            
            
			public Patient() {
				super();
				// TODO Auto-generated constructor stub
			}
			
			public Patient(int patientId, String patientName, Doctor doctor, Room room) {
				super();
				this.patientId = patientId;
				this.patientName = patientName;
				this.doctor = doctor;
				this.room = room;
			}
			
			public int getPatientId() {
				return patientId;
			}
			public void setPatientId(int patientId) {
				this.patientId = patientId;
			}
			public String getPatientName() {
				return patientName;
			}
			public void setPatientName(String patientName) {
				this.patientName = patientName;
			}
			public Doctor getDoctor() {
				return doctor;
			}
			public void setDoctor(Doctor doctor) {
				this.doctor = doctor;
			}
			public Room getRoom() {
				return room;
			}
			public void setRoom(Room room) {
				this.room = room;
			}
			@Override
			public String toString() {
				return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", doctor=" + doctor
						+ ", room=" + room + "]";
			}
            
            
}
