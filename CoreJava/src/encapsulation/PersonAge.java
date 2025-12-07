package encapsulation;

public class PersonAge {
//	Create a Person class where age is private.
//	Allow setting age only if age > 0.
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
	}
}
