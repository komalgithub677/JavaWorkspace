package accessspecifier;

public class Person {
          private int age;
          
          public static void main(String[] args) {
			Person p = new Person();
			int age = p.age =12;
			System.out.println("Age Of Person : " + age);
		}
}
