package oops.Polymorphism.overload;

public class SttudentPortal {
             
	SttudentPortal(float sscMarks , float diplomaMarks , float finalMarks  ){
		System.out.println("DSY Student");
	}
	SttudentPortal(float sscMarks , float hscMarks , float finalMarks ,float firstSemMarks){
		System.out.println("Regular Student");
	}
}
