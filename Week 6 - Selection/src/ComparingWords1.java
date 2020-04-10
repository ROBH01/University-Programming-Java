import java.util.Scanner;

public class ComparingWords1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String word1 = scan.nextLine();

		System.out.print("Enter second word: ");
		String word2 = scan.nextLine();

		if (word1.equalsIgnoreCase(word2)) {
			System.out.println("\nWords are the same.");	
		}
		else {
			System.out.println("\nWords are different.");		
		}
		scan.close();
	}
}