/** 
 * @name [Robert Giurgiulescu]
 * @id number [4820793]
 * Date: [18/10/2017]
 * Week 
 * 
 * This program displays true or false whether a name in one string meet
 * the following conditions: The string contains an "e", 
 * ends with ".jpg", and starts with "P".
 */

import java.io.File;
import java.util.Scanner;

public class AverageTemperatureForAWeek {

	public static void main(String[] args) throws Exception {
		File temperaturesInOneWeek = new File("TemperaturesInOneWeek.txt");
		Scanner fileScan = new Scanner(temperaturesInOneWeek);

		int monday = fileScan.nextInt();
		System.out.println("Monday:    " + monday);

		int tuesday = fileScan.nextInt();
		System.out.println("Tuesday:   " + tuesday);

		int wednesday = fileScan.nextInt();
		System.out.println("Wednesday: " + wednesday);

		int thursday = fileScan.nextInt();
		System.out.println("Thursday:  " + thursday);

		int friday = fileScan.nextInt();
		System.out.println("Friday:    " + friday);

		int saturday = fileScan.nextInt();
		System.out.println("Saturday:  " + saturday);

		int sunday = fileScan.nextInt();
		System.out.println("Sunday:    " + sunday);

		System.out.println();
		System.out.println("The average temperature is: " + String.format("%,.1f", ((double)(monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7)) + "°C");

		fileScan.close();
	}
}