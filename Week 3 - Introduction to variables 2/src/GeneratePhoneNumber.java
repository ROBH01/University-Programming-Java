import java.util.Random;

public class GeneratePhoneNumber {

	public static void main(String[] args) {
		Random numbers = new Random();
		int hundred = 100;
		int thousand = 1000;

		int firstPart = numbers.nextInt(6) * 100 + numbers.nextInt(7) * 10 + numbers.nextInt(7) + hundred; 
		int secondPart = numbers.nextInt(555) + hundred; // Does not go over 655
		int thirdPart = numbers.nextInt(8999) + thousand;

		System.out.println("The telephone number is: " + firstPart + "-" + secondPart + "-" + thirdPart);
	}
}