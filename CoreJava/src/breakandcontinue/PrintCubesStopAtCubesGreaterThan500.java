package breakandcontinue;

public class PrintCubesStopAtCubesGreaterThan500 {
             public static void main(String[] args) {
            	 //Print cubes (1³, 2³…) but stop when cube crosses 500.
				for(int i=1; i<=100; i++) {
					int cubes = i*i*i;
					if(cubes>500) {
						break;
					}
					System.out.println(cubes);
				}
			}
}
