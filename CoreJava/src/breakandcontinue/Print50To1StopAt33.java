package breakandcontinue;

public class Print50To1StopAt33 {
             public static void main(String[] args) {
				for(int i=50; i>=1; i--) {
					if(i==33) {
						break;
					}
					System.out.println(i);
				}
			}
}
