package OOPS;

public class Rectangle {
             //Create a class Rectangle with length & width. Create 3 objects & find area of each.
	          int length;
	          int width;
	          
	          public static void main(String[] args) {
				
	        	  //Creation of Three objects from the rectangle class
	        	  Rectangle r1 = new Rectangle();
	        	  
	        	  int length1 = r1.length = 20;
	        	  int width1 = r1.width = 10;
	        	  int area1 =length1 * width1;
	        	  
	        	  System.err.println("Area of First Object");
	        	  System.out.println("Length :" + length1);
	        	  System.out.println("Width : " + width1);
	        	  System.out.println("Area : " + area1);
	        	  
	        	  //Creation of the second objects from the rectangle class
	        	  
	        	  Rectangle r2 = new Rectangle();
	        	  
	        	 int length2 =r2.length = 23;
	        	 int width2  =r2.width = 22;
                 int area2 = length2 * width2;
                 
                 System.err.println("Area of the second object");
                 System.out.println("length :" +length2);
                 System.out.println("Width : " +width2);
                 System.out.println("Area : " + area2);
                 
                 //Creation of the Thirs of Object From the rectangle class
                 
                 Rectangle r3 = new Rectangle();
                 
                 int length3 = r3.length = 24;
                 int width3 = r3.width = 34;
                 int area3 = length3 * width3;
                 
                 System.err.println("Area Of the Third Object : "  );
                 System.out.println("Length : " + length3);
                 System.out.println("Width : " + width3);
                 System.out.println("Area : " + area3);    
			}
}
