package encapsulation;

public class BookInfo {
             public static void main(String[] args) {
				Book b = new Book();
				b.settitle("Indian Polity");
				b.setPrice(500);
				
				System.err.println("Book Deatails");
				System.out.println("Book Name :" + b.gettitle());
				System.out.println("Book Price :" + b.getPrice());
			}
}
