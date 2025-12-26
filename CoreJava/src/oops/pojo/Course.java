package oops.pojo;

public abstract class Course {
             String courseName;
             int duration;
             
            
             public String getCourseName() {
				return courseName;
			}
             
             public Course(String courseName, int duration) {
 				super();
 				this.courseName = courseName;
 				this.duration = duration;
 			}

			public void setCourseName(String courseName) {
				this.courseName = courseName;
			}

			public int getDuration() {
				return duration;
			}

			public void setDuration(int duration) {
				this.duration = duration;
			}

			abstract double fees();
			
			@Override
			public String toString() {
				return "Course [courseName=" + courseName + ", duration=" + duration + "]";
			}
}
