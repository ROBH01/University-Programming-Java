
public class ExampleForLoop {

	public static void main(String[] args) {
		int number = 5;

	for (int count = 1; count <= 10; count++) { // loops a specific number of times (12 here) works well with arrays
			System.out.println(count * number);
		}
		System.out.println(number + " times table finished");
	}
}