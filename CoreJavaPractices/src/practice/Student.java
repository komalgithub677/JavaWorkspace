package practice;

public class Student {
       int id;
       String name;
       Address address;
       
       Student(int id,
       String name,
       Address address){
    	   super();
    	   this.id=id;
    	   this.name =name;
    	   this.address = address;
       }
       
       void show() {
    	   System.out.println("Student id : " + id);
    	   System.out.println("Name : " + name);
    	   System.out.println("City" + address.city);
    	   System.out.println("Sate : " + address.state);
       }
       
}
