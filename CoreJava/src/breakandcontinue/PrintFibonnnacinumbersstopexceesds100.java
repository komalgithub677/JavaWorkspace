package breakandcontinue;

public class PrintFibonnnacinumbersstopexceesds100 {
               public static void main(String[] args) {
            	   int f0 =0;
            	   int f1 =1;
            	   System.out.println(f0);
            	   System.out.println(f1);
            	 
				for(int i=1; i<=100; i++) {
					int f2 = f0 + f1;
					
					if(f2>100) {
						break;
					}
					System.out.println(f2);
					f0 = f1;
					f1 =f2;
				}
			}
}
