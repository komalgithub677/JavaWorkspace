
package SwitchCase;

public class CalculatorUsingNestedSwitch {
             public static void main(String[] args) {
            	 //26. Calculator With Nested Switch

            	 //Switch on operation → then switch for advanced mode.
            	 
            	 char operation = '+';
            	 
            	 System.out.println("Choose operation");
            	 System.out.println("1.Addition");
            	 System.out.println("2.Substraction");
            	 System.out.println("3.Multiplication");
            	 System.out.println("4.Division");
            	 System.out.println("Remainder");
            	 
            	 System.out.println("Choose mode");
            	 System.out.println("Basic ");
            	 System.out.println("Advanced");
            	 
            	 int mode = 1;
            	 
            	 
            	 switch(operation) {
            	 case '+':
            		 System.out.println("Addition Selected");
            		 switch(mode) {
            		 case 1:
            			 System.out.println("Basic mode selected");
            		     int a =10 , b =20;
            		     System.out.println("Addition: " +(a+b));
            		 break;
            		 
            		 case 2:
            			 System.out.println("Advanced mode selected");
            			 int a1=20 ,a2=30, a3=20;
            			 System.out.println("Addition:" +(a1 + a2 + a3));
            	     break;
            	     
            	     default:
            	    	 System.out.println("Invalid mode");
            	
            		 }
            	break;
            	
            	 case '-':
            		 System.out.println("Substraction selected");
            		 switch(mode) {
            		 case 1:
            			 System.out.println("Basic mode selected");
            			 int a=20 ,b =20;
            			 System.out.println("substraction of two numbers would be the :" +(a-b));
            		 break;
            		 
            		 case 2:
            			 System.out.println("Advanced mode selected");
            			 int x=30, y=40 , z=50;
            			 System.out.println("Substraction of three numbers would be the :" +(x-y-z));
            		 break;
            		 
            		 default:
            			 System.out.println("Invalid mode ");
            			 
            		 }
            	 break;
            	 
            	 case '*':
            		 System.out.println("Multiplication selected");
            		 switch(mode) {
            		 case 1 :
            			 System.out.println("Basic mode selected");
            			 int a = 3 , b=4;
            			 System.out.println("Multiplication of two number is :" +(a*b));
            		 break;
            		 
            		 case 2:
            			 System.out.println("Advanced mode selected");
            			 int x =2 ,y=3,z=4;
            			 System.out.println("Multiplication of three number would be the :" +(x*y*z));
            		 break;
            		 
            		 default:
            			 System.out.println("Invalid mode");
            		 }
            	 break;
            	 
            	 case '/':
            		 System.out.println("Division operation selected");
            		 switch(mode) {
            		 case 1 :
            			 System.out.println("Basic mode selected");
            			 int a =20 ,b =10;
            			 System.out.println("Division of two number is :" +(a/b));
            		 break;
            		 
            		 case 2:
            			 System.out.println("Advanced mode selected");
            			 int x=900, y=80;
            			 System.out.println("Division of three number is :" +(x/y));
            		 break;
            		 }
            	  break;
            	  
            	 case '%':
            		 System.out.println("Modulus operation selected");
            		 switch(mode) {
            		 case 1:
            			 System.out.println("Basic mode selected");
            			 int a =20 ,b =3;
            			 System.out.println("Remainder would be :" + (a%b));
            		 break;
            		 
            		 case 2:
            			 System.out.println("Advanced mode selected");
            			 int x=1000 ,y=30;
            			 System.out.println("Remainder would be the"+(x%y));
            		 break;
            		 
            		 default:
            			 System.out.println("Invalid mode");
            		 }
            	 break;
            		
            	default:
            		System.out.println("Invlaid operator selected");
            	
            	 }
              
			}
}