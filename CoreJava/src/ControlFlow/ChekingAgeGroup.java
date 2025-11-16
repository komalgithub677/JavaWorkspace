package ControlFlow;

public class ChekingAgeGroup {
             public static void main(String[] args) {
				int age = 10;
				if(age<10) {
					System.out.println("age group falls under the kid");
				}
				else if(age>11 && age<17) {
					System.out.println("age group is falled under the teenage");
				}
				else if(age>=18 && age<30) {
					System.out.println("age group is falled under the adult");
				}
				else if(age>=31) {
					System.out.println("age group is falled under the senior category");
				}
			}
}
