import java.util.Scanner;

public class ComparingWordsModified {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String word1 = scan.nextLine();

		System.out.print("Enter second word: ");
		String word2 = scan.nextLine();

		if (word1.equalsIgnoreCase(word2)) {
			System.out.println("Words are the same");	
		}
		else {
			System.out.println("Words are different");		
		}
		if (word1.compareToIgnoreCase(word2) > 0) {
			System.out.println(word2 + " comes before " + word1);
		}
		if (word1.compareToIgnoreCase(word2) < 0) {	
			System.out.println(word1 + " comes before " + word2);	
		}
		scan.close();
	}
}