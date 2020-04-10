import java.util.Scanner;

public class TimeInSeconds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter amount of hours: ");
		int hours = scan.nextInt();

		System.out.print("Enter amount of minutes: ");
		int minutes = scan.nextInt();

		System.out.print("Enter amount of seconds: ");
		int seconds = scan.nextInt();

		int hoursInSeconds = hours * 3600;
		int minutesInSeconds = minutes * 60;
		System.out.println("The equivalent total in seconds is: " + (hoursInSeconds + minutesInSeconds + seconds));
		scan.close();
	}
}