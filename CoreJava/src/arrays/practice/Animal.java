package arrays.practice;

public class Animal {
             private int stdId;
             private String studName;
             private String Address;
             private int roll;
             private String clgName;
             
             public void Animal() {
            	 
             }
             
             public void Animal(int stdId , String studName , String Address , int roll , String clgName) {
            	 this.stdId =stdId;
            	 this.studName = studName;
            	 this.Address = Address;
            	 this.roll = roll;
            	 this.clgName =clgName;
            	 
             }
             
             public void getstdId(int stdId) {
            	 this.stdId = stdId;
             }
             
             public int setstdId() {
            	 return stdId;
             }
             public void getstudName(String studName) {
            	 this.studName = studName;
             }
             public String setstudnName() {
            	 return studName;
             }
             public void getAddress(String Address) {
            	 this.Address = Address;
             }
             public String setAddress() {
            	 return Address;
             }
             public void getroll(int roll) {
            	 this.roll =roll;
             }
             public int setroll() {
            	 return roll;
             }
             public void getclgName(String clgName) {
            	 this.clgName = clgName;
             }
             public String clgName() {
            	 return clgName;
             }
}
