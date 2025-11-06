
public class LogicalNotOperatorDay5 {
       public static void main(String[] args) {
//    	   Write a program to check if a number is not even using !.
    	   int num = 4;
    	   boolean isEven =(num%2==0);
    	   System.out.println("Number is even or not :" + !(isEven));

          //Write a program to check if a person is not eligible to vote (!(age >= 18)).
    	   int age = 24;
    	   boolean isEligible = (age>=18);
    	   System.out.println("Checking if person is eligible to vote or not :" +!(isEligible) );
    	   

          //Write a program to check if a number is not divisible by 3.
    	   int num1 = 30;
    	   boolean isDivisible = (num1%3==0);
    	   System.out.println("Checking number is divisible by 3 :" + !(isDivisible));

//    	   Write a program to print “Access Denied” if !hasPass is true.
    	   boolean hasPass = true;
    	   System.out.println("Access denied :" + !(hasPass));

//    	   Write a program to check if a student does not qualify for scholarship (!(marks >= 90 && attendance >= 75)).
    	   int marks = 50;
    	   int attendance = 67;
    	   boolean isQualify = (marks>=90 && attendance>=75); 
    	   System.out.println("Check if a student does not qualify fro scholership :" + (isQualify));

//    	   Check if a number is not a multiple of 5.
           int num4 = 30;
           System.out.println("Checking number is multiple of 5 or not  :" + !(num4%5==0));

//    	   Write a program to print “Login Failed” if !isLoggedIn.
           boolean isLoggedIn = true;
           System.out.println("Program to print login failed " + (!isLoggedIn));

//    	   Check if a triangle is not valid (!(a + b > c && b + c > a && c + a > b)).
           int side1=3;
           int side2=4;
           int side3=5;
           boolean isValid = (side1+side2>side3 && side2+side3>side1 && side3+side1>side2);

//    	   Check if a number is not between 1 and 100.
           int num5 = 40;
           System.out.println("Number is between 1 and 100 :" + !(num5>1 && num5<100));
//    	   Write a program to check if a character is not a vowel.
           char ch = 'a';
           System.out.println("Programme to check if a character is not a vowel :" + !(ch=='a' || ch=='i' ||ch=='o' ||ch=='u' || ch=='e'));
           
           boolean c =true;
           System.out.println(!c);
           
           boolean d = false;
           System.out.println(!d);
           
           System.out.println(!(5!=5));
           
           System.out.println(!true && false);
           
           System.out.println(!true || false);
           System.out.println(!false && true);
           System.out.println(!false || false);
           
           boolean y = true , z =false;
           System.out.println(!y && !z);
           
           System.out.println(!(5>10 || 3==3));
           
           System.out.println(!(2<4 ) && (3!=3));
           
           System.out.println(!(10<5 || 2>1));
           
           boolean x =false;
           boolean u =!x;
           System.out.println(!(x) && u);
           
           System.out.println(!((false || true)&&(true &&true)));
           
           System.out.println(!((true&&false) ||(false || false)));
           
           System.out.println(!(true &&(false || !true)));
           
           System.out.println(!(true || (false && ! false)));
           
           int n = 40;
           boolean isBetween = (n>100 && n<200);
           System.out.println(!(isBetween));
           
           boolean isAdmin = true;
           System.out.println("Access Denied if not admin :" + !(isAdmin));
           
           boolean result =!(true && !(false || true));
           System.out.println(result);        
	}
}
