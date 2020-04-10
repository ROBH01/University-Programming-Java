import java.util.Arrays;
import java.util.Random;

public class ArrayTask {

	public static void main(String[] args) {
		String[] names = {"Hardwell", "Tiesto", "Armin Vaan Buuren", "Dannic", "Bottai", "Lost Frequencies", "Angemi", "David Guetta", "Robin Schulz", "Afrojack"};

		System.out.println("Content of the array: " + Arrays.toString(names)); 
		Arrays.sort(names); // Arrays.sort is used to SORT the array in Alphabetic order.
		System.out.println("Sorted array: " + Arrays.toString(names));
		System.out.println("Result of the search: " + Arrays.binarySearch(names, "Angemi")); // Arrays.binarySearch(names, "Angemi") = Shows 1 because Angemi is on the upper half at index 1
		System.out.println("Result of the search: " + Arrays.binarySearch(names, "ROBH")); // shows -9 because it isn't this name.

		Random winner = new Random();
		System.out.println("Congratulations " + names[winner.nextInt(10)] + ". You win!"); // names[randomname.nextInt(10)] = Chose randomly one name from 1 to 10.
	}
}