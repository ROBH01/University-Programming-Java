/**
 * @name [Robert Giurgiulescu]
 * @id number [4820793]
 * Date: [05/10/2017]
 * Week 12
 * 
 * This program displays true or false whether a name in one string meet
 * the following conditions: The string contains an "e", 
 * ends with ".jpg", and starts with "P".
 */

public class UsingStrings {

	public static void main(String[] args) {
		String example = "Power.aac"; // Whatever is written in this string example, the program will output true or false whether the conditions specified are met.

		System.out.println("The string starts with letter \"P\":" + "  " + example.startsWith("P")); 
		System.out.println("The string ends with \".jpg\": " + "       " + example.endsWith(".jpg"));
		System.out.println("The string contains letter \"e\": " + "    " + example.contains("e"));
	}
}