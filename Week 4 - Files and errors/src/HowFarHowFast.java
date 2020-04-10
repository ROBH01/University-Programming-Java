import java.util.Scanner;

public class HowFarHowFast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double distanceKm;

		System.out.print("Enter the speed in km/h: ");
		double speedKm = scan.nextDouble();

		System.out.print("Enter the time in h: ");
		int timeHour = scan.nextInt();

		double distanceTravelled = speedKm * timeHour;

		System.out.print("Distance travelled: " + distanceTravelled + " Km");
		System.out.print("\nNow press 1 to reverse the calculation or 2 to quit: ");
		int decision = scan.nextInt();

		if (decision == 1) {
			System.out.print("\nEnter the time in h: ");
			timeHour = scan.nextInt();

			System.out.print("Enter the distance in km: ");
			distanceKm = scan.nextDouble();

			double speedNecessary = distanceKm / timeHour;
			System.out.println("In order to cover this distance in the specified time, you would have to travel at a speed of: " + speedNecessary + " Km/h");
		}
		else if (decision == 2) {
			System.out.println("\nThank you for using the program");
			System.exit(0);
		}	
		scan.close();
	}
}