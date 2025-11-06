
public class LogicalAndOperatorDay4 {
             public static void main(String[] args) {
            	 int x =5 , y =10;
       		  System.out.println(x<y && x==5);//true
       		  
       		  boolean a =true , b=false;
       		  System.out.println(a && b); //false
       		  
       		  int n =8;
       		  System.out.println(n>5 && n<10);//true
       		  
       		  int x1 =7;
       		  System.out.println(x1>5 && x1++>10);//false
       		  
       		  int p=3, q =9;
       		  System.out.println(p>5 && ++q >10);//false
       		  
       		  int a1 =10 , b1=20;
       		  System.out.println(a1<5 && b1>10);//true
       		  
       		  int num =15;
       		  System.out.println(num%3 ==0 && num%5 ==0);//true
       		  
       		  boolean a2 =true , b2=true , c2=false;
       		  System.out.println(a2 && b2 && c2);//false
       		  
       		  //Write a program to check if a number is between 1 and 100 using &&.
       		  int number = 10;
       		  System.out.println("Checking number between 1 and 100 :"+ (number>1 && number<100));
       		  
       		  //Write a program to check if a person is eligible to vote (age ≥ 18 and citizenship = "Indian").
       		  int age = 50;
       		  String citizenship ="Indian";
       		  System.out.println("Checking the person eligibility for voting : " + (age>=18 && citizenship.equals("Indian")));
       		  
       		  //Write a program to check if a number is positive and even using logical AND.
       		  int num2 = 20;
       		  System.out.println("Checking number is even or positive :" + (num2>0 && num2%2==0));
       		  
       		 // Write a program to check if a year is a leap year using &&.
       		  int year = 2020;
       		  System.out.println("year is leap year or not :"+(year%4 ==0 || (year%100!=0 && year%400==0)));
       		  
       		  //Check if a character is a lowercase vowel using &&
       		  char ch = 'a';
       		  System.out.println("Character is alowerCase vowel or not :"+ (Character.isLowerCase(ch)&& (ch=='i' || ch=='a' || ch=='o' || ch=='u' || ch=='e')));
       		  
       		  //Check if a triangle is valid using the condition (a + b > c && b + c > a && c + a > b).
       		  int side1 = 10;
       		  int side2 = 20;
       		  int side3 =30;
       		  
       		  System.out.println("Cheking triagle is valid : "+ (side1+side2>side3 && side2+side3>side1 && side3+side1>side2));
       		  
       		  //Write a program to check if two numbers are both positive using &&.
       		  int num3 = 40;
       		  int num4 =50;
       		  System.out.println("Checking two numbers are positive or not :" + (num3>0 && num4>0));
       		  
       		  //Check if a person can apply for a job (age > 21 and experience > 2 years).
       		  int age1 = 30;
       		  int experienceYear = 3;
       		  System.out.println("Checking person is eligible for applying job : "+ (age1 >21 && experienceYear>2 ));
       		  
                 //System.out.println((5>2 ) && (3));
       		  
       		  boolean flag =true;
       		  flag = flag && false;
       		  System.out.println(flag);
       		  
       		  //Check if a user can log in (username correct && password correct).
       		  String username ="Komal";
       		  String password ="123";
       		  System.out.println("Cheking if user can log in :" +(username.equals(username)&& password.equals(password)) );
       		  
       		  //Check if a number is divisible by both 3 and 5.
       		  int number1 =15;
       		  System.out.println("Cheking number is divisible by 3 and 5 or not :" +(number1%3==0 && number1%5==0));
       		  
       		  //Check if a person is eligible for a driving license (age ≥ 18 && has ID proof).
       		  int age3 = 30;
       		  Boolean IDproof = true;
       		  System.out.println("Checking person is eligible for driving license : " + (age3 >=18 && IDproof==true));
       		  
       		  //Check if a student qualifies for a scholarship (marks ≥ 90 && attendance ≥ 75%).
       		  int marks =60;
       		  int attendance = 65;
       		  System.out.println("Checking person is eligible for scholership or not :" + (marks>=90 && attendance>=75));
       		  
       		  //Check if a rectangle is valid (length > 0 && width > 0).
       		  int length = 10;
       		  int width =20;
       		  System.out.println("Checking rectangle is valid or not :" + (length>0 && width>0));
       		  
       		  //Check if a password is valid (length ≥ 8 && contains special characters).
       		  String passwords = "@#$$%#";
       		  boolean hasSpecialChar = passwords.matches(".[!@#$%^&*(),.?\":{}|<>].*");
       		  System.out.println(length>=8 && hasSpecialChar );
       		  
       		  //Check if a number lies between 50 and 150 using &&.
       		  int number2 = 20;
       		  System.out.println("Number lies between 50 and 150 :" +  (number2>50 && number2<150));
 
             //Check if a person can enter a restricted area (hasPass && securityClearance).
       		  boolean hasPass = true;
       		  boolean securityClearance = true;
       		  System.out.println("Checking if person entered a restricted area : " +(hasPass && securityClearance));
             
       		  //Check if a customer is eligible for discount (isMember && totalPurchase > 1000).
       		  boolean isMember = true;
       		  int totalPurchase = 3000;
       		  System.out.println("Customer is eligible for discount or not : " + (isMember && totalPurchase>1000));
       		  
       		  //Write a program to check if a number is even and multiple of 10 using &&.
       		  int number4 =60;
       		  System.out.println("Check if a number is even and multiple of 10 : " + (number4 %2== 0 && number4%10==0));
       		  
       		  //
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             }
}
