package com.tka.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            int userId;
            
            String fullName;
            String email;
            String password;
            Long phoneNumber;
            String address;
            String city;
            String state;
            String pincode;
            String role;
            boolean isActive;
            LocalDateTime createdAt;
			public User() {
				super();
				// TODO Auto-generated constructor stub
			}
			public User(int userId, String fullName, String email, String password, Long phoneNumber, String address,
					String city, String state, String pincode, String role, boolean isActive, LocalDateTime createdAt) {
				super();
				this.userId = userId;
				this.fullName = fullName;
				this.email = email;
				this.password = password;
				this.phoneNumber = phoneNumber;
				this.address = address;
				this.city = city;
				this.state = state;
				this.pincode = pincode;
				this.role = role;
				this.isActive = isActive;
				this.createdAt = createdAt;
			}
			public int getUserId() {
				return userId;
			}
			public void setUserId(int userId) {
				this.userId = userId;
			}
			public String getFullName() {
				return fullName;
			}
			public void setFullName(String fullName) {
				this.fullName = fullName;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public Long getPhoneNumber() {
				return phoneNumber;
			}
			public void setPhoneNumber(Long phoneNumber) {
				this.phoneNumber = phoneNumber;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public String getPincode() {
				return pincode;
			}
			public void setPincode(String pincode) {
				this.pincode = pincode;
			}
			public String getRole() {
				return role;
			}
			public void setRole(String role) {
				this.role = role;
			}
			public boolean isActive() {
				return isActive;
			}
			public void setActive(boolean isActive) {
				this.isActive = isActive;
			}
			public LocalDateTime getCreatedAt() {
				return createdAt;
			}
			public void setCreatedAt(LocalDateTime createdAt) {
				this.createdAt = createdAt;
			}
            
            
            
}
