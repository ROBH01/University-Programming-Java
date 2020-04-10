/**
 * @name [Robert Giurgiulescu]
 * @id number [4820793]
 * Date: [05/10/2017]
 * Week 12
 * 
 * This program displays one digit per line in reverse order 
 * using the integer from a digit number stored in one INT only.
 */

public class ReverseInteger {

	public static void main(String[] args) {
		int year = 2014;
		int fourthDigit = year % 10; // 2014 - 10 * (2014 / 10) = 2014 - 10 * 201 >>> 2014 - 2010 = 4.
		int thirdDigit = (year / 10) % 10; // we divide the year by 10 to get 201.4: 201 % 10 results to be 1.
		int secondDigit = (year / 100) % 10; // same calculations but the dividend (year / 100).
		int firstDigit = (year / 1000) % 10; 

		System.out.println("Fourth character: " + fourthDigit);
		System.out.println("Third character:  " + thirdDigit); 
		System.out.println("Second character: " + secondDigit);
		System.out.println("First character:  " + firstDigit);
	}
}