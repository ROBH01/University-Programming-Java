
public class BookTest {

	public static void main(String[] args) {
		Author author1 = new Author("Martin", "***REMOVED***", "Pakistani");
		Author author2 = new Author("Dan", "Brown", "American");
		
		Book book1 = new Book("Da Vinci's Code", "ISBN5948548548", 32.20, author2);
		Book book2 = new Book("The Pakistani War", "ISBN4484647965", 15.20, author1);
		
		System.out.println(book1.getToString());
		System.out.println();
		System.out.println(book2.getToString());
	}
}