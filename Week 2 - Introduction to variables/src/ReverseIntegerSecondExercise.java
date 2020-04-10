
public class ReverseIntegerSecondExercise {

	public static void main(String[] args) {	
		int year = 2017;
		int fourthDigit = (year) % 10;
		int thirdDigit = (year / 10) % 10;
		int secondDigit = (year / 100) % 10;
		int firstDigit = (year / 1000) % 10;

		System.out.println(fourthDigit);
		System.out.println(thirdDigit); 
		System.out.println(secondDigit);
		System.out.println(firstDigit);	
	}
}