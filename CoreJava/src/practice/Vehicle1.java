package practice;

public abstract class Vehicle1 {
	            int id;
	            String name;
	            
	            Vehicle1(int id , String name){
	            	this.id =id;
	            	this.name =name;
	            }
	            
              public abstract void add();
              
              public void printDetails() {
            	  System.out.println("This is the details of the student");
              }
              
              
}
