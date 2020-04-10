import java.util.Scanner;

public class OneToWhat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type in a whole number: ");
		int number = scan.nextInt();

		for (int i = 0; i <= number; i++) {
			System.out.println(i);	
		}
		scan.close();
	}
}