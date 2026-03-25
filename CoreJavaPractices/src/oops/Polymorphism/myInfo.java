package oops.Polymorphism;

public class myInfo {
       public void myName(String fName) {
    	   System.out.println(fName);
       }
       
       public void myName(String fName , String lName) {
    	   System.out.println(fName + " " + lName);
       }
       
       public static void main(String[] args) {
		myInfo m = new myInfo();
		m.myName(null);
		m.myName(null, null);
		
	}
}
