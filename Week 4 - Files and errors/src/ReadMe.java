import java.io.File;
import java.util.Scanner;

public class ReadMe {

	public static void main(String[] args) throws Exception {
		File me = new File("me.txt");
		Scanner scan = new Scanner(me);
		
		String name;
		name = scan.nextLine();
		System.out.println("Name: " + name);

		String address;
		address = scan.nextLine();
		System.out.println("Address: " + address);

		String phoneNumber;           
		phoneNumber = scan.nextLine();
		System.out.println("Phone number: " + phoneNumber); 
		scan.close();	
	}
}