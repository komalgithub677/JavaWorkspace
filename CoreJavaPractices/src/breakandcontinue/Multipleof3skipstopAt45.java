package breakandcontinue;

public class Multipleof3skipstopAt45 {
             public static void main(String[] args) {
            	 //Print multiples of 3 from 3 to 100 but stop when a number becomes 45.
				for(int i=3; i<=100; i++) {
					if(i%3==0) {
						System.out.println(i);
						if(i==45) {
						break;
						}
					}
				
				}
			}
}
