package practice;

public class ConverStringIntoUppercase {
             public static void main(String[] args) {
				String s1 = "Komal";
				System.out.println(s1.toUpperCase());
				char[] arr = s1.toCharArray();
				
				for(int i=0; i<arr.length; i++) {
					if(arr[i]%2!=0) {
						arr[i+1] = ',';
					}
				}
				System.out.println(arr);
				
             }				
				 
}
