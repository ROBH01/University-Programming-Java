import java.util.ArrayList;

public class StoreStudents {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Student student1 = new Student();
		students.add(student1);
		Student student2 = new Student("Robert", "Rome", "Bournemouth", "SE", 9250, "25/08/1970", 'M');
		students.add(student2);
		Student student3 = new Student();
		students.add(student3);
		Student student4 = new Student("Sam", "London", "Bournemouth", "Software Engineering", 9250, "4/04/1992", 'M');
		students.add(student4);
		
		for (Student student : students) {
			System.out.println(student);
		}		
	}
}
