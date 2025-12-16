package oops.Polymorphism.overload;

public class MyInfo {
       public void myName(String fName) {
    	   System.out.println(fName);
       }
       public void myName(String fName , String lName) {
    	   System.out.println(fName + " " + lName);
       }
       public static void main(String[] args) {
		MyInfo m = new MyInfo();
		m.myName(null);
		m.myName(null, null);
		
	}
}
