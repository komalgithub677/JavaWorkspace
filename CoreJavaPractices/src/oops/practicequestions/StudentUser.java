package oops.practicequestions;

public class StudentUser extends User{
	        Book book;
	        final double late_fee = 10.0;
	        
			public StudentUser(String userName, Book book) {
				super(userName);
				this.book = book;
			}
	        
			public void issueBook() {
				System.out.println("Book isuued to : " + userName);
			}
			
			public void returnBook() {
				System.out.println("Book issue to : " + userName);
				System.out.println("Late Fee : " + late_fee);
			}
			
			public void showDetails() {
				System.out.println("User Name :" + userName);
				System.out.println("Book id : " + book.getId());
				System.out.println("Book Name" + book.getTitle());
				System.out.println("Book author : " + book.getAuthor());
			}
	       

	

	

}
