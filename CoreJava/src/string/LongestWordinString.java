package string;

public class LongestWordinString {
              public static void main(String[] args) {
				String arr[] = {"Komal" ,"Sonali" ,"Disha" ,"Sonali"};
				
				String longest =arr[0];
				
				for(int i=0; i<arr.length; i++) {
					if(arr[i].length()> longest.length()) {
						longest = arr[i];
					}
				}
				
				System.out.println("Longest word : " + longest);
			}
}
