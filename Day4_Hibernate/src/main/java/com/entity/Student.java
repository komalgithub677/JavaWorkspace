package com.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	@Column(name="studeId")
	private int studeId;

    private String name;

    private String city;

    // One-to-One relationship with Laptop
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_id", referencedColumnName = "laptopId")
    private Laptop laptop;

    public Student() {
    }

    public Student(int studeId, String name, String city, Laptop laptop) {
        this.studeId = studeId;
        this.name = name;
        this.city = city;
        this.laptop = laptop;
    }

    public int getStudeId() {
        return studeId;
    }

    public void setStudeId(int studeId) {
        this.studeId = studeId;
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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student [studeId=" + studeId + ", name=" + name + ", city=" + city + ", laptop=" + laptop + "]";
    }

	
}