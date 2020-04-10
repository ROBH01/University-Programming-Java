import java.util.Scanner;

public class PrintBackwards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string;
		System.out.print("Write something: ");
		string = scan.nextLine();

		for (int i = string.length(); i > 0; i--) {
			System.out.print(string.charAt(i - 1)); 
		}
		scan.close();
	}
}