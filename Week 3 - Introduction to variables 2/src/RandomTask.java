import java.util.Arrays;
import java.util.Scanner;

public class RandomTask {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int[] numbers = new int [5];
		
	    System.out.print("Please enter your first number : ");
		numbers[0] = scan.nextInt();
		
		System.out.print("Please enter your second number : ");
		numbers[1] = scan.nextInt();
		
		System.out.print("Please enter your third number : ");
		numbers[2] = scan.nextInt();
		
		System.out.print("Please enter your fourth number : ");
		numbers[3] = scan.nextInt();
		
		System.out.print("Please enter your fifth number : ");
		numbers[4] = scan.nextInt();
  
		System.out.println("Content of the array : " + Arrays.toString(numbers));	
		scan.close();		
	}
}