package oops.pojo;

public class Students {
             int id;
             String name;
             Course course;
             
            final double REGISTRATION_FEE = 1000;

			public Students(int id, String name, Course course) {
				super();
				this.id = id;
				this.name = name;
				this.course = course;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
			public Course getcourse() {
				return course;
			}

			public void setcourse(Course course) {
				this.course = course;
			}

			public double getREGISTRATION_FEE() {
				return REGISTRATION_FEE;
			}

			public double calculateTotalFees() {
				return course.fees() + REGISTRATION_FEE;	   
			}

			@Override
			public String toString() {
				return "Students [id=" + id + ", name=" + name + ", course=" + course + ", REGISTRATION_FEE="
						+ REGISTRATION_FEE + "]";
			}
             
             
}
