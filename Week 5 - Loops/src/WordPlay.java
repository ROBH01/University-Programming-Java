/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 15/11/2017
 * Week 15
 * Task number 3
 * 
 * There are words which, if you move the first letter to
 * the end of them, and then spell the result backwards, 
 * you will get the original word. This program reads a word
 * from the user and determines whether the word has this 
 * property or not. The program continues to read and test, 
 * until the user write the word quit. Also, there is no 
 * difference between upper case and lower case letters. 
 */

import java.util.Scanner;

public class WordPlay {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word;
		String firstChar;
		String finalWord;
		String newWord;
		System.out.print("Enter a word to be tested... ");
		word = scan.nextLine();

		while (!word.equalsIgnoreCase("quit")) {
			firstChar = word.substring(0, 1); 
			finalWord = word.substring(1) + firstChar; 
			newWord = "";

			for (int i = finalWord.length() - 1; i >= 0; i--) { // This loop reverses the finalWord.
				newWord = newWord + finalWord.charAt(i);
			}
			if (newWord.equalsIgnoreCase(word)) {
				System.out.print("Is " + newWord + " same as " + word + " ... true \n");
			}
			else {
				System.out.print("Is " + newWord + " same as " + word + " ... false \n");
			}
			System.out.print("\nEnter a word to be tested or type quit... ");
			word = scan.nextLine();
		}
		System.out.print("\nThank you for using the program");
		scan.close();
	}
}