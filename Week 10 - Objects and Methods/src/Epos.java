
public class Epos {  // name descriptive of what i am doing

	public void returnPrice(double price) {
		System.out.println("The price is: £" + price);
	}

	public void total(double price, int quantity) {
		double totalPrice = price * quantity;
		System.out.println("The total is: £" + totalPrice);
	}

	public void returnFormatCurrency(double price) {
		System.out.println("Formatted price: £" + String.format("%,.2f", price));
	}

	public void returnTotalAnyPrices(double ...prices) { // VARARGS = <<...prices>> means that can take in any number of parameters, not just one.
		double totalPrices = 0;
		int count = 0;

		for (double price : prices) {
			count++;
			totalPrices = totalPrices + price;
		}
		System.out.println("Total of the prices entered: £" + String.format("%,.2f", totalPrices) + "\nPrices entered = " + count);
	}

	public void discountPrices(double ...prices) {
		double totalPrices = 0;
		int count = 0;
		int pricesEntered = 0;

		for (double price : prices) {
			if (price == 0) {
				count--;
			}
			count++;
			pricesEntered++;
			totalPrices = totalPrices + price;
		}
		if (count < 5) {
			System.out.println("Total of the prices entered: £" + String.format("%,.2f", ((totalPrices))));
			System.out.println("Discount applied: £" + "0");
			System.out.println("Total discounted: £" + String.format("%,.2f", totalPrices) + "\nPrices entered = " + pricesEntered);
		}
		else if (count >= 5 && count < 10) {
			System.out.println("Total of the prices entered: £" + String.format("%,.2f", ((totalPrices))));
			System.out.println("Discount of 5%: £" + (totalPrices - ((totalPrices) - totalPrices * 0.05)));
			System.out.println("Total discounted: £" + String.format("%,.2f", ((totalPrices) - totalPrices * 0.05)) + "\nPrices entered = " + pricesEntered);
		}
		else if (count >= 10) {
			System.out.println("Total of the prices entered: £" + String.format("%,.2f", ((totalPrices))));
			System.out.println("Discount of 10%: £" + (totalPrices - ((totalPrices) - totalPrices * 0.1)));
			System.out.println("Total discounted: £" + String.format("%,.2f", ((totalPrices) - totalPrices * 0.1)) + "\nPrices entered = " + pricesEntered);
		}
	} 


	public static void main(String[] args) {
		Epos myEPOS = new Epos();
		myEPOS.returnPrice(100);
		System.out.println();
		myEPOS.total(10, 5);
		System.out.println();
		myEPOS.returnFormatCurrency(1000000);
		System.out.println();
		myEPOS.returnTotalAnyPrices(1000, 200, 800);
		System.out.println();
		myEPOS.discountPrices(10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
	}
}
