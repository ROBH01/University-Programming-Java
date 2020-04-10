import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadingDeletingAddingNames4 {
	ArrayList<String> names = new ArrayList<>();
	Scanner scanTypeIn = new Scanner(System.in);

	public void storingNames() {
		try {
			File myFile = new File("namesDeleteAdd.txt");
			Scanner scanRead = new Scanner(myFile);

			while (scanRead.hasNext()) {
				String name = scanRead.next();
				names.add(name);
			}
			scanRead.close();
		}
		catch (FileNotFoundException ex) {
			System.err.println("File not found");
		}
	}

	public void displayNames() {
		Collections.sort(names);
		System.out.println("Names in the file: ");
		int count = 0;
		
		for (String namee : names) {
			count++;
			String nameeUppercase = namee.substring(0, 1).toUpperCase() + namee.substring(1);
			System.out.println("Name " + count + ": " + nameeUppercase);
		}
	}

	public void userChoice() {
		System.out.print("\nPress 1 if you want to add data \nPress 2 if you want to delete data \nPress 3 to exit: ");
		int action = scanTypeIn.nextInt();

		while (action != 1 && action != 2 && action != 3) {
			System.out.println("Please... \nPress 1 if you want to add data \nPress 2 if you want to delete data \nPress 3 to exit \n");
			action = scanTypeIn.nextInt();
		}
		if (action == 1) {
			addData();
		}
		else if (action == 2) {
			deleteData();
		}
		else if (action == 3) {
			System.out.println("Thank you for using the program");
			System.exit(0);
		}
	}

	public void addData() {
		String name;
		int count = 0;

		do {
			count++;
			System.out.print("Write name number " + (count) + " to add to the list or type \"quit\" to stop: ");
			name = scanTypeIn.next();
			if (!name.equalsIgnoreCase("quit")) {
				names.add(name);	
			}
		} while (!name.equalsIgnoreCase("quit"));
		System.out.println("\nNames added, new list: ");

		for (String namee : names) {
			String nameeUppercase = namee.substring(0, 1).toUpperCase() + namee.substring(1);
			System.out.println(nameeUppercase);
		}
	}

	public void deleteData() {
		String name;
		System.out.print("Write names to delete from the list or type \"quit\" to stop: ");

		do {
			name = scanTypeIn.next();
			if (!name.equalsIgnoreCase("quit")) {
				names.remove(name);	
				System.out.print("Write another name or quit: ");
			}
		} while (!name.equalsIgnoreCase("quit"));
		System.out.println("\n\nNames deleted, new list: ");
		
		if (names.isEmpty()) {
			System.out.print("All names deleted, no names found.");
		}
		for (String namee : names) {
			String nameeUppercase = namee.substring(0, 1).toUpperCase() + namee.substring(1);
			System.out.println(nameeUppercase);
		}
	}


	public static void main(String[] args) throws FileNotFoundException {	
		ReadingDeletingAddingNames4 process = new ReadingDeletingAddingNames4();
		process.storingNames();
		process.displayNames();
		process.userChoice();	
	}
}
