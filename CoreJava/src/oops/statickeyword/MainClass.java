package oops.statickeyword;

public class MainClass {
	{
		System.out.println("Non-static");
	}
	 public static void main(String[] args) {
			Demo1 d = new Demo1(1 ,"Komal");
			Demo1 d1 = new Demo1(2 ,"Monika");
			d.display();
			d1.display();
			
			MainClass m = new MainClass();	
		}
}





