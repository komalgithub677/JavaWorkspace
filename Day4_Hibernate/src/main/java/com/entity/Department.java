package com.entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {//one to many
	@Id
             int deptId;
             String deptName;
             
             @OneToMany(mappedBy = "department")

             List<Employee> emp;
             
			
			 public Department() {
				super();
				// TODO Auto-generated constructor stub
			}
			 
			 public List<Employee> getEmp() {
				return emp;
			}

			 public void setEmp(List<Employee> emp) {
				 this.emp = emp;
			 }

			 

			 public String getDeptName() {
				return deptName;
			}

			 public void setDeptName(String deptName) {
				 this.deptName = deptName;
			 }

			 public int getDeptId() {
				 return deptId;
			 }
			 public void setDeptId(int deptId) {
				 this.deptId = deptId;
			 }

			 @Override
			 public String toString() {
				return "Department [deptId=" + deptId + ", deptName=" + deptName + ", emp=" + emp + "]";
			 }
			 
			
             
}
