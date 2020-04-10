import java.io.File;
import java.util.Scanner;

public class ReadInWhatFile {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Write the name of the file: ");
		String fileName = scan.nextLine();

		File myFile = new File(fileName + ".txt");
		Scanner scanFile = new Scanner(myFile);

		System.out.println("The file contains: ");
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		System.out.println(scanFile.nextLine());
		
		scan.close();
		scanFile.close();
	}
}