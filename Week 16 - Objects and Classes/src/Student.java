
/**
 * @author Robert Giurgiulescu
 * @version 1
 */

public class Student {
	private String name, homeAddress, termAddress, courseName, DOB;
	private int courseFees;
	private char gender;

	/**
	 * This constructor creates a generic Student with no additional information
	 */
	Student() {  }

	/**
	 * This constructor creates a Student with the following information: <code>name</code>, <code>homeAddress</code>,
	 *  <code>termAddress</code>, <code>courseName</code>, <code>courseFees</code>, <code>DOB</code> and <code>gender</code>,
	 * @param name Student's name
	 * @param homeAddress Student's home address
	 * @param termAddress Student's term address
	 * @param courseName Student's course name
	 * @param courseFees Student's course fees
	 * @param DOB Student's DOB
	 * @param gender Student's gender
	 */
	Student(String name, String homeAddress, String termAddress, String courseName, int courseFees, String DOB, char gender) {
		this.name = name;
		this.homeAddress = homeAddress;
		this.termAddress = termAddress;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.DOB = DOB;
		this.gender = gender;
	}

	/**
	 * This method return Student's name
	 * @return name Student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method return Student's home address
	 * @return homeAddress Student's home address
	 */
	public String getHomeAddress() {
		return homeAddress;
	}

	/**
	 * This method return Student's term address
	 * @return termAddress Student's term address
	 */
	public String getTermAddress() {
		return termAddress;
	}

	/**
	 * This method return Student's course name
	 * @return courseName Student's course name
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * This method return Student's course fees
	 * @return courseFees Student's course fees
	 */
	public int getCourseFees() {
		return courseFees;
	}

	/**
	 * This method return Student's date of birth
	 * @return DOB Student's date of birth
	 */
	public String getDOB() {
		return DOB;
	}

	/**
	 * This method return Student's gender
	 * @return gender Student's gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * This method modify Student's name
	 * @param name Student's name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method modify Student's home address
	 * @param homeAddress Students home address
	 */
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * This method modify Student's term address
	 * @param termAddress Student's term address
	 */
	public void setTermAddress(String termAddress) {
		this.termAddress = termAddress;
	}

	/**
	 * This method modify Student's course name
	 * @param courseName Student's course name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * This method modify Student's course fees
	 * @param courseFees Student's fees
	 */
	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	/**
	 * This method modify Student's date of birth
	 * @param DOB Student's date of birth
	 */
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	/**
	 * This method modify Student's gender
	 * @param gender Student's gender
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * This method returns a String containing information about the Student
	 */
	public String toString() {
		return "Student \nName = " + name + "\nHome Address = " + homeAddress + "\nTerm Address = " + termAddress
				+ "\nCourse Name = " + courseName + "\nDate of Birth = " + DOB + "\nCourse Fees = £" +courseFees+
				"\nGender = " + gender+"\n/////////end//////////";
	}
}
