import java.util.Scanner;

public class ComparingWordsModified2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1;
		String word2;
		String request;

		do {
			System.out.print("Enter first word: ");
			word1 = scan.nextLine();

			System.out.print("Enter second word: ");
			word2 = scan.nextLine();

			if (word1.equalsIgnoreCase(word2)) {
				System.out.println("\nWords are the same");	
			}
			else {
				System.out.println("\nWords are different");		
			}
			System.out.println();
			if (word1.compareToIgnoreCase(word2) > 0) {
				System.out.println(word2 + " comes before " + word1);
			}
			if (word1.compareToIgnoreCase(word2) < 0) {	
				System.out.println(word1 + " comes before " + word2);	
			}
			System.out.print("Would you like to enter two more words?(y/n): ");
			request = scan.nextLine();
		}
		while (request.equalsIgnoreCase("y"));
		System.out.println("\nThank you for using this program");
		scan.close();
	}
}