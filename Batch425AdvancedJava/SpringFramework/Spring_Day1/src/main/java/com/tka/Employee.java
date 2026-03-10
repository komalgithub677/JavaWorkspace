package com.tka;

@Entity
public class Employee {
          int id;
          String name;
          String city;
          Country con;
          
		  public Employee(int id, String name, String city, Country con) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.con = con;
		}

		  public Employee() {
			
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

		  public String getCity() {
			  return city;
		  }

		  public void setCity(String city) {
			  this.city = city;
		  }

		  public Country getCon() {
			  return con;
		  }

		  public void setCon(Country con) {
			  this.con = con;
		  }

		  @Override
		  public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", con=" + con + "]";
		  }
          
          
}
