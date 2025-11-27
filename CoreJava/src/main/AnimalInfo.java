package main;

import oops.Animal;
public class AnimalInfo {
//	 String name;
//     String color;
//     int age;
//     String legs;
	public static void main(String[] args) {
		
		//First object creation from the animal class
		Animal a = new Animal();
		String name1 = a.name = "Dog";
		String color1 = a.color = "Brown";
		int age1 = a.age = 12;
		int legs1 = a.legs = 4;
		String breed1 = a.breed = "Pomeranian";
		
		System.err.println("Animal Information : ");
		System.out.println("Animal name : " + name1);
		System.out.println("Animal color :" + color1);
		System.out.println("Animal age : " + age1);
		System.out.println("Animal legs : " + legs1);
		System.out.println("Animal Breed : " + breed1);
		
		//Second object creation from the animal class
		Animal a2 = new Animal();
		String name2 = a.name = "Cow";
		String color2 = a.color = "Black and White";
		int age2 = a.age = 12;
		int legs2 = a.legs = 4;
		String breed2 = a.breed = "Gir";
		
		System.err.println("Animal Information : ");
		System.out.println("Animal name : " + name2);
		System.out.println("Animal color :" + color2);
		System.out.println("Animal age : " + age2);
		System.out.println("Animal legs : " + legs2);
		System.out.println("Animal Breed : " + breed2);
		
		//Second object creation from the animal class
		Animal a3 = new Animal();
		String name3 = a3.name = "Horse";
		String color3 = a3.color = "Brown";
		int age3 = a3.age = 12;
		int legs3 = a3.legs = 4;
	    String breed3 = a3.breed = "Deccan";
				
		System.err.println("Animal Information : ");
		System.out.println("Animal name : " + name3);
		System.out.println("Animal color :" + color3);
		System.out.println("Animal age : " + age3);
		System.out.println("Animal legs : " + legs3);
		System.out.println("Animal Breed : " + breed3);
		
		//Four object creation from the animal class
		Animal a4 = new Animal();
		String name4 = a4.name = "Cat";
		String color4 = a4.color = "White";
		int age4 = a4.age = 12;
		int legs4 = a4.legs = 4;
		String breed4 = a4.breed = "Indian Cat";
				
		System.err.println("Animal Information : ");
		System.out.println("Animal name : " + name4);
		System.out.println("Animal color :" + color4);
		System.out.println("Animal age : " + age4);
		System.out.println("Animal legs : " + legs4);
		System.out.println("Animal Breed : " + breed4);
		
		//Fifth object creation from the animal class
		Animal a5 = new Animal();
		String name5 = a5.name = "Goat";
		String color5 = a5.color = "Black";
		int age5 = a5.age = 12;
		int legs5 = a5.legs = 4;
		String breed5 = a5.breed = "Sirohi";
				
		System.err.println("Animal Information : ");
		System.out.println("Animal name : " + name5);
		System.out.println("Animal color :" + color5);
		System.out.println("Animal age : " + age5);
		System.out.println("Animal legs : " + legs5);
		System.out.println("Animal Breed : " + breed5);
	}
      
}
