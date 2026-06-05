package practice;

import java.util.Objects;

public class Encapsulation1 {
             private int id;
             private String name;
             private String address;
             private String clg;
             private long mob;
             private String gmail;
			 public Encapsulation1() {
				super();
				// TODO Auto-generated constructor stub
			 }
			 public Encapsulation1(int id, String name, String address, String clg, long mob, String gmail) {
				super();
				this.id = id;
				this.name = name;
				this.address = address;
				this.clg = clg;
				this.mob = mob;
				this.gmail = gmail;
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
			 public String getAddress() {
				 return address;
			 }
			 public void setAddress(String address) {
				 this.address = address;
			 }
			 public String getClg() {
				 return clg;
			 }
			 public void setClg(String clg) {
				 this.clg = clg;
			 }
			 public long getMob() {
				 return mob;
			 }
			 public void setMob(long mob) {
				 this.mob = mob;
			 }
			 public String getGmail() {
				 return gmail;
			 }
			 public void setGmail(String gmail) {
				 this.gmail = gmail;
			 }
			 
			 @Override
			 public int hashCode() {
				return Objects.hash(address, clg, gmail, id, mob, name);
			 }
			 
			 @Override
			 public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Encapsulation1 other = (Encapsulation1) obj;
				return Objects.equals(address, other.address) && Objects.equals(clg, other.clg)
						&& Objects.equals(gmail, other.gmail) && id == other.id && mob == other.mob
						&& Objects.equals(name, other.name);
			 }
			 @Override
			 public String toString() {
				return "Encapsulation1 [id=" + id + ", name=" + name + ", address=" + address + ", clg=" + clg
						+ ", mob=" + mob + ", gmail=" + gmail + "]";
			 }
			 
			 
             
             
}
