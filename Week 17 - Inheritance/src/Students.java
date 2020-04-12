
class Students extends UniversityPeople {
	private String studentID, studentCourse;
	
	Students(String name, String address, String phoneNumber, String studentID, String studentCourse) {
		super(name, address, phoneNumber);
		this.studentID = studentID;
		this.studentCourse = studentCourse;
	}
	
	String getStudentID() {
		return studentID;
	}
	
	String getStudentCourse() {
		return studentCourse;
	}
	
	void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
}
