import java.util.Random;
import java.util.Scanner;

public class WritePasswordGenerator {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

	public void twoRandUppLetters() {
		char firstChar = (char)(rand.nextInt(26) + 'A');
		char secondChar = (char)(rand.nextInt(26) + 'A');
		System.out.print(firstChar + "" + secondChar);
	}

	public void threeRandNumbers100to999() {
		int threeDigits = (rand.nextInt(9) * 1 + rand.nextInt(9) * 10 + rand.nextInt((8) + 1) * 100); //correct?
		threeDigits = rand.nextInt(899) + 100;
		System.out.print(threeDigits);
	}

	public void twoRandLowLetters() {
		char firstChar = (char)(rand.nextInt(26) + 'a');
		char secondChar = (char)(rand.nextInt(26) + 'a');
		System.out.print(firstChar + "" + secondChar);
	}

	public void oneRandChar() {
		String chars = "!£$~_%@<>?";
		char symbol = chars.charAt(rand.nextInt(chars.length()));
		System.out.print(symbol);
	}


	public static void main(String[] args) {
		WritePasswordGenerator process = new WritePasswordGenerator();
		System.out.print("The password is: ");
		process.twoRandUppLetters();
		process.threeRandNumbers100to999();
		process.twoRandLowLetters();
		process.oneRandChar();
	}
}
