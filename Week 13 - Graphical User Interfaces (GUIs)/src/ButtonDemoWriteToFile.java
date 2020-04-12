import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ButtonDemoWriteToFile {
	private String name;
	private String address;
	private String course;
	private String phone;


	ButtonDemoWriteToFile(String name, String address, String course, String phone) {
		this.name = name;
		this.address = address;
		this.course = course;
		this.phone = phone;
	}

	void writeToFile() {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Student.txt")));
			out.println("Student information:\n");
			out.println("Name:     " + name);
			out.println("Address:  " + address);
			out.println("Course:   " + course);
			out.print("Phone:    " + phone);
			out.close(); 
		} catch (IOException ex) {
			System.err.println("An error has occured");
		}
	}
}