package com.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int stuId;

    String name;
    String city;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    List<Course> courses;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

	@Override
	public String toString() {
		return "Student1 [stuId=" + stuId + ", name=" + name + ", city=" + city + ", courses=" + courses + "]";
	} 
}