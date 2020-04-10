import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysAndArrayLists {
	ArrayList<Integer> grades = new ArrayList<>(); // made it global to all methods cause I will need it

	public void ReadMarksAndStoreFromFile() {
		try {
			File myFile = new File("StudentMarks.txt");
			Scanner scan = new Scanner(myFile);

			while (scan.hasNext()) {
				if (scan.hasNextInt()) {
					int number = scan.nextInt();
					grades.add(number);
				}
				else {
					scan.next();
				}
			}
			System.out.println("Grades are: " + grades);
			scan.close();
		}
		catch (FileNotFoundException ex) {
			System.err.println("File not found, make sure the name of the file is correct.");
		}
	}

	public void SortArrayOfMarks() {
		Collections.sort(grades);
		System.out.println("Grades sorted, lower first: " + grades);
	}

	public void ReverseArrayOfMarks() {
		Collections.reverse(grades);
		System.out.println("Grades sorted, higher first: " + grades);
	}

	public void MarksAndAssociatedGrade() {
		for (int i = 0; i < grades.size(); i++) {
			int grade = grades.get(i);

			if (grade >= 0 && grade < 40) {
				System.out.println(grade + " is a Fail");
			}
			else if (grade >= 40 && grade < 50) {
				System.out.println(grade + " is a 3rd");
			}
			else if (grade >= 50 && grade < 60) {
				System.out.println(grade + " is a 2:2");
			}
			else if (grade >= 60 && grade < 70) {
				System.out.println(grade + " is a 2:1");
			}
			else if (grade >= 70 && grade <= 100) {
				System.out.println(grade + " is a 1st");
			}
			else {
				System.out.println("Grade not valid (" + grade + ")");
			}
		}
	}


	public static void main(String[] args) {
		ArraysAndArrayLists process = new ArraysAndArrayLists();
		process.ReadMarksAndStoreFromFile();
		System.out.println();
		process.SortArrayOfMarks();
		process.MarksAndAssociatedGrade();
		System.out.println();
		process.ReverseArrayOfMarks();
		process.MarksAndAssociatedGrade();
	}
}
