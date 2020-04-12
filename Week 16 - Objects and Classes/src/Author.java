/**
 * @author Robert Giurgiulescu
 * @version 1
 */

public class Author {
	private String firstName, lastName, nationality;

	/**
	 * Constructor which creates a generic Author without any additional details
	 */
	public Author() {  }

	/**
	 * Constructor which creates an Author including the following details: <code>firstName</code>, <code>lastName</code> and <code>nationality</code>
	 * @param firstName Author name
	 * @param lastName  Author surname
	 * @param nationality Author nationality
	 */
	Author(String firstName, String lastName, String nationality) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
	}

	/**
	 * Method that returns the <code>firstName</code> of the Author
	 * @return firstName
	 */
	String getFirstName() {
		return firstName;
	}

	/**
	 * Method that returns the <code>lastName</code> of the Author
	 * @return <code>lastName</code>
	 */
	String getLastName() {
		return lastName;
	}

	/**
	 * Method that returns the <code>nationality</code> of the Author
	 * @return <code>nationality</code>
	 */
	String getNationality() {
		return nationality;
	}

	/**
	 * Method that modify the <code>firstName</code> of the Author
	 * @param firstName Author first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Method that modify the <code>lastName</code> of the Author
	 * @param lastName Author last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Method that modify the <code>nationality</code> of the Author
	 * @param nationality Author nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
