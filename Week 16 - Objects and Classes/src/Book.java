/**
 * @author Robert Giurgiulescu
 * @version 1
 */

public class Book {
	private String title, ISBN;
	private double price;
	private Author author;

	/**
	 * This constructor creates a generic Book with no additional information
	 */
	public Book() {  }

	/**
	 * Constructor which creates a Book with the following details: <code>title</code>,
	 * <code>ISBN</code>, <code>price</code> and <code>author</code>
	 * @param title Book's title
	 * @param ISBN Book's ISBN
	 * @param price Book's price
	 * @param author Book's Author
	 */
	
	Book(String title, String ISBN, double price, Author author) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.ISBN = ISBN;
	}

	/**
	 * Method which returns the <code>title</code> of the Book
	 * @return Book's <code>title</code> 
	 */
	public String getBookTitle() {
		return title;
	}

	/**
	 * Method which modify the <code>title</code> of the Book
	 * @param title Book's title
	 */
	public void setBookTitle(String title) {
		this.title = title;
	}

	/**
	 * Method which returns the <code>author</code> of the Book
	 * @return <code>author</code> Book's Author
	 */
	public Author getBookAuthor() {
		return author;
	}

	/**
	 * Method that returns the <code>price</code> of the Book
	 * @return <code>price</code> Book's price
	 */
	public double getBookPrice() {
		return price;
	}

	/**
	 * Method that modify the <code>price</code> of the Book	
	 * @param price Book's price
	 */
	public void setBookPrice(double price) {
		this.price = price;
	}

	/**
	 * Method that returns the <code>ISBN</code> of the Book
	 * @return <code>ISBN</code> Book's ISBN
	 */
	public String getBookISBN() {
		return ISBN;
	}

	/**
	 * Method that returns a String containing <code>title</code>, Author's first and last name and nationality, 
	 * <code>price</code> and <code>ISBN</code>,
	 * @return A String containing title, Author's name surname and nationality, price and ISBN
	 */
	String getToString() {
		return "Title: " + title + "\nAuthor name and surname: " + author.getFirstName() + " " + author.getLastName() +
				"\nAuthor nationality: " + author.getNationality() + "\nPrice: £" + String.format("%,.2f", price) + "\nISBN: " + ISBN;
	}
}


