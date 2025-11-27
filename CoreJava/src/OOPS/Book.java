package OOPS;

public class Book {
	           String book_name;
	           int book_Pages;
	           int  book_Id;
	           int book_price;
	           
              public static void main(String[] args) {
            	  //First object creation of the book class
				Book b1 = new Book();
				
				int id = b1.book_Id=101;
				String name = b1.book_name="The Indian art and culture";
				int pages = b1.book_Pages=300;
				int  price =b1.book_price=250;
				
				System.err.println("First Book Deatils");
				System.out.println("Book Id :" +id);
				System.out.println("Book Name :" + name);
				System.out.println("Book pages : " + pages);
				System.out.println("Book price : "+ price);
				
				//Second object creation of the book class
				Book b2 = new Book();
				
				System.err.println("Second Book Details:");
				int id1 = b2.book_Id =102;
				String name1 =b2.book_name="Indian Polity";
				int pages1 =b2.book_Pages=150;
				int price1 =b2.book_price=200;
				
				System.out.println("Book Id : " + id1);
				System.out.println("Book Name :" + name1);
				System.out.println("Book Pages: " + pages1);
				System.out.println("Book Price: " + price1);
				
				//Third object creation of the book class
				Book b3 = new Book();
				
				int id3 =b3.book_Id =103;
				String name3 = b3.book_name="Ncert";
				int pages3 = b3.book_Pages=400;
				int price3 = b3.book_price=600;
				
				System.err.println("Third Book Details:");
				System.out.println("Book Id : " + id3);
				System.out.println("Book Name : " + name3);
				System.out.println("Book Pages : " + pages3);
				System.out.println("Book Price : " + price3);
				
				
				
				
				
				
				
				
			}
}
