package com.tka;

public class Person {
         int id;
         String name;
         Address addr;
		 public Person() {
			
		 }
		 public Person(int id, String name, Address addr) {
			super();
			this.id = id;
			this.name = name;
			this.addr = addr;
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
		 public Address getAddr() {
			 return addr;
		 }
		 public void setAddr(Address addr) {
			 this.addr = addr;
		 }
		 @Override
		 public String toString() {
			return "Person [id=" + id + ", name=" + name + ", addr=" + addr + "]";
		 }      
}
