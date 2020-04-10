import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ImplementAConversionProgram {
	double[] values = new double[3];
	Scanner scan = new Scanner(System.in);

	public void convertionMenu(){
		System.out.println("This is the menu:\n");
		System.out.println("1. Enter pound values");
		System.out.println("2. Euros");
		System.out.println("3. Dollars");
		System.out.println("4. Yen");
		System.out.println("5. Rupees");
		System.out.println("6. Exit");

		System.out.print("\nSelect the number you want to perform: "); 
		int number = scan.nextInt();

		while (number != 1 && number != 6) {
			System.out.print("\nI need values to convert first, press 1 to type in values or 6 to exit: ");
			number = scan.nextInt();
		} 
		if (number == 6) {
			System.out.println("\nThank you for using the program.");
			System.exit(0);
		}
	}

	public double[] enterPoundsValues(){
		System.out.println("\nEnter 3 values in pounds:");
		values = new double[3];

		for (int i = 0; i < values.length; i++) {
			values[i] = scan.nextDouble();
		}
		System.out.println("\nValues saved");
		return values;
	}

	public double[] exchangingMoney(double exchangeRate) {
		double[] exchangedMoney = new double[values.length];
		System.out.println();
		System.out.println("Original values: \t Converted values:");
		double totalValues = 0;
		double totalValuesConverted = 0;

		for (int i = 0; i < values.length; i++) {
			exchangedMoney[i] = values[i] * exchangeRate;
			System.out.println(String.format("%,.2f", values[i]) + "\t\t" + String.format("%,.2f", exchangedMoney[i]));
			totalValues = totalValues + values[i];
			totalValuesConverted = totalValuesConverted + exchangedMoney[i];
		}
		System.out.println("\nTotal of values: " + totalValues + "\t\tTotal of values converted: " + totalValuesConverted);
		return exchangedMoney;
	}


	public static void main(String[] args) {
		ImplementAConversionProgram process = new ImplementAConversionProgram();
		Scanner scan = new Scanner(System.in);
		int choice;
		try {
			do {
				process.convertionMenu();
				process.enterPoundsValues();
				System.out.println("Are your values right? \n" + Arrays.toString(process.values) + "\nIf not press 1 to change or any other number to continue: ");
				if (scan.nextInt() == 1) {
					process.enterPoundsValues();
				}
				System.out.print("\nNow, select the exchange rate you want to perform: \n2: to convert in euros \n3: to convert in dollars \n4: to convert in yen \n5: to convert in rupees \n6: to exit the program \n");
				choice = scan.nextInt();

				while (choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6) {
					System.out.print("\nWrong selection, please type: \n2: to convert in euros \n3: to convert in dollars \n4: to convert in yen \n5: to convert in rupees \n6: to exit the program ");
					choice = scan.nextInt();
				}
				
				switch (choice) {
					case 2:
						double poundToEuro = 1.1324;
						process.exchangingMoney(poundToEuro);
						break;
					case 3: 
						double poundToDollars = 1.1339;
						process.exchangingMoney(poundToDollars);
						break;
					case 4: 
						double poundToYen = 150.4245;
						process.exchangingMoney(poundToYen);
						break;
					case 5: 
						double poundToRupees = 86.1550;
						process.exchangingMoney(poundToRupees);
						break;
					case 6: 
						System.out.print("\nThank you for using the program.");
						System.exit(0);
						break;
					default: 
						System.out.print("Enter a number between 2 and 6: ");
						choice = scan.nextInt();
						break;
				}
				System.out.println();
				System.out.print("Would you like to convert values again? (yes/no): ");
				String repeat = scan.next();

				while (!repeat.equalsIgnoreCase("no") && !repeat.equalsIgnoreCase("yes")) {
					System.out.print("Would you like to convert again? (yes/no): ");
					repeat = scan.next();
				}
				if (repeat.equalsIgnoreCase("no")) {
					System.out.print("\nThank you for using the program.");
					System.exit(0);
				}
				System.out.println();
			} while (choice != 1);
		}
		catch (InputMismatchException ex) {
			System.err.println("\nWrong data typed in, expected a number. Please restart the program");
		}
		scan.close();
	}
}