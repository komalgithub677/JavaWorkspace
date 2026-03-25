package dowhileloop;

public class PrintAllNaturalNumbers {
             public static void main(String[] args) {
				int i=1;
				int sum=0;
				do {
					sum +=i;
					System.out.println(sum);
					i++;
				}while(i<=100);
			}
}
