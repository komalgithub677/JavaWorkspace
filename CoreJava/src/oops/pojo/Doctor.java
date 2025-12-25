package oops.pojo;

public class Doctor {
              int doctorId;
              String doctorName;
              String specialisation;
			public Doctor() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Doctor(int doctorId, String doctorName, String specialisation) {
				super();
				this.doctorId = doctorId;
				this.doctorName = doctorName;
				this.specialisation = specialisation;
			}
			public int getDoctorId() {
				return doctorId;
			}
			public void setDoctorId(int doctorId) {
				this.doctorId = doctorId;
			}
			public String getDoctorName() {
				return doctorName;
			}
			public void setDoctorName(String doctorName) {
				this.doctorName = doctorName;
			}
			public String getSpecialisation() {
				return specialisation;
			}
			public void setSpecialisation(String specialisation) {
				this.specialisation = specialisation;
			}
			@Override
			public String toString() {
				return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialisation="
						+ specialisation + "]";
			}
              
            
}
