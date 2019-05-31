package recap;

public class BookTest {
	public static void main(String[] args) {
		Book b1=new Book();
		System.out.println();
		
		Book b2=new Book("David");
		b2.bookDetails();
		System.out.println();
		
		Book b3=new Book("James", "Roman", 12);
		b3.bookDetails();
		System.out.println();
		
		Book b4=new Book("Jhon", "Drama");
		b4.bookDetails();
		b4.price=38;
		
		System.out.println("Number of books: "+Book.count);
	}
}
