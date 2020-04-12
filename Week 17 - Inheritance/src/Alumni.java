
public class Alumni extends UniversityPeople {
	private int yearGraduated;
	private String courseTitle, classification;
	
	Alumni(String name, String address, String phoneNumber, int yearGraduated, String courseTitle, String classification) {
		super(name, address, phoneNumber);
		this.yearGraduated = yearGraduated;
		this.courseTitle = courseTitle;
		this.classification = classification;
	}
	
	int getYearGraduated() {
		return yearGraduated;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	
	public String getClassification() {
		return classification;
	}
	
	public void setYearGraduated(int yearGraduated) {
		this.yearGraduated = yearGraduated;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public void setClassification(String classification) {
		this.classification = classification;
	}
}
