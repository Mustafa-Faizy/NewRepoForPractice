package OOP_Modifiers;

public abstract class Book { // abstract class.

	
	private String title;
	private String author;
	private int numberOfPages;
	private String publisher;
	private String edition;
	private static int count = 0;
	
    public abstract void getName(); //abstract method.
	
	public Book(String title, String author, int numberOfPages, String publisher, String edition) {
		super();
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.publisher = publisher;
		this.edition = edition;
		
		count++;
	}
	
	
	
	
	public int getCount() {
		return count;
	}
	
	
	
	public static void numberOfBooksInTheSystem() {
		System.out.println("Number of books created in this system is: " + count);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
