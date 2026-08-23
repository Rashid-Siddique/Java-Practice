package books;

public class Book {
	
	int bookId;
	String bookName;
	String authorName;
	int bookPrice;
	
	public Book(int bookId, String bookName, String authorName, int bookPrice){
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		
	}
	
	void display() {
		
		System.out.println("Book Id :" + bookId);
		System.out.println("Book Name :" + bookName);
		System.out.println("Author Name :" + authorName);
		System.out.println("Book Price $:" + bookPrice);
		System.out.println("-----------------------------------");
	}

}
