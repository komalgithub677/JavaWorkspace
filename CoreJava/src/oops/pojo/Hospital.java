package oops.pojo;

public class Hospital {
             int hospitalId;
             String hospitalName;
             Doctor doctor;
             Room room;
			public Hospital() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Hospital(int hospitalId, String hospitalName, Doctor doctor, Room room) {
				super();
				this.hospitalId = hospitalId;
				this.hospitalName = hospitalName;
				this.doctor = doctor;
				this.room = room;
			}
			public int getHospitalId() {
				return hospitalId;
			}
			public void setHospitalId(int hospitalId) {
				this.hospitalId = hospitalId;
			}
			public String getHospitalName() {
				return hospitalName;
			}
			public void setHospitalName(String hospitalName) {
				this.hospitalName = hospitalName;
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
				return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", doctor=" + doctor
						+ ", room=" + room + "]";
			}           
}
