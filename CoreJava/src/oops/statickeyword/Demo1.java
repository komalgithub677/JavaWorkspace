package oops.statickeyword;

public class Demo1 {
             int id;
             String name;
             static String instituteName ="TKA";
             
             Demo1(int id , String name){
            	 this.id =id;
            	 this.name =name;
//            	 this.instituteName ="2345";
             }
             
             void display() {
            	 System.out.println("id :" + id);
            	 System.out.println("name = " + name);
            	 System.out.println("institutename : " + instituteName);
             }
             
            
             
}
