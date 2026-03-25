package arrays.twodarrays;

public class EvenNumber {
             public static void main(String[] args) {
            	 int num1[][] ={{10,21,50,70,30},{70,30,60,60,0}};
         		for(int i=0; i<num1.length; i++) {
         			for(int j=0; j<num1[i].length; j++) {
         				if(num1[i][j]%2==0){
         					System.out.print(num1[i][j] + " ");
         				}
         			}
         			System.out.println();
         		}
			}
}
