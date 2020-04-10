import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingToAFile {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Write the name of the limerick: ");
		String limerickName = scan.nextLine();

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(limerickName + ".txt")));
		String[] lines = new String[5];              

		for (int i = 0; i < lines.length; i++) {
			System.out.print("Enter line number " + (i + 1) + ":  ");
			lines[i] = scan.nextLine();
			out.println(lines[i]);
		}
		out.close();
		scan.close();
		System.out.println("Thank you, data written to file.");
	}
}