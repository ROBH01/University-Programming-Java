
public class UniversityPeopleTest {

	public static void main(String[] args) {
		Staff staff1 = new Staff("Gernie", "Bournemouth", "07855488488", "BH55485", "Lecturer", 40000);
		Students student1 = new Students("Robert", "G", "07811455884", "s4820793", "FCS");
		Alumni alumni1 = new Alumni("Gabriel", "Ardwell", "07784455454", 2015, "FCS", "First");
		
		System.out.println(staff1.getName() + " £" + staff1.getSalary());
		System.out.println(student1.getName() + " " + student1.getStudentCourse());
		System.out.println(alumni1.getName() + " " + alumni1.getYearGraduated());
	}
}