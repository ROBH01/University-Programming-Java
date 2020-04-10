import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PricesFromUserHL5 {
	Scanner scan = new Scanner(System.in);
	ArrayList<Double> prices = new ArrayList<Double>();

	public void readAndStorePrices() {
		System.out.print("Add as many prices as you wish, once finished type \"stop\": ");
		String request;

		do {
			while (scan.hasNextDouble()) {
				double price = scan.nextDouble();
				prices.add(price);
				System.out.print("Add another price or type stop: "); 
			}
			request = scan.next();
		}
		while (!request.equalsIgnoreCase("stop"));
	}

	public void displayListPrices() {
		System.out.println("\nList of prices: ");
		int count = 0;

		for (double price:prices) {
			count++;
			System.out.println("Price " + count + ": £" + price);
		}
		System.out.println();
	}

	public double totalOfAllPrices() {
		double total = 0;

		for (int i = 0; i < prices.size(); i++) {
			total = total + prices.get(i);
		}
		return total;
	}

	public int numberPricesEntered() {
		int pricesEntered = prices.size();
		return pricesEntered;
	}

	public double averagePrices() {
		double averagePrices = totalOfAllPrices() / numberPricesEntered();
		return averagePrices;	
	}

	public double lowestPriceEntered() {
		double min = Collections.min(prices);
		return min;
	}

	public double highestPriceEntered() {
		double max = Collections.max(prices);
		return max;
	}

	public static void main(String[] args) {
		PricesFromUserHL5 process = new PricesFromUserHL5();
		process.readAndStorePrices();
		System.out.println();
		process.displayListPrices();
		System.out.println("Total of the prices: £" + String.format("%,.2f", process.totalOfAllPrices()));
		System.out.println("Number of prices entered: " + process.numberPricesEntered());
		System.out.println("Average of the prices: £" + String.format("%,.2f", process.averagePrices()));
		System.out.println("Lowest price entered: £" + process.lowestPriceEntered());
		System.out.println("Highest price entered: £" + process.highestPriceEntered());
	}
}
