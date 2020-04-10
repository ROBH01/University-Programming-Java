import java.util.Scanner;

public class ExaminationGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a grade: ");
		int grade = scan.nextInt();

		if (grade < 0) {
			System.out.println("Invalid mark");
		}
		else if (grade < 40) {
			System.out.println("FAILED");
		}
		else if (grade < 50) {
			System.out.println("3rd");
		}
		else if (grade < 60) {
			System.out.println("2:2");
		}
		else if (grade < 70) {
			System.out.println("2:1");
		}
		else if (grade <= 100) {
			System.out.println("1st");
		}
		else {
			System.out.println("Invalid mark");
		}
		scan.close();	
	}
}