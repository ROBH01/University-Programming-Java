
class Book {
	private String title, author, ISBN;
	private double price;
	
	Book() {  }
	
	Book(String title, String author, double price, String ISBN) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.ISBN = ISBN;
	}
	
	String getBookTitle() {
		return title;
	}

	void setBookTitle(String title) {
		this.title = title;
	}

	String getBookAuthor() {
		return author;
	}

	double getBookPrice() {
		return price;
	}

	void setBookPrice(double price) {
		this.price = price;
	}

	String getBookISBN() {
		return ISBN;
	}
}
