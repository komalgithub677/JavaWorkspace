package string;

public class StringBufferPracticeQuestions {
             public static void main(String[] args) {
//            	 Create a StringBuffer and append your name.
            	 StringBuffer sb = new StringBuffer();
            	 sb.append("Komal");
            	 System.out.println(sb);
            	 
//            	 Insert "Programming" inside "I Love " using StringBuffer.
            	 StringBuffer sb1 = new StringBuffer("I Love");
            	 System.out.println("Before Inserting : " + sb1);
            	 sb1.append(" Programming");
            	 System.out.println("After inserting : " + sb1);
            	 
//            	 Reverse a string using StringBuffer.
            	 String s = "Komal";
            	 StringBuffer sb2 = new StringBuffer(s);
            	 System.out.println("Before Reverse : " + sb2);
            	 sb2.reverse();
            	 System.out.println("After Reverse : " + sb2);
         
//            	 Delete last 3 characters using StringBuffer.
            	 StringBuffer sb3 = new StringBuffer("Komal");
            	 sb3.delete(2, 5);
            	 System.out.println("String after delete the three characters : " + sb3);
            	
//            	 Replace "India" with "Bharat" using StringBuffer.
            	 StringBuffer sb4 = new StringBuffer("India");
            	 System.out.println("String before replce : " + sb4);
            	 sb4.replace(0, 5, "Bharat");
            	 System.out.println("String after replace : "+ sb4);
            	 
            	 
//            	 Print length and capacity of StringBuffer.
            	 StringBuffer sb5 = new StringBuffer("Komal");
            	 System.out.println("Strinbuffer Length  : " + sb5.length());
            	 System.out.println("StringBuffer Capacity : " + sb5.capacity());
            	 
//            	 Convert StringBuffer to String.
            	 StringBuffer sb6 = new StringBuffer("India");
            	 System.out.println("String buffer to String : " + sb6.toString() );
			}
}
