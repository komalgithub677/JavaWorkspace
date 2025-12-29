package string;

public class B {
  public static void main(String[] args) {
	//Type through String literal with the different values
	  String s1 ="java";
	  String s4 = "Java";
	  String s5 = "java";
	  String s2 = s1;
	  String s3 = "Python";
	  
	  System.out.println(s4.equals(s5));
	  
	  System.out.println(s1.equals(s2));//references
	  System.out.println(s1.equals(s3));//values
}
}
