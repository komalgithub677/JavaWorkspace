package oops.pojo;

public class Student {
             int studId;
             String studName;
             String city;
             College clg;//Reference creation
			public Student(int id, String name, Course course) {
				super();
				// TODO Auto-generated constructor stub
			}
			public Student(int studId, String studName, String city, College clg) {
				super();
				this.studId = studId;
				this.studName = studName;
				this.city = city;
				this.clg = clg;
			}
			public int getStudId() {
				return studId;
			}
			public void setStudId(int studId) {
				this.studId = studId;
			}
			public String getStudName() {
				return studName;
			}
			public void setStudName(String studName) {
				this.studName = studName;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public College getClg() {
				return clg;
			}
			public void setClg(College clg) {
				this.clg = clg;
			}
			@Override
			public String toString() {
				return "Student [studId=" + studId + ", studName=" + studName + ", city=" + city + ", clg=" + clg + "]";
			}
             
             
             
}
