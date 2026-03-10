package com.tka;

public class Country {
         int conId;
         String name;
		 public Country() {
			
		 }
		 public Country(int conId, String name) {
			super();
			this.conId = conId;
			this.name = name;
		 }
		 public int getConId() {
			 return conId;
		 }
		 public void setConId(int conId) {
			 this.conId = conId;
		 }
		 public String getName() {
			 return name;
		 }
		 public void setName(String name) {
			 this.name = name;
		 }
		 @Override
		 public String toString() {
			return "Country [conId=" + conId + ", name=" + name + "]";
		 }
         
         
}
