package recap;

public class Book {
	String author;
	// public static author
	String bookType;
	int price;
	static int count=0;
	
	public Book() {
		System.out.println("This non-argument Constructor ");
		count++;
	}
	public Book(String author) {
		this.author=author;
		count++;
	}
	public Book(String author, String bookType) {
		this.author=author;
		this.bookType=bookType;
		count++;
	}
	public Book(String author, String bookType, int price) {
		this.author=author;
		this.bookType=bookType;
		this.price=price;
		count++;
	}
	
	public void bookDetails() {
		System.out.println("Author: "+author);
		System.out.println("Book Type: "+ bookType);
		System.out.println("Price :"+price);
	}
}
