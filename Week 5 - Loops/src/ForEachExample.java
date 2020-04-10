import java.util.Scanner;

public class ForEachExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] players = {"Sam", "Marco", "Rob"}; 

		for (String player:players) { // FOR EACH is used when you have an array with data in.
			System.out.println(player); // FOR is used when you have an array without data in, but just spaces []
		}
		scan.close();
	}
}