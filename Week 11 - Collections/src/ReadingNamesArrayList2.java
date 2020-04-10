import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingNamesArrayList2 {
	ArrayList<String> names = new ArrayList<>();
	
	public void storeNames() {
		try {
			Scanner scan = new Scanner(new File("names.txt"));

			while (scan.hasNext()) {
				String name = scan.nextLine();
				names.add(name);
			}
			scan.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File not found, make sure the name of the file is correct.");
		}
	}
	
	public void displayNames() {
		System.out.println("Names are: \n");
		for (String name:names) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) throws Exception {
		ReadingNamesArrayList2 names = new ReadingNamesArrayList2();
		names.storeNames();
		names.displayNames();
	}
}
