/**
 * @name Robert Giurgiulescu
 * @id number 4820793
 * Date: 08/12/2017
 * Week 21
 * Task number 2
 * 
 * This program generates random numbers. 
 * The first method simply returns an integer number from 1 to 100.
 * The second method returns an integer number between 1 and a specified number.
 * The third method returns an integer number between the lowest specified number and the highest specified number.
 * The fourth method returns 10 integer numbers which are different one from each other. 
 */

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberGenerator {
	Random rand = new Random();
	
	public int randomFrom1To100() {
		int randomInteger = rand.nextInt(100) + 1;
		return randomInteger;
	}

	public int randomFrom1ToTopNumber(int topNumber) { 
		int randomInteger = rand.nextInt(topNumber) + 1;
		return randomInteger;	
	}

	public int randomRangeFromLowToHigh(int lowest, int highest) {
		int randomInteger = rand.nextInt((highest - lowest) + 1) + lowest;
		return randomInteger;
	}

	public ArrayList<Integer> arr10RandNumbersNoDuplication() {
		ArrayList<Integer> list = new ArrayList<Integer>(); // is used when the dimension of the data is unknown, however I have used it because it solves the task much more efficiently
		int[] numbers = new int[10];

		while (list.size() < numbers.length) {
			int random = rand.nextInt(10); // inserted 10 because it's easier to see that there are no duplicates.
			if (!list.contains(random)) {
				list.add(random);
			}
		}
		return list;
	}


	public static void main(String[] args) {
		RandomNumberGenerator process = new RandomNumberGenerator();
		System.out.println("Random number from 1 to 100: " + process.randomFrom1To100());
		System.out.println("Integer number from 1 top number: " + process.randomFrom1ToTopNumber(10));
		System.out.println("Range from low to high number: " + process.randomRangeFromLowToHigh(10, 20));
		System.out.println(process.arr10RandNumbersNoDuplication());
	}
}
