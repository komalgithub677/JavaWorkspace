package oops.practicequestions;

public class Employees extends Address {
          int id;
          String name;
          Address address;
		public Employees(String city, String state, int id, String name, Address address) {
			super(city, state);
			this.id = id;
			this.name = name;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employees [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
		
		
		
		
          
          
          
	
	
             
}
