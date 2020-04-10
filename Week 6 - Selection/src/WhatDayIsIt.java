import java.util.Scanner;

public class WhatDayIsIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.println();
		System.out.print("Enter the day number: ");
		int choice = scan.nextInt();
		
		while (choice < 1 || choice > 7) {
			System.out.print("Invalid choice, please select a number from 1 to 7: ");
			choice = scan.nextInt();
		}
		System.out.println("\nToday is:");
		
		switch (choice) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		scan.close();
	}
}