/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 03/12/2017
 * Week 20
 * Upload number 5
 * Task number 3
 * 
 * This program has different tasks to be completed and each task has it's own method. 
 * There are 7 methods plus the main method, from where the other methods will be run.
 * 
 */

public class ImplementProcessStringsAndModify {
	
	public String reverseString(String string) {
		String reversedString = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString = reversedString + string.charAt(i);
		}
		return reversedString;
	}

	public String putTogether(String s1, String s2) {
		return s1 + " " + s2;
	}

	public boolean validateString(String string) {
		boolean goodString;
		if (string.equalsIgnoreCase("y") || string.equalsIgnoreCase("n")) {
			goodString = true;
		}
		else {
			goodString = false;
		}
		return goodString;
	}

	public int countVowels(String string) {
		int count = 0;
		string = string.toLowerCase();

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a') {
				count++;
			}
			else if (string.charAt(i) == 'e') {
				count++;
			}
			else if (string.charAt(i) == 'i') {
				count++;
			}
			else if (string.charAt(i) == 'o') {
				count++;
			}
			else if (string.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public int countCharactersInString(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			count++;
		}
		return count;
	}

	public int CountSpecifiedLetterInString(String string, char letter) {
		int count = 0;
		string = string.toLowerCase(); // making sure that lower case and upper case letters are treated the same.

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}

	public String newLetterReplaceOldInString(String string, char oldLetter, char newLetter) {     
		string = string.toLowerCase();
		string = string.replace(oldLetter, newLetter); // replaces the old letter with the new letter in the string.
		return string;
	}

	/////////////////////////////////////////////

	public static void main(String[] args) { 
		ImplementProcessStringsAndModify process = new ImplementProcessStringsAndModify();
		System.out.println(process.reverseString("Melanie"));
		System.out.println(process.putTogether("Melanie", "***REMOVED***"));
		System.out.println(process.reverseString(process.putTogether("Melanie", "***REMOVED***")));
		System.out.println(process.validateString("Y"));
		System.out.println(process.countVowels("I am definitely aiming for another A"));
		System.out.println(process.countCharactersInString("This sentence has fifty characters included spaces"));
		System.out.println(process.CountSpecifiedLetterInString("HOw are yOu today?", 'o'));
		System.out.println(process.newLetterReplaceOldInString("Open the doOr", 'o', 'z'));
	}
}