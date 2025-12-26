package oops.practicequestions;

public class Book {
         private int id;
         private String title;
         private String author;
         
         
		public Book(int id, String title, String author) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
		}
		public int getId() {
			return id;
		}
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
}
