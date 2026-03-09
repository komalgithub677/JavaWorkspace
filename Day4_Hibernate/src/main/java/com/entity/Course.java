package com.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int courseId;

    String courseName;

    @ManyToMany(mappedBy = "courses")
    List<Student1> students;

    public Course() {}

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student1> getStudents() {
        return students;
    }

    public void setStudents(List<Student1> students) {
        this.students = students;
    }

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", students=" + students + "]";
	}
    
}