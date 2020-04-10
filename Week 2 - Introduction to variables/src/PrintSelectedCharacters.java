
public class PrintSelectedCharacters {

	public static void main(String[] args) {
		String name = "Melanie";
		System.out.println(name.substring(2, 3)); // here prints the 3rd char
		System.out.println(name.substring(3, 4)); // name.substring() is used to display one char defined by the number chosen. here prints the 4th char
		System.out.println(name.substring(4, 5)); // here prints the 5th char
	}
}