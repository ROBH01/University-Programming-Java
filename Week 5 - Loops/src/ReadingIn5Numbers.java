import java.util.Scanner;

public class ReadingIn5Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		int total = 0;

		for (int i = 0; i < numbers.length; i++) { // what it says is: i is less than array's length(this case 5), count adding 1 until you reach 5.
			System.out.print("Number " + (i + 1 + ":  ")); //prints this line 5 times or how many times the values of the array is.
			numbers[i] = scan.nextInt();  //scans and saves the amount from the user in the array, then does this again until reach 5.
		}
		System.out.println();
		System.out.print("Numbers stored:\n");

		for (int number : numbers) { // if number is less than numbers in the array, read next number. 
			System.out.println(number); // prints 5 lines with each of the number stored which has been written by the user.
			total = total + number; // the total is: 0, which is stored at the beginning and +1+1+1+1+1 = 5.    	
		}
		System.out.println("\nThe total is: " + total);
		System.out.println("The average is: " + total / (double)numbers.length);
		scan.close();
	}
}