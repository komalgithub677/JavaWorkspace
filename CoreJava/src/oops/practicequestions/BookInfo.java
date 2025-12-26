package oops.practicequestions;

import java.util.Scanner;

public class BookInfo {
             public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter BookId :");
				int id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the Book Title : ");
				String title = sc.nextLine();
				
				System.out.println("Enter the book Author :");
				String author = sc.nextLine();
				
				Book book = new Book(id ,title , author);
				
				System.out.println("Enter student Name :");
				String userName = sc.nextLine();
				
				StudentUser student = new  StudentUser(userName , book);
				
				student.issueBook();
				student.returnBook();
				student.showDetails();
				
			}

			

			
}
