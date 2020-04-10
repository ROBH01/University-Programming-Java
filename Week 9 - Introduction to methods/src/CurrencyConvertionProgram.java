/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 10/12/2017
 * Week 20
 * Task number 1
 * 
 * This program allows the user to type in 10 currencies in pounds and
 * store them into an array. The program then ask the user which currencies
 * they want to perform (euro, dollar, yen or rupee) and shows the original
 * and the exchanged values of them. The program stops when the user press 6.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConvertionProgram {
	double[] values = new double[10];
	Scanner scan = new Scanner(System.in); // created global even though one method is using it because if I close it in the method, the main will not work as it needs the scanner too.

	public void displayMenu() {
		System.out.println("This is the menu:\n");
		System.out.println("1. Enter pound values");
		System.out.println("2. Euros");
		System.out.println("3. Dollars");
		System.out.println("4. Yen");
		System.out.println("5. Rupees");
		System.out.println("6. Exit");
	}

	public double[] storingPoundValues() {
		System.out.println("\nEnter 10 values in pounds:");
		values = new double[10];

		for(int i = 0; i < values.length; i++) {
			values[i] = scan.nextDouble();
		}
		return values;
	}

	public double[] convertsAndDisplaysPoundsInOtherCurrencies(double exchangeRate, char currencySymbol) {
		double[] convertedMoney= new double[values.length];
		System.out.println();
		System.out.println("Original values: \t Converted values:\n");
		double totalValues = 0;
		double totalValuesConverted = 0;

		for (int i = 0; i < values.length; i++)	{
			convertedMoney[i] = values[i] * exchangeRate;
			System.out.println(String.format("£" + "%,.2f", values[i]) + "\t\t\t" + String.format(currencySymbol + "%,.2f", convertedMoney[i]));
			totalValues = totalValues + values[i];
			totalValuesConverted = totalValuesConverted + convertedMoney[i];
		}
		System.out.println(String.format("\nTotal of values: £" + "%,.2f", totalValues));
		System.out.println(String.format("Total of values converted: " + currencySymbol + "%,.2f", totalValuesConverted));
		return convertedMoney;
	}


	public static void main(String[] args) {
		CurrencyConvertionProgram process = new CurrencyConvertionProgram();
		Scanner scan = new Scanner(System.in);
		int request = 0;

		try {
			do {
				process.displayMenu();
				System.out.print("\nSelect the number you want to perform: ");
				int selection = scan.nextInt();

				while (selection != 1 && selection != 2 && selection != 3 && selection != 4 && selection != 5 && selection != 6) {
					System.out.print("\nInvalid selection, select from 1 to 6: ");
					selection = scan.nextInt();
				}
				switch (selection) {
					case 1: 
						process.storingPoundValues();
						System.out.println("\nValues saved");
						break;
					case 2: 
						process.convertsAndDisplaysPoundsInOtherCurrencies(1.1324, '€');
						break;
					case 3: 
						process.convertsAndDisplaysPoundsInOtherCurrencies(1.1339, '$');
						break;
					case 4: 
						process.convertsAndDisplaysPoundsInOtherCurrencies(150.4245, 'y'); // replaced with 'y' because of format errors which occur with the yen symbol.
						break;
					case 5: 
						process.convertsAndDisplaysPoundsInOtherCurrencies(86.1550, 'r'); // replaced with 'r' because of format errors which occur with the rupee symbol.
						break;
					case 6: 
						System.out.println("\nThank you for using the program.");
						System.exit(0);
						break;
				}
				System.out.println();
			} while (request != 6);

			scan.close();
		} 
		catch (InputMismatchException ex) {
			System.err.println("\nWrong data type inserted"); // displayed when the user types in wrong data type.
		}
	}
}
