import java.util.Scanner;

public class Day1 {
        public static void main(String[] args) {
        	//static initialization
       
//			int []marks = {12,45,36,37,38,40};
//			System.out.println(marks.length);
//			
//			System.out.println(marks[0]);
//			System.out.println(marks[1]);
//			System.out.println(marks[2]);
//			System.out.println(marks[3]);
//			System.out.println(marks[4]);
//			System.out.println(marks[5]);
//			
//			for(int i=0; i<marks.length; i++) {
//				System.out.println(marks[i]);
//			}
        	
//        	String []names = {"rahul" , "Komal" , "priya" ,"swati"};
//        	
//        	for(int i=0; i<names.length; i++) {
//        		System.out.println(names[i]);
//        	}
//		}
        
        //Dynamic initialization
        
//        char symbols[] = new char[5];
//        symbols[0] = 'A';
//        symbols[1] ='B';
//        symbols[2] ='C';
//        symbols[3] ='D';
//        symbols[4] ='E';
//        symbols[5] ='F';
//        symbols[6] ='G';
//        symbols[7] ='H';
//        
//        for(int i=0; i<symbols.length; i++) {
//        	System.out.println(symbols[i]);
//        }
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter names");
        	String[] names = new String[5];
        	
        	for(int i=0; i<names.length; i++) {
        		names[i] = sc.nextLine();
        	}
        	System.out.println("Enter your names:");
        	for(int i=0;i <names.length; i++) {
        		System.out.println(names[i]);
        	}
     }
}
