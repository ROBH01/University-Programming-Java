import java.util.Scanner;

public class ReverseTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the amount of seconds: ");
		int seconds = scan.nextInt();
		
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		seconds = seconds % 60;
		System.out.println("The amount of hours, minutes and seconds are: " + String.format("%02d:%02d:%02d", hours, minutes, seconds)); 		
		scan.close();
	}
}