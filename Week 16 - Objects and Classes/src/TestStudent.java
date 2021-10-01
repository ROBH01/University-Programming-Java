
public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("Robert", "Rome", "Bournemouth", "FCS", 9250, "25/08/1970", 'M');
		System.out.println(student2.toString());
		System.out.println(student1.toString());
	}
}