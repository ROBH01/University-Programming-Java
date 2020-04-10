import java.util.Scanner;

public class SpeedingTicket6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speedLimit;
		int carSpeed;
		int warning = 4;
		int fine1 = 10;
		int fine2 = 15;
		int fine3 = 20;
		System.out.print("Enter speed limit: ");
		speedLimit = scan.nextInt();
		
		System.out.print("Enter car speed: ");
		carSpeed = scan.nextInt();

		if (carSpeed <= speedLimit) {
			System.out.print("Under the speed limit - no fine.");
		}
		else if (carSpeed <= speedLimit + warning) {
			System.out.print("Over the speed limit, please be careful of your speed in future");
		}
		else if (carSpeed < speedLimit + fine1) {
			System.out.print("5 miles or more over limit, fined £50");
		}
		else if (carSpeed < speedLimit + fine2) {
			System.out.print(fine1 + " miles or more over limit, fined £100");
		}
		else if (carSpeed < speedLimit + fine3) {
			System.out.print(fine2 + " miles or more over limit, fined £150 and 3 points");
		}
		else {
			System.out.print(fine3 + " miles or more over limit, fined £1000 and disqualified");
		}
		scan.close();
	}
}