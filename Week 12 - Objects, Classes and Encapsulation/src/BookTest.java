
public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		book.setBookTitle("Be a Programmer");
		book.setBookPrice(34.50);
		System.out.println("Title: " + book.getBookTitle());
		System.out.println("Author: " + book.getBookAuthor());
		System.out.println("Price: £" + book.getBookPrice());
		System.out.println("ISBN: " + book.getBookISBN());

		Book daVinci = new Book("The Da Vinci Code", "Dan Brown", 25.55, "0000");
		System.out.println(daVinci.getBookTitle());
	}
}
