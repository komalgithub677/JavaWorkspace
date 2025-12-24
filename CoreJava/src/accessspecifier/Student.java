package accessspecifier;

//We can apply only the public and default to the class
 class Student {
	//we can apply the default ,protected , private , public to the Instance varibles
	      protected int a;
	      protected int b;
	      protected int c;
	       
	    protected Student() {
	    	System.out.println("This is the constructor of the student class");
	    }
        protected void my() {
        	//We cannot apply Access specifiers to the Local variables
        	 System.out.println("This is the method of the Student class");
        	 
        }
         
         public static void main(String[] args) {
			Student s = new Student();
			int a = s.a;
			int b = s.b;
			int c = s.c;
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c :" + c);
			
			s.my();
			
			
		}
         
}
