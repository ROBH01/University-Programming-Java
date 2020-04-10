import java.util.Arrays;
import java.util.Scanner;

public class ReadingInDataTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] numbers = new int [5];

		System.out.print("Write the first number: ");
		numbers [0] = scan.nextInt();

		System.out.print("Write the second number: ");
		numbers [1] = scan.nextInt();

		System.out.print("Write the third number: ");
		numbers [2] = scan.nextInt();

		System.out.print("Write the fourth number: ");
		numbers [3] = scan.nextInt();

		System.out.print("Write the fifth number: ");
		numbers [4] = scan.nextInt();
		System.out.println();

		System.out.println("The content of the array is: " + Arrays.toString(numbers));
		System.out.println();

		int total = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]);
		System.out.println("The total is: " + total);
		System.out.println();

		System.out.println("The average is: " + (double)total / numbers.length); // numbers.length is used to show how many values the array has.
		scan.close();
	}
}