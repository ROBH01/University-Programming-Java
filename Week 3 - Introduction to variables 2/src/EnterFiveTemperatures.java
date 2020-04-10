/**
 * @name [Robert Giurgiulescu]
 * @id number [4820793]
 * Date: [16/10/2017]
 * Week 13
 * 
 * This program asks the user to enter 5 Fahrenheit temperatures.
 * They are stored in an array and then original Fahrenheit 
 * temperature and converted temperature to Celsius are displayed.
 */

import java.util.Scanner;

public class EnterFiveTemperatures {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] temperatures = new int[5];
		System.out.println("Enter five Fahrenheit temperatures to be converted: ");
		temperatures[0] = scan.nextInt();
		temperatures[1] = scan.nextInt();
		temperatures[2] = scan.nextInt();
		temperatures[3] = scan.nextInt();
		temperatures[4] = scan.nextInt();

		scan.close();
		System.out.println();
		System.out.println("Original and converted temperatures:  \n\n°F     °C");
		System.out.println(temperatures[0] + "     " + ((temperatures[0]) - 32) / 1.8); 
		System.out.println(temperatures[1] + "     " + ((temperatures[1]) - 32) / 1.8);
		System.out.println(temperatures[2] + "     " + ((temperatures[2]) - 32) / 1.8);
		System.out.println(temperatures[3] + "     " + ((temperatures[3]) - 32) / 1.8);
		System.out.println(temperatures[4] + "     " + ((temperatures[4]) - 32) / 1.8);
	}
}