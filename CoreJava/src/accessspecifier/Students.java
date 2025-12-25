package accessspecifier;

public class Students {
             private String name;
             
             public void  setName(String name) {
            	 this.name = name;
            	 
             }
             
             public String  getName() {
            	 return name;
             }
             
             public static void main(String[] args) {
				Students s = new Students();
				s.setName("Komal");
				System.out.println("Name : " + s.getName());
			}
}
