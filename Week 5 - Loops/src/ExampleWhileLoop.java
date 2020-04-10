
public class ExampleWhileLoop {

	public static void main(String[] args) {
		int count = 1; // starts from 1 until reaches 12
		int number = 7; // 7 multiplies 1 then 2 then 3 and so on until 12.

		while (count <= 12) {
			System.out.println(count * number);
			count++;
		}
		System.out.println(number + " times table finished");
	}
}