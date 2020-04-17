import java.util.Arrays;
import java.util.Scanner;

public class RandomMethods {

	private Scanner scan = new Scanner(System.in);

	private void store3Prices() {
		double[] prices = new double[3];
		for (int i = 0; i < prices.length; i++) {
			prices[i] = scan.nextDouble();
		}
		for (double price : prices) {
			System.out.println(price);
		}
		System.out.println(Arrays.toString(prices));
	}

	private void switchExample() {
		System.out.println("1. First");
		System.out.println("2. Second");
		System.out.println("3. Third");
		System.out.print("Select your choice: ");
		int choice = scan.nextInt();

		switch (choice) {
		case 1: System.out.println("You chose first");
				break;
		case 2: System.out.println("You chose second");
				break;
		case 3: System.out.println("You chose third");
				break;
		}
	}


	public static void main(String[] args) {
		RandomMethods rm = new RandomMethods();

		rm.store3Prices();
		rm.switchExample();
	}
}
