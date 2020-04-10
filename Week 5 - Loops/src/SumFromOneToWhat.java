import java.util.Scanner;

public class SumFromOneToWhat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Write an int number: ");
		int number = scan.nextInt();
		int sum = 0;
		int i = 1;

		while (i <= number) {
			sum = sum + i; //or sum += i
			i++;
		}
		System.out.println("The sum is: " + sum);
		scan.close();
	}
}