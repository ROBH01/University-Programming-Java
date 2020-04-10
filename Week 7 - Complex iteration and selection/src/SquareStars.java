import java.util.Scanner;

public class SquareStars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.print("Insert size: ");	
		size = scan.nextInt();

		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size ; j++) {
				System.out.print("*  ");
			}
			System.out.println();	
		}
		scan.close();
	}
}
