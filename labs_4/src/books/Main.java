package books;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
		Book b1 = new Book(101, "Java Programming", "James Gosling", 99);
		Book b2 = new Book(102, "Python Basics", "Guido van Rossum", 99);
		Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 99);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		for(Book b : books) {
			
			b.display();
		}
		
	}

}
