package oops.Polymorphism.overload;

public class PracticeQuestionsInfo {
             public static void main(String[] args) {
				PracticeQuestion pq = new PracticeQuestion();
				//Addition method
				pq.add();
				pq.add(12, 13);
				
				//Display method
				pq.display(12);
				pq.display("Komal");
				
				//Multiply method
				pq.multiply(23.00, 33.00);
				pq.multiply(12, 23);
				
				//Area of circle & rectangle
				pq.area(3, 3.14f);
				pq.area(12, 10);
				
				//sum
				pq.sum(1, 2);
				pq.sum(11, 12, 23);
				
				//loginInfo
				pq.login(8377778787l, "12344");
				pq.login("komal", "komal@1223");
				
				//Student Details
				pq.getDetails(34);
				pq.getDetails(34, "Komal");
				pq.getDetails(34, "Komal", 78);
				
				//Different Parameters
				pq.print(12);
				pq.print(3.4f);
				
				//changingParameter
				pq.changingParameter(0, null);
				pq.changingParameter(null, 0);
				
				//calculate
				pq.calculate(0, 0, 0);
				pq.calculate(0, 0, 0, false);
				
				
			}
}
