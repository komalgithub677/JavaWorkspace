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
			}
}
