
public class Percentage {

	public static void main(String[] args) {
		int marksAchieved = 36;
		int fullMarks = 50;
		double percent = marksAchieved * 100.0 / fullMarks;
		System.out.println("The percentage grade is: " + String.format("%,.2f", percent) + "%");
	}
}